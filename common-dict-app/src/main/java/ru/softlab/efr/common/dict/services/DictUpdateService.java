package ru.softlab.efr.common.dict.services;

import java.io.IOException;

/**
 * @author olshansky
 * @since 14.01.2019
 */
public interface DictUpdateService {
    String getDatabaseSettingFilePath();
    String updateList() throws IOException;
}
