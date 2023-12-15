-- права пользователя - просмотр справочников и отдельных записей
INSERT INTO common_dict.permission_links(permission, role)
VALUES('banks-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-bank', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('channels-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-channel', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('branches-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-branch', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('offices-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-office', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-errors-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system-error', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-list', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-address', 'user');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-replication', 'user');

-- права администратора - просмотр, редактирование, репликация справочников
INSERT INTO common_dict.permission_links(permission, role)
VALUES('banks-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-bank', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-bank', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('delete-bank', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('edit-bank', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('banks-replication', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('channels-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-channel', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('branches-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-branch', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('offices-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-office', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('edit-external-system', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('delete-external-system', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-external-system', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-errors-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system-error', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('edit-external-system-error', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('delete-external-system-error', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-external-system-error', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-list', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-replication', 'admin');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-address', 'admin');

-- настройки путей директорий с файлами справочников для репликации
-- полные права для работы со справочниками
INSERT INTO common_dict.permission_links(permission, role)
VALUES('banks-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-bank', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-address', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('channels-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-channel', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('branches-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-branch', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('offices-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-office', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-errors-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system-error', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('banks-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-bank', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-bank', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('delete-bank', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('edit-bank', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('banks-replication', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('addresses-replication', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-address', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('channels-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-channel', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('branches-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-branch', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('offices-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-office', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('edit-external-system', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('delete-external-system', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-external-system', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('external-systems-errors-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-external-system-error', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('edit-external-system-error', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('delete-external-system-error', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-external-system-error', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('division-codes-list', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-division-code', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('get-division-by-code', 'common-dict-role');

INSERT INTO common_dict.permission_links(permission, role)
VALUES('create-division-code', 'common-dict-role');

INSERT INTO common_dict.settings(code, type, description, value)
VALUES('BANK_DICT_DIR_PATH', '0', '', '/tmp/share/dict/');

INSERT INTO common_dict.settings(code, type, description, value)
VALUES('ADDRESS_DICT_DIR_PATH', '0', '', '/tmp/share/dict/fias');

INSERT INTO common_dict.settings(code, type, description, value)
VALUES('ADDRESS_DELTA_DIR_PATH', '0', '', '/tmp/share/dict/fias_delta');

-- Банки
INSERT INTO common_dict.bank(name, short_name, bic, swift, description, corr_account, address, changed_by_hand, resident, deleted)
  VALUES('РФ АО "РОССЕЛЬХОЗБАНК" - "ЦКБ"', 'РОССЕЛЬХОЗБАНК', '044525720', '12345678910', 'Филиал банка', '30101810645250000720', 'Москва', FALSE, TRUE, FALSE);

INSERT INTO common_dict.bank(name, short_name, bic, swift, description, corr_account, address, changed_by_hand, resident, deleted)
  VALUES('Банк имени Емельки Пугачева №2', 'Банк №2', '044525721', '12345678911', 'Банк на Урале', '30101810645250000721', 'Казань', FALSE, TRUE, FALSE);

-- Офисы
INSERT INTO common_dict.office(rf_id, simple_name, official_name, post_address, phone, start_time, end_time)
  VALUES(1, 'moscow', 'Головной офис Россельхозбанк', 'г.Москва, ул. Арбат 2', '+49590012311', '08:00', '18:00');

INSERT INTO common_dict.office(rf_id, simple_name, official_name, post_address, phone, start_time, end_time)
  VALUES(2, 'vologda', 'Вологодский офис', 'г.Вологда, ул. Петина 4', '+79511001020', '08:00', '18:00');

INSERT INTO common_dict.office(rf_id, simple_name, official_name, post_address, phone, start_time, end_time)
  VALUES(3, 'sevastopol', 'Севастопольский офис', 'г.Севастополь, ул. Мюнхаузена 3 4', '+78692200100', '08:00', '18:00');

INSERT INTO common_dict.office(rf_id, simple_name, official_name, post_address, phone, start_time, end_time)
  VALUES(4, 'bryansk', 'Брянский офис', 'г.Брянск, ул. Ленина 12', '+74832000000', '08:00', '18:00');

INSERT INTO common_dict.office(rf_id, simple_name, official_name, post_address, phone, start_time, end_time)
  VALUES(5, 'tver', 'Тверской офис', 'г.Тверь, ул. Мира 20', '+48210090000', '08:00', '18:00');

-- Филиалы
INSERT INTO common_dict.branch(code, simple_name, official_name)
  VALUES('6300', 'vologda', 'Вологодский филиал');

INSERT INTO common_dict.branch(code, simple_name, official_name)
  VALUES('6500', 'moscow', 'Московский главный офис');

INSERT INTO common_dict.branch(code, simple_name, official_name)
  VALUES('5400', 'saint-p', 'Петербургский филиал');

INSERT INTO common_dict.branch(code, simple_name, official_name)
  VALUES('5300', 'kaliningr', 'Калининградский филиал');

INSERT INTO common_dict.branch(code, simple_name, official_name)
  VALUES('6100', 'omsk', 'Омский филиал');

-- Коды Подразделений
INSERT INTO common_dict.division_code(code, description)
  VALUES('1023', 'Якутский филиал');

-- Коды Подразделений
INSERT INTO common_dict.division_code(code, description)
  VALUES('1024', 'Новый филиал');

-- Каналы
INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('office', 'Отделение банка');

INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('site', 'Сайт банка');

INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('ikfl', 'ИКФЛ');

INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('callcenter', 'Колл-центр');

INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('atm', 'Банкомат');

INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('telemark', 'Телемаркетинг');

INSERT INTO common_dict.channel(short_name, full_name)
  VALUES('MB', 'Мобильный банк');

-- ВС
INSERT INTO common_dict.external_system(name, system_type, system_id, connect_timeout, failure_period, failure_period_count)
  VALUES('Интербанк', 'DBO', 'DBO', 10000, 100000, 5);

INSERT INTO common_dict.external_system(name, system_type, system_id, connect_timeout, failure_period, failure_period_count)
  VALUES('БИСКВИТ Вологда', 'BISQUIT', 'BISQUIT:6300', 20000, 200000, 5);

INSERT INTO common_dict.external_system(name, system_type, system_id, connect_timeout, failure_period, failure_period_count)
  VALUES('БИСКВИТ Москва', 'BISQUIT', 'BISQUIT:6500', 30000, 300000, 5);

INSERT INTO common_dict.external_system(name, system_type, system_id, connect_timeout, failure_period, failure_period_count)
  VALUES('ПЦ', 'PC', 'PC', 45000, 450000, 10);

INSERT INTO common_dict.external_system(name, system_type, system_id, connect_timeout, failure_period, failure_period_count)
  VALUES('ЦИФ', 'CIF', 'CIF', 55000, 550000, 10);

-- Ошибки ВС
INSERT INTO common_dict.external_system_error(service_name, error_code, message)
  VALUES('bussines-error', '100', 'Операция временно недоступна');

INSERT INTO common_dict.external_system_error(service_name, error_code, message)
  VALUES('error', '505', 'Операция не выполнена');

INSERT INTO common_dict.external_system_error(service_name, error_code, message)
  VALUES('forbidden', '403', 'У вас нет прав на выполнение данной операции');

INSERT INTO common_dict.external_system_error(service_name, error_code, message)
  VALUES('tech-break', '200', 'Операция недоступна до ДД.ММ.ГГГ');

INSERT INTO common_dict.external_system_error(service_name, error_code, message)
  VALUES('time-out', '105', 'В данный момент операция недоступна. Попробуйте позже');

-- Валюты
INSERT INTO common_dict.currency (literal_iso, digital_iso, currency_name, full_currency_name, country_holder)
  VALUES('RUB', '643', 'Рубль', 'Рубль РФ', 'Россия');

INSERT INTO common_dict.currency (literal_iso, digital_iso, currency_name, full_currency_name, country_holder)
  VALUES('USD', '840', 'Доллар', 'Доллар американский', 'США');

INSERT INTO common_dict.currency (literal_iso, digital_iso, currency_name, full_currency_name, country_holder)
  VALUES('EUR', '978', 'Евро', 'Европейская валюта', 'ЕС');

--Справочник типов документов
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Паспорт РФ');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Временное удостоверение личности');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Удостоверение личности военнослужащего');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Военный билет');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Удостоверение личности моряка');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Свидетельство о рождении');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Заграничный паспорт гражданина РФ');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Дипломатический паспорт');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Служебное удостоверение работника прокуратуры');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Служебный паспорт');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Вид на жительство');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Свидетельство о предоставлении временного убежища');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Паспорт иностранного гражданина');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Разрешение на временное проживание в РФ');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Удостоверение беженца');
INSERT INTO common_dict.identity_doc_type (version, name) VALUES('1', 'Иной документ');

--Справочник видов публичных должностных лиц ПДЛ
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'Не является ПДЛ или его ближайшим окружением/в ином случае');
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'ИПДЛ');
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'Ближайшее окружение иностранного публичного должностного лица');
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'РПДЛ');
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'Ближайшее окружение РПДЛ');
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'МПДЛ');
INSERT INTO common_dict.public_official (version, name) VALUES('1', 'Ближайшее окружение МПДЛ');

--Справочник видов иностранных публичных должностных лиц ИПДЛ
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Главы государств или правительств (независимо от формы государственного устройства)');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Министры, их заместители и помощники');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Должностные лица судебных органов власти последней инстанции (Верховный, Конституционный суд)');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Высшие правительственные чиновники');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Государственный прокурор и его заместители');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Высшие военные чиновники');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Руководители и члены Советов директоров Национальных Банков');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Лидер официально зарегистрированной политической партии движения, его заместитель');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Руководители государственных корпораций');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Глава религиозной организации (осуществляющей государственные управленческие функции), его заместитель');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Послы');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Руководители, заместители руководителей международных организаций (ООН, ОЭСР, ОПЕК, Олимпийский комитет, Гаагский трибунал)');
INSERT INTO common_dict.foreign_public_official (version, name) VALUES('1', 'Руководители и члены международных судебных Организаций (Суд по правам человека, Гаагский трибунал)');

--Справочник степени родства
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Супруг/супруга');
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Отец/мать');
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Сын/дочь');
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Дедушка/бабушка');
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Внук/внучка');
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Брат/сестра (в том числе неполнородные)');
INSERT INTO common_dict.kinship_type (version, name) VALUES('1', 'Отчим/мачеха');

--Справочник видов российских публичных должностных лиц РПДЛ
INSERT INTO common_dict.russian_public_official (version, name) VALUES('1', 'Должности в иных организациях, созданных РФ на основании федеральных законов, включенных в перечни должностей, определяемых Президентом РФ');
INSERT INTO common_dict.russian_public_official (version, name) VALUES('1', 'Государственные должности РФ');
INSERT INTO common_dict.russian_public_official (version, name) VALUES('1', 'Должности членов Совета директоров ЦБ РФ');
INSERT INTO common_dict.russian_public_official (version, name) VALUES('1', 'Должности федеральной государственной службы, назначение на которые и освобождение от которых осуществляется Президентом РФ и Правительством РФ');
INSERT INTO common_dict.russian_public_official (version, name) VALUES('1', 'Должности в ЦБ РФ, включенные в перечни должностей, определяемые Президентом РФ');
INSERT INTO common_dict.russian_public_official (version, name) VALUES('1', 'Должности в государственных корпорациях, созданных РФ на основании федеральных законов, включенные в перечни должностей, определяемых Президентом РФ');