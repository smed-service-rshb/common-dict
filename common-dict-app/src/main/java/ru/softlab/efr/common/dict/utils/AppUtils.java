package ru.softlab.efr.common.dict.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

/**
 * Класс вспомогательных методов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
public class AppUtils {

    /**
     * Проверить, содержит ли строка что-нибудь, кроме null или непечатаемых символов (табы, пробелы, etc.)
     *
     * @param s Строка
     * @return boolean
     */
    public static boolean isNullOrWhitespace(String s) {
        return s == null || s.isEmpty() || isWhitespace(s);
    }

    private static boolean isWhitespace(String s) {
        int length = s.length();
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isNotNullOrWhitespace(String s) {
        return s != null && !s.isEmpty() && !isWhitespace(s);
    }

    public static boolean isNotNullOrWhitespace(String... args) {
        return Arrays.stream(args).allMatch(AppUtils::isNotNullOrWhitespace);
    }

    public static boolean isNullOrWhitespace(String... args) {
        return Arrays.stream(args).allMatch(AppUtils::isNullOrWhitespace);
    }

    public static Object mapSimilarObjects(Object source, Object dest) {
        try {
            BeanUtils.copyProperties(dest, source);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Can't copy field to " + dest.getClass().getSimpleName(), e);
        }
        return dest;
    }

    public static LocalDate mapDate2LocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static Date mapLocalDate2Date(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private static boolean isLatinString(String input) {
        int countLatinChar = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentCharCode = Character.codePointAt(replaceCyrToLatSimilarLetters(input), i);
            if ((currentCharCode >= 65
                    && currentCharCode <= 90)
                    || (currentCharCode >= 97
                    && currentCharCode <= 122)) {
                countLatinChar++;
            }
        }
        int anotherLetters = input.length() - countLatinChar;
        return countLatinChar > anotherLetters;
    }

    private static boolean isCyrillicString(String input) {
        int countCyrillicChar = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentCharCode = Character.codePointAt(replaceLatToCyrSimilarLetters(input), i);
            if (currentCharCode >= 1040
                    && currentCharCode <= 1103
                    || currentCharCode == 1105
                    || currentCharCode == 1025) {
                countCyrillicChar++;
            }
        }
        int anotherLetters = input.length() - countCyrillicChar;
        return countCyrillicChar > anotherLetters;
    }

    private static String replaceCyrToLatSimilarLetters(String input) {
        return input.replaceAll("А", "A")
                .replaceAll("С", "C")
                .replaceAll("В", "B")
                .replaceAll("О", "O")
                .replaceAll("Н", "H")
                .replaceAll("Р", "P")
                .replaceAll("Х", "X")
                .replaceAll("М", "M")
                .replaceAll("К", "K")
                .replaceAll("Е", "E")
                .replaceAll("Т", "T")
                .replaceAll("У", "Y");
    }

    private static String replaceLatToCyrSimilarLetters(String input) {
        return input.replaceAll("A", "А")
                .replaceAll("C", "С")
                .replaceAll("B", "В")
                .replaceAll("O", "О")
                .replaceAll("H", "Н")
                .replaceAll("P", "Р")
                .replaceAll("X", "Х")
                .replaceAll("M", "М")
                .replaceAll("K", "К")
                .replaceAll("E", "Е")
                .replaceAll("T", "Т")
                .replaceAll("Y", "У")
                .replaceAll("Y", "У");
    }

    public static String harmonizationString(String input) {
        return StringUtils.isNotBlank(input) ?
                isCyrillicString(getTrimmedUpperCased(input)) ? replaceLatToCyrSimilarLetters(getTrimmedUpperCased(input)) :
                        isLatinString(getTrimmedUpperCased(input)) ? replaceCyrToLatSimilarLetters(getTrimmedUpperCased(input)) : getTrimmedUpperCased(input)
                : null;
    }

    private static String getTrimmedUpperCased(String input) {
        return input.trim().toUpperCase();
    }

}
