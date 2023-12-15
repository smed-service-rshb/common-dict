set search_path to 'common_dict';

-- Добавление настроек путей к файлам-источникам для загрузчика справочников:
-- недействительных паспортов, заморозок/блокировок и экстремистов/террористов
INSERT INTO settings(key, description, value)
VALUES ('BLOCKAGE_FILE', '', '/tmp/share/blockage.xml') ON CONFLICT DO NOTHING;

INSERT INTO settings(key, description, value)
VALUES ('INVALID_IDENTITY_DOC_FILE', '', '/tmp/share/list_of_expired_passports.csv') ON CONFLICT DO NOTHING;

INSERT INTO settings(key, description, value)
VALUES ('TERRORIST_FILE', '', '/tmp/share/21.03.2018.dbf') ON CONFLICT DO NOTHING;