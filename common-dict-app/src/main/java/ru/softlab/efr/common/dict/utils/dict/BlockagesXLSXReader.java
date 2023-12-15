package ru.softlab.efr.common.dict.utils.dict;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.softlab.efr.common.dict.model.BlockageEntity;

import java.io.FileInputStream;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Загрузчик-парсер XLSX файла с информацией о блокировках/заморозках
 * (начиная с 10.01.2019 не используется, заменён на BlockagesXMLReader)
 * @author olshansky
 * @since 17.09.2018.
 */
@Deprecated
public class BlockagesXLSXReader {

    private static final Integer PERSONNEL_NUMBER_CELL_NUMBER = 9;
    private static final Integer LAST_NAME_CELL_NUMBER = 13;
    private static final Integer FIRST_NAME_CELL_NUMBER = 14;
    private static final Integer MIDDLE_NAME_CELL_NUMBER = 15;
    private static final Integer BIRTH_DATE_CELL_NUMBER = 17;
    private static final Integer PASSPORT_SERIES_CELL_NUMBER = 23;
    private static final Integer PASSPORT_NUMBER_CELL_NUMBER = 24;

    public List<BlockageEntity> getBlockageListFromXLSX(String path) throws Exception {
        List<BlockageEntity> result = new ArrayList<>();

        try (XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(path))) {
            XSSFSheet myExcelSheet = myExcelBook.getSheetAt(0);

            Iterator<Row> rowIt = myExcelSheet.iterator();

            while (rowIt.hasNext()) {
                Row row = rowIt.next();
                if (row.getRowNum() > 0) {
                    BlockageEntity blockage = new BlockageEntity();
                    Double personnelNumber = row.getCell(PERSONNEL_NUMBER_CELL_NUMBER).getNumericCellValue();
                    blockage.setPersonnelNumber(personnelNumber.longValue());
                    blockage.setLastName(row.getCell(LAST_NAME_CELL_NUMBER).getStringCellValue());
                    blockage.setFirstName(row.getCell(FIRST_NAME_CELL_NUMBER).getStringCellValue());
                    blockage.setMiddleName(row.getCell(MIDDLE_NAME_CELL_NUMBER).getStringCellValue());
                    blockage.setBirthDate(row.getCell(BIRTH_DATE_CELL_NUMBER).getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    blockage.setPassportSeries(row.getCell(PASSPORT_SERIES_CELL_NUMBER).getStringCellValue());
                    blockage.setPassportNumber(row.getCell(PASSPORT_NUMBER_CELL_NUMBER).getStringCellValue());
                    result.add(blockage);
                }
            }
            myExcelBook.close();
            return result;
        }
    }
}
