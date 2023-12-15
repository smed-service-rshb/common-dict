package ru.softlab.efr.common.dict.utils.dict;

import org.jamel.dbf.processor.DbfProcessor;
import org.jamel.dbf.utils.DbfUtils;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.model.TerroristEntity;
import ru.softlab.efr.common.dict.utils.AppUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Загрузчик-парсер DBF файла с информацией о экстремистах/террористах
 *
 * @author olshansky
 * @since 14.09.2018.
 */
public class TerroristDBFReader {

    private static final String ORGANIZATION_TERRORIST_CODE = "1.0";
    private static final String INDIVIDUAL_TERRORIST_CODE = "3.0";
    private static final String DETACHED_PART_TERRORIST_CODE = "0.0";
    private static final String MORE_DATA_EXISTS_REGEX_PATTERN = "\\((.*)\\)";

    private static final Integer PERSONNEL_NUMBER_CELL_NUMBER = 0;
    private static final Integer UNIT_TYPE_CELL_NUMBER = 2;
    private static final Integer PASSPORT_SERIES_CELL_NUMBER = 10;
    private static final Integer PASSPORT_NUMBER_CELL_NUMBER = 11;
    private static final Integer BIRTH_DATE_CELL_NUMBER = 14;
    private static final Integer BIRTH_YEAR_CELL_NUMBER = 15;
    private static final Integer BIRTH_ADDRESS_CELL_NUMBER = 16;
    private static final Integer LIVE_ADDRESS_CELL_NUMBER = 8;
    private static final Integer FULL_NAME_CELL_NUMBER = 3;

    /**
     * Осуществление загрузки и нормализации справочника экстремистов / террористов
     */
    public List<TerroristEntity> getTerroristFromDBF(String path, MultipartFile frontFile, long version) throws IOException {
        List<TerroristEntity> terrorists = new ArrayList<>();
        List<TerroristEntity> synonymTerroristEntities = new ArrayList<>();


        List<TerroristEntity> mainPartTerroristEntityList;
        List<TerroristEntity> detachedPartTerroristEntityList;

        if (frontFile != null) {
            /*STAGE 1: ADD ALL INDIVIDUAL TERRORISTS*/
            mainPartTerroristEntityList = DbfProcessor.loadData(frontFile.getInputStream(),
                    (Object[] row) -> parse(row, INDIVIDUAL_TERRORIST_CODE)
            ).stream().filter(f -> f != null && f.getPersonnelNumber() != null).collect(Collectors.toList());

            /*STAGE 2: ADD ALL DETACHED PART OF TERRORIST RECORD*/
            detachedPartTerroristEntityList = DbfProcessor.loadData(frontFile.getInputStream(), (Object[] row) ->
                    parse(row, DETACHED_PART_TERRORIST_CODE)
            ).stream().filter(f -> f != null && f.getPersonnelNumber() != null)
                    .filter(distinctByKey(TerroristEntity::getLastName)).collect(Collectors.toList());
        } else {

            File dbf = new File(path);

            /*STAGE 1: ADD ALL INDIVIDUAL TERRORISTS*/
            mainPartTerroristEntityList = DbfProcessor.loadData(dbf,
                    (Object[] row) -> parse(row, INDIVIDUAL_TERRORIST_CODE)
            ).stream().filter(f -> f != null && f.getPersonnelNumber() != null).collect(Collectors.toList());

            /*STAGE 2: ADD ALL DETACHED PART OF TERRORIST RECORD*/
            detachedPartTerroristEntityList = DbfProcessor.loadData(dbf, (Object[] row) ->
                    parse(row, DETACHED_PART_TERRORIST_CODE)
            ).stream().filter(f -> f != null && f.getPersonnelNumber() != null)
                    .filter(distinctByKey(TerroristEntity::getLastName)).collect(Collectors.toList());
        }

        /*STAGE 3: JOIN DETACHED PARTS */
        detachedPartTerroristEntityList.parallelStream().forEach(splittedPart -> {

            boolean isExistMainPart = mainPartTerroristEntityList.parallelStream().anyMatch(element ->
                    element != null
                            && element.getPersonnelNumber() != null
                            && element.getPersonnelNumber().equals(splittedPart.getPersonnelNumber())
            );

            TerroristEntity terrorist = null;

            if (isExistMainPart && splittedPart.getLastName() != null) {
                terrorist = mainPartTerroristEntityList.parallelStream().filter(element ->
                        element != null
                                && element.getPersonnelNumber() != null
                                && element.getPersonnelNumber().equals(splittedPart.getPersonnelNumber())
                ).findFirst().get();
                terrorist.setLastName(terrorist.getLastName().concat(splittedPart.getLastName()));
            }
        });

        /*STAGE 4: DUPLICATION RECORDS, IF MANY NAME IN ONE RECORD */
        List<TerroristEntity> parsedTerroristEntities = mainPartTerroristEntityList.stream()
                .filter(f -> f != null && f.getPersonnelNumber() != null).map(terrorist -> {

                    String fullName = terrorist.getLastName();
                    if (fullName.contains("(") && fullName.contains(")")) {
                        Pattern pattern = Pattern.compile(MORE_DATA_EXISTS_REGEX_PATTERN, Pattern.CASE_INSENSITIVE);
                        Matcher matcher = pattern.matcher(fullName);

                        if (matcher.find()) {
                            Arrays.asList(matcher.group(1).trim().split("; ")).forEach(f -> {
                                fillSynonyms(synonymTerroristEntities, terrorist, f);
                            });
                            fillName(terrorist, fullName.replace(matcher.group(0), ""));
                        }
                        return terrorist;
                    } else {
                        if (fullName.contains(";")) {
                            Arrays.asList(fullName.split("; ")).forEach(f -> {
                                fillSynonyms(synonymTerroristEntities, terrorist, f);
                            });
                        } else {
                            fillName(terrorist, fullName);
                            return terrorist;
                        }
                    }
                    return null;
                }).collect(Collectors.toList());


        terrorists.addAll(synonymTerroristEntities);
        terrorists.addAll(parsedTerroristEntities);
        terrorists = terrorists.stream().filter(f -> f != null && f.getPersonnelNumber() != null).collect(Collectors.toList());
        terrorists.forEach(f->f.setVersion(version));
        return terrorists.stream().sorted(Comparator.comparing(TerroristEntity::getPersonnelNumber)).collect(Collectors.toList());
    }

    private void fillSynonyms(List<TerroristEntity> synonymTerroristEntities, TerroristEntity terrorist, String f) {
        if (f.split(" ").length > 1) {
            TerroristEntity synonymTerroristEntity = new TerroristEntity();
            AppUtils.mapSimilarObjects(terrorist, synonymTerroristEntity);
            synonymTerroristEntities.add(fillName(synonymTerroristEntity, f));
        }
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    private TerroristEntity parse(Object[] row, String typeOfRecord) {
        String unitType = String.valueOf(row[UNIT_TYPE_CELL_NUMBER]);
        if (unitType.contains(typeOfRecord)) {
            TerroristEntity terrorist = new TerroristEntity();
            terrorist.setPersonnelNumber(Long.valueOf(getStringFromCell(row[PERSONNEL_NUMBER_CELL_NUMBER])
                    + String.valueOf(row[UNIT_TYPE_CELL_NUMBER]).substring(0,1)));
            terrorist.setBirthDate(getBirthDate(row));
            terrorist.setPassportSeries(getStringFromCell(row[PASSPORT_SERIES_CELL_NUMBER]));
            terrorist.setPassportNumber(getStringFromCell(row[PASSPORT_NUMBER_CELL_NUMBER]));
            terrorist.setBirthAddress(getStringFromCell(row[BIRTH_ADDRESS_CELL_NUMBER]));
            terrorist.setLiveAddress(getStringFromCell(row[LIVE_ADDRESS_CELL_NUMBER]));
            terrorist.setLastName(getStringFromCell(row[FULL_NAME_CELL_NUMBER]));
            return terrorist;
        }
        return null;
    }

    private static Date getBirthDate(Object[] row) {
        Date birthDate = (Date) row[BIRTH_DATE_CELL_NUMBER];
        LocalDate localBirthDate = AppUtils.mapDate2LocalDate(birthDate);
        String yearString = getStringFromCell(row[BIRTH_YEAR_CELL_NUMBER]);
        Integer yearInt = 0;
        if (AppUtils.isNotNullOrWhitespace(yearString)) {
            yearInt = Integer.valueOf(yearString);
        }

        if (isNotEmptyYearAndNotEqual(yearInt, localBirthDate)) {
            birthDate = getFirstDayOfYear(yearInt);
        } else if (isEmptyYearAndNotEqual(yearInt, localBirthDate)) {
            birthDate = null;
        }
        return birthDate;
    }

    private static String getStringFromCell(Object object) {
        return new String(DbfUtils.trimLeftSpaces((byte[]) object), Charset.forName("cp866")).toUpperCase();
    }

    private static Boolean isNotEmptyYearAndNotEqual(Integer year, LocalDate localDate) {
        return year != 0 && localDate.getYear() != year;
    }

    private static Boolean isEmptyYearAndNotEqual(Integer year, LocalDate localDate) {
        return year == 0 && localDate.getYear() != year;
    }

    private static Date getFirstDayOfYear(Integer year) {
        return AppUtils.mapLocalDate2Date(LocalDate.of(year, 1, 1));
    }

    private static TerroristEntity fillName(TerroristEntity terrorist, String fullName) {
        String[] nameParts = fullName.split(" ");
        String middleName = "";
        if (nameParts.length > 2) {
            StringBuilder sb = new StringBuilder();

            for (String s : Arrays.asList(nameParts).subList(2, nameParts.length)) {
                sb.append(s.trim());
                sb.append(" ");
            }
            middleName = sb.toString().toUpperCase().trim();
        }
        if (nameParts.length > 1) {
            terrorist.setLastName(nameParts[0].toUpperCase().trim());
            terrorist.setFirstName(nameParts[1].toUpperCase().trim());
        } else {
            terrorist.setLastName("");
            terrorist.setFirstName(nameParts[0].toUpperCase().trim());
            terrorist.setMiddleName("");
            return terrorist;
        }
        terrorist.setMiddleName(middleName);
        return terrorist;
    }

}
