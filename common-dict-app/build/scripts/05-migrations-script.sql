-- Создание таблицы Кассовых символов
CREATE TABLE common_dict.CASH_SYMBOL
(
  ID                  BIGSERIAL NOT NULL,
  CODE                BIGINT,
  NAME                VARCHAR(200),
  OPERATION_TYPE      VARCHAR(20),
  PURPOSE_OF_PAYMENT  VARCHAR(200),
  CONSTRAINT PK_CASH_SYMBOL PRIMARY KEY (ID)
);
-- Права для Кассовых символов
SELECT common_dict.setup_permission_rights('cash-symbols-list', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);
SELECT common_dict.setup_permission_rights('get-cash-symbol', ARRAY ['VIEW_BUSINESS_DICTIONARIES', 'EDIT_BUSINESS_DICTIONARIES']);

-- Заполнение данных Кассовых символов
INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(11, 'Поступления от реализации платных услуг (выполненных работ)', 'INCOME', 'Оплата по договору/ счету/ -фактуре/квитанции №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(12, 'Поступления налогов, сборов, страховых взносов, штрафов, таможенных платежей, средств самообложения граждан, взносов, страховых', 'INCOME', 'Оплата по договору/ счету/ -фактуре/квитанции №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(14, 'Поступления займов и в погашение кредитов', 'INCOME', 'Погашение задолженности по Кредитному договору №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(15, 'Поступления от операций с недвижимостью', 'INCOME', 'Внесение денежных средств на счет по договору №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(16, 'Поступления на счета по вкладам физических лиц', 'INCOME', 'Внесение денежных средств по договору вклада №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(31, 'Поступления на банковские счета физических лиц', 'INCOME', 'Внесение денежных средств на счет по договору №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(32, 'Прочие поступления', 'INCOME', 'Внесение денежных средств на счет по договору №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(51, 'Выдачи со счетов физических лиц', 'EXPENDITURE', 'Выдача наличных денежных средств со счета по договору №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(54, 'Выдачи займов и кредитов', 'EXPENDITURE', 'Выдача кредитных средств по Кредитному договору №');

INSERT INTO common_dict.cash_symbol(code, name, operation_type, purpose_of_payment)
  VALUES(55, 'Выдачи со счетов по вкладам (депозитам) физических лиц', 'EXPENDITURE', 'Выдача наличных денежных средств по договору вклада №');

SELECT common_dict.setup_permission_rights('print-templates-get',  ARRAY ['EXECUTE_FUNDS_MOVEMENT_STATEMENT_PROCESS', 'EXECUTE_BALANCE_STATEMENT_PROCESS', 'EXECUTE_BALANCE_CERTIFICATE_PROCESS', 'ANALYZE_BALANCE_CERTIFICATE_PROCESS_ERRORS']);

-- Подключение сервиса настроек
ALTER TABLE common_dict.SETTINGS DROP CONSTRAINT PK_SETTINGS;

ALTER TABLE common_dict.SETTINGS RENAME TO DICT_SETTINGS;

ALTER TABLE common_dict.DICT_SETTINGS ADD CONSTRAINT PK_DICT_SETTINGS PRIMARY KEY (ID);

CREATE TABLE common_dict.SETTINGS
(
  ID          BIGSERIAL    NOT NULL,
  KEY         VARCHAR(30)  NOT NULL UNIQUE,
  VALUE       VARCHAR(255) NOT NULL,
  DESCRIPTION VARCHAR(255),
  CONSTRAINT PK_SETTINGS PRIMARY KEY (ID)
);

-- Перенос настроек
INSERT INTO common_dict.SETTINGS(KEY, VALUE, DESCRIPTION) SELECT CODE, VALUE, DESCRIPTION FROM common_dict.DICT_SETTINGS;
DROP TABLE common_dict.DICT_SETTINGS;