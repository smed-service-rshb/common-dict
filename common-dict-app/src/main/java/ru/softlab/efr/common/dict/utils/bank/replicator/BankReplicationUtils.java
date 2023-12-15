package ru.softlab.efr.common.dict.utils.bank.replicator;

import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorConstants.*;

/**
 * Вспомогательный класс для работы с банками
 *
 * @author egorov
 * @since 24.04.2017.
 */
public class BankReplicationUtils {

    /**
     * Получить адрес банка в формате почтовый_индекс, субъект_РФ, тип_нп. НП, улица
     *
     * @param values  - мапа &lt;имя_поля, значение_поля&gt; для конкретного банка
     * @param regDict - справочник регионов
     * @param tnpDict - справочник tnp
     * @return адрес в формате почтовый_индекс, субъект_РФ, тип_нп. НП, улица
     */
    public static String getAddress(Map<String, Object> values, Map<String, String> regDict, Map<String, String> tnpDict) {
        String ind = (String) values.get(IND_FIELD_NAME);
        String rgn = (String) values.get(RGN_FIELD_NAME);
        String tnp = (String) values.get(TNP_FIELD_NAME);
        String nnp = (String) values.get(NNP_FIELD_NAME);
        String adr = (String) values.get(ADR_FIELD_NAME);
        String rgnName = regDict.get(rgn);
        String tnpShortName = tnpDict.get(tnp);
        return ind + ", " + (!rgn.equals("00") ? rgnName + ", " : "") + tnpShortName + ". " + nnp + ", " + adr;
    }

    /**
     * Определить, является ли банк удалённым
     *
     * @param values - мапа &lt;имя_поля, значение_поля&gt; для конкретного банка
     * @return признак удлаления банка
     */
    public static boolean isDeleted(Map<String, Object> values) {
        /*
            if ((DATE_CH - пустое или указанная дата ещё не наступила) AND (Статус банка in ("", "ИНФО", "ПРИС"))) - банк активный
            иначе - нет
        */
        String status = (String) values.get(STATUS_FIELD_NAME);
        Set<String> activeStatuses = new HashSet<>();
        activeStatuses.add(ACTIVE_STATUS_BANK_1);
        activeStatuses.add(ACTIVE_STATUS_BANK_2);
        Date dateChange = (Date) values.get(DATE_FIELD_NAME);
        if ((dateChange == null
                || dateChange.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isAfter(LocalDate.now()))
                && (StringUtils.isEmpty(status)
                || activeStatuses.contains(status))) {
            return false;
        } else {
            return true;
        }
    }

}
