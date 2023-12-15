set search_path to 'common_dict';

-- Применение настройки пути к справочнику недействительных паспортов для обоих стендов заказчика
UPDATE settings
SET value = '/tmp/RStyleShare/dict/list_of_expired_passports.csv'
WHERE key = 'INVALID_IDENTITY_DOC_FILE';

CREATE OR REPLACE FUNCTION upload_invalid_identity_doc(filePath TEXT)
  RETURNS INTEGER AS $$
BEGIN
  -- Удаление старой промежуточной таблицы, если существует
  DROP TABLE IF EXISTS common_dict.invalid_identity_doc_new;

  -- Создание промежуточной таблицы справочник недействительных паспортов
  CREATE TABLE IF NOT EXISTS common_dict.invalid_identity_doc_new (
    id                    BIGSERIAL     NOT NULL,
    passportSeriesNumber  VARCHAR(11),
    PRIMARY KEY (ID)
  );

  -- Загрузка файлов в новую таблицу
  execute 'COPY common_dict.invalid_identity_doc_new(passportSeriesNumber) FROM '''|| $1::VARCHAR ||''' WITH DELIMITER '';'' CSV HEADER;';

  -- Построение индекса на таблицу с загруженными данными
  CREATE INDEX passport_data_new ON common_dict.invalid_identity_doc_new (passportSeriesNumber);

  -- Удаление старой таблицы
  DROP TABLE IF EXISTS common_dict.invalid_identity_doc;

  -- Переименование нового индекса в имя старого
  ALTER INDEX common_dict.passport_data_new RENAME TO passport_data;

  -- Переименование новой таблицы в имя старой
  ALTER TABLE common_dict.invalid_identity_doc_new RENAME TO invalid_identity_doc;
  RETURN 0;
END;
$$ LANGUAGE plpgsql SECURITY DEFINER;
