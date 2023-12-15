package ru.softlab.efr.common.dict.utils.dict;

import static ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorConstants.*;

/**
 * @author egorov
 * @since 24.04.2017.
 */
public class TnpLoader extends DictLoader {

    @Override
    protected String getFileName() {
        return TNP_FILE;
    }

    @Override
    protected String getKeyFieldName() {
        return TNP_KEY_FIELD_NAME;
    }

    @Override
    protected String getValueFieldName() {
        return TNP_VALUE_FIELD_NAME;
    }

}
