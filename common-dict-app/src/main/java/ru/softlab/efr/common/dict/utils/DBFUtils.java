package ru.softlab.efr.common.dict.utils;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFReader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorConstants.*;

/**
 * Вспомогательный класс для работы с dbf-файлами
 *
 * @author egorov
 * @since 24.04.2017.
 */
public class DBFUtils {

    private static final Log LOG = LogFactory.getLog(DBFUtils.class);

    /**
     * Получить DBFReader для файла
     *
     * @param fileDir  - путь к деректории с файлами
     * @param fileName - имя файла
     * @return DBFReader для файла
     * @throws DBFUtilsException исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    public static DBFReader getReader(String fileDir, String fileName) throws DBFUtilsException {
        File file = new File(fileDir, fileName);
        return getReader(file);
    }

    /**
     * Получить DBFReader для файла
     *
     * @param file - файл
     * @return DBFReader для файла
     * @throws DBFUtilsException исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    public static DBFReader getReader(File file) throws DBFUtilsException {
        try {
            InputStream resourceBank = new FileInputStream(file);
            DBFReader reader = new DBFReader(resourceBank);
            reader.setCharactersetName(DICTIONARIES_ENCODING);
            return reader;
        } catch (FileNotFoundException e) {
            String message = String.format(FILE_NOT_FOUND_MESSAGE, file.getName());
            LOG.error(message);
            throw new DBFUtilsException(message);
        } catch (DBFException e) {
            String message = String.format(ERROR_FILE_READ_MESSAGE, file.getName());
            LOG.error(message);
            throw new DBFUtilsException(message);
        }
    }


    /**
     * Получить мапу &lt;имя_поля, значение_поля&gt; для записи из файла
     *
     * @param reader - DBFReader для фалйа
     * @param record - значение полей
     * @return мапа &lt;имя_поля, значение_поля&gt;
     * @throws DBFUtilsException исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    public static Map<String, Object> getValuesMap(DBFReader reader, Object[] record) throws DBFUtilsException {
        try {
            Map<String, Object> map = new HashMap<>();
            for (int i = 0; i < record.length; i++) {
                if (record[i] instanceof String) {
                    map.put(reader.getField(i).getName().toUpperCase(), ((String) record[i]).trim());
                } else {
                    map.put(reader.getField(i).getName().toUpperCase(), record[i]);
                }
            }
            return map;
        } catch (DBFException e) {
            LOG.error(e.getMessage());
            throw new DBFUtilsException(e.getMessage());
        }
    }
}
