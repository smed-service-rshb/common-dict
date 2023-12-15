package ru.softlab.efr.common.dict.utils.dict;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFReader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ru.softlab.efr.common.dict.utils.DBFUtils;
import ru.softlab.efr.common.dict.utils.DBFUtilsException;

import java.util.HashMap;
import java.util.Map;

import static ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorConstants.ERROR_FILE_READ_MESSAGE;
import static ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorConstants.FIELD_NOT_FOUND_MESSAGE;

/**
 * Загрузчик данных вспомогательных справочников
 *
 * @author egorov
 * @since 24.04.2017.
 */
abstract class DictLoader {

    private static final Log LOG = LogFactory.getLog(DictLoader.class);

    private String trim(String s) {
        if (s == null) {
            return null;
        } else {
            return s.trim();
        }
    }

    /**
     * Получить мапу &lt;имя_поля, значение_поля&gt; для вспомогательных справочников (регионов и типов населенных пунктов)
     *
     * @param fileDir - путь к файлам
     * @return мапу &lt;имя_поля, значение_поля&gt;
     * @throws DictLoaderException исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    public final Map<String, String> load(String fileDir) throws DictLoaderException {
        Map<String, String> result = new HashMap<>();
        try {
            DBFReader reader = DBFUtils.getReader(fileDir, getFileName());
            int recordCount = reader.getRecordCount();
            Integer keyFieldNumber = getNumberByFieldName(reader, getKeyFieldName());  //номер поля ключа
            Integer valueFieldNumber = getNumberByFieldName(reader, getValueFieldName()); //номер поля со значением
            if (keyFieldNumber == null) {
                LOG.error(String.format(FIELD_NOT_FOUND_MESSAGE, getKeyFieldName(), getFileName()));
                throw new DictLoaderException(String.format(FIELD_NOT_FOUND_MESSAGE, getKeyFieldName(), getFileName()));
            }
            if (valueFieldNumber == null) {
                LOG.error(String.format(FIELD_NOT_FOUND_MESSAGE, getValueFieldName(), getFileName()));
                throw new DictLoaderException(String.format(FIELD_NOT_FOUND_MESSAGE, getValueFieldName(), getFileName()));
            }
            for (int i = 1; i <= recordCount; i++) {
                Object[] record = reader.nextRecord();
                result.put(trim((String) record[keyFieldNumber]), trim((String) record[valueFieldNumber]));
            }
        } catch (DBFException e) {
            LOG.error(String.format(ERROR_FILE_READ_MESSAGE, getFileName()));
            throw new DictLoaderException(String.format(ERROR_FILE_READ_MESSAGE, getFileName()));
        } catch (DBFUtilsException e) {
            throw new DictLoaderException(e.getMessage());
        }
        return result;
    }

    private Integer getNumberByFieldName(DBFReader reader, String fieldName) throws DBFException {
        for (int i = 0; i < reader.getFieldCount(); i++) {
            if (reader.getField(i).getName().equalsIgnoreCase(fieldName)) return i;
        }
        return null;
    }

    protected abstract String getFileName();

    protected abstract String getKeyFieldName();

    protected abstract String getValueFieldName();

}
