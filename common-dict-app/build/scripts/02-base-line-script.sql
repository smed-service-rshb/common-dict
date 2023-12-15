-- Создание пользователя common_dict
DROP USER IF EXISTS common_dict;
CREATE USER common_dict WITH PASSWORD 'common_dict';
GRANT USAGE ON SCHEMA common_dict TO common_dict;
ALTER DEFAULT PRIVILEGES IN SCHEMA common_dict GRANT ALL ON TABLES TO common_dict;
ALTER DEFAULT PRIVILEGES IN SCHEMA common_dict GRANT ALL ON SEQUENCES TO common_dict;

-- Создание таблиц

-- Каналы
CREATE TABLE common_dict.CHANNEL
(
  ID         BIGSERIAL NOT NULL,
  SHORT_NAME VARCHAR(10),
  FULL_NAME  VARCHAR(30),
  CONSTRAINT PK_CHANNEL PRIMARY KEY (ID)
);

-- Филиалы
CREATE TABLE common_dict.BRANCH
(
  ID            BIGSERIAL NOT NULL,
  CODE          VARCHAR(30),
  SIMPLE_NAME   VARCHAR(10),
  OFFICIAL_NAME VARCHAR(30),
  CONSTRAINT PK_BRANCH PRIMARY KEY (ID)
);

-- коды подразделений
CREATE TABLE common_dict.DIVISION_CODE
(
  ID            BIGSERIAL        NOT NULL,
  CODE          VARCHAR(10),
  DESCRIPTION   VARCHAR(200),
  CONSTRAINT PK_DIVISION_CODE PRIMARY KEY (ID)
);

-- Офисы
CREATE TABLE common_dict.OFFICE
(
  ID            BIGSERIAL NOT NULL,
  RF_ID         BIGINT,
  SIMPLE_NAME   VARCHAR(10),
  OFFICIAL_NAME VARCHAR(30),
  POST_ADDRESS  VARCHAR(50),
  PHONE         VARCHAR(15),
  START_TIME    VARCHAR(10),
  END_TIME      VARCHAR(10),
  CONSTRAINT PK_OFFICE PRIMARY KEY (ID)
);

-- Банки
CREATE TABLE common_dict.BANK (
  ID            BIGSERIAL NOT NULL,
  NAME          VARCHAR(255),
  SHORT_NAME     VARCHAR(255),
  BIC           VARCHAR(255),
  BIC_RCC        VARCHAR(255),
  SWIFT         VARCHAR(255),
  DESCRIPTION   VARCHAR(255),
  COUNTRY       VARCHAR(3),
  CORR_ACCOUNT  VARCHAR(255),
  ADDRESS       VARCHAR(255),
  CHANGED_BY_HAND VARCHAR(255),
  RESIDENT      BOOLEAN,
  DELETED       BOOLEAN,
  CONSTRAINT PK_BANK PRIMARY KEY (ID)
);

CREATE INDEX IDX_BANK_BIC
  ON common_dict.BANK (BIC);
CREATE INDEX IDX_BANK_SWIFT
  ON common_dict.BANK (SWIFT);

--Валюты
CREATE TABLE common_dict.CURRENCY
(
  ID                 BIGSERIAL NOT NULL,
  LITERAL_ISO        VARCHAR(3),
  DIGITAL_ISO        BIGINT,
  CURRENCY_NAME      VARCHAR(20),
  FULL_CURRENCY_NAME VARCHAR(20),
  COUNTRY_HOLDER     VARCHAR(20),
  CONSTRAINT PK_CURRENCY PRIMARY KEY (ID)
);

CREATE INDEX IDX_CURRENCY_LITERAL_ISO
  ON common_dict.CURRENCY (LITERAL_ISO);
CREATE INDEX IDX_CURRENCY_DIGITAL_ISO
  ON common_dict.CURRENCY (DIGITAL_ISO);

--Внешние системы
CREATE TABLE common_dict.EXTERNAL_SYSTEM
(
  ID                   BIGSERIAL NOT NULL,
  NAME                 VARCHAR(20),
  SYSTEM_TYPE          VARCHAR(20),
  SYSTEM_ID            VARCHAR(20),
  CONNECT_TIMEOUT      BIGINT,
  FAILURE_PERIOD       BIGINT,
  FAILURE_PERIOD_COUNT BIGINT,
  CONSTRAINT PK_EXTERNAL_SYSTEM PRIMARY KEY (ID)
);

--Ошибки внешних систем
CREATE TABLE common_dict.EXTERNAL_SYSTEM_ERROR
(
  ID           BIGSERIAL NOT NULL,
  SERVICE_NAME VARCHAR(20),
  ERROR_CODE   VARCHAR(10),
  MESSAGE      VARCHAR(100),
  CONSTRAINT PK_EXTERNAL_SYSTEM_ERROR PRIMARY KEY (ID)
);

--Таблица шаблон печатной формы
CREATE TABLE common_dict.PRINT_TEMPLATES
(
  TYPE            VARCHAR(100)  NOT NULL,
  COPIES_NUMBER   INTEGER      NOT NULL,
  FILE_NAME       VARCHAR(250)  NOT NULL,
  CONTENT         BYTEA,
  CONSTRAINT PK_PRINT_TEMPLATES PRIMARY KEY (TYPE)
);

--Настройки сервиса общих справочников
CREATE TABLE common_dict.SETTINGS
(
  ID          BIGSERIAL    NOT NULL,
  CODE        VARCHAR(100) NOT NULL,
  TYPE        CHAR(1),
  DESCRIPTION VARCHAR(255),
  VALUE       VARCHAR(255),
  CONSTRAINT PK_SETTINGS PRIMARY KEY (ID)
);

CREATE INDEX IDX_SETTINGS_CODE
  ON common_dict.SETTINGS (CODE);

--Настройки схемы прав
CREATE TABLE common_dict.permission_links (
  id         BIGSERIAL NOT NULL,
  permission VARCHAR(255),
  role       VARCHAR(60),
  PRIMARY KEY (id)
);

--Адреса
CREATE TABLE common_dict.ADDRESSES (
  ID          BIGSERIAL    NOT NULL,
  AOGUID      VARCHAR(36)  NOT NULL UNIQUE,
  OFFNAME     VARCHAR(120) NOT NULL,
  POSTALCODE  VARCHAR(6)   NOT NULL,
  SHORTNAME   VARCHAR(10)  NOT NULL,
  LEVEL       INTEGER      NOT NULL,
  ORIG_LEVEL  INTEGER      NOT NULL,
  PARENTGUID  VARCHAR(36),
  AOID        VARCHAR(36) UNIQUE,
  FULLADDRESS VARCHAR(1000),
  PRIMARY KEY (id)
);
CREATE INDEX addresses_parentguid_i
  ON common_dict.ADDRESSES (PARENTGUID);

CREATE TABLE common_dict.HOUSES (
  ID         BIGSERIAL   NOT NULL,
  POSTALCODE VARCHAR(6),
  HOUSENUM   VARCHAR(20) NOT NULL,
  BUILDNUM   VARCHAR(10),
  STRUCNUM   VARCHAR(10),
  HOUSEID    VARCHAR(36) NOT NULL UNIQUE,
  HOUSEGUID  VARCHAR(36) NOT NULL,
  HOUSETYPE  VARCHAR(16) NOT NULL,
  AOGUID     VARCHAR(36) NOT NULL,
  PRIMARY KEY (id)
);

CREATE INDEX houses_aoguid_i
  ON common_dict.HOUSES (AOGUID);

CREATE EXTENSION pg_trgm;

CREATE INDEX trgm_idx_addresses_offname ON common_dict.ADDRESSES USING gin (FULLADDRESS gin_trgm_ops);

CREATE INDEX trgm_idx_houses_offname ON common_dict.HOUSES USING gin (HOUSENUM gin_trgm_ops);

--функция возвращает список всех родителей для адреса по aoguid
CREATE OR REPLACE FUNCTION common_dict.get_address_tree(
  guid CHARACTER VARYING(36) -- guid записи адреса, для которого ищем родителей
)
  RETURNS TABLE(address_id BIGINT, address_offname CHARACTER VARYING(120), address_shortname CHARACTER VARYING(10), address_level INTEGER, address_fulladdress CHARACTER VARYING(1000), address_postalcode CHARACTER VARYING(1000))
LANGUAGE plpgsql
IMMUTABLE AS $$
BEGIN
  RETURN QUERY
  WITH RECURSIVE r AS (
    SELECT
      id,
      aoguid,
      parentguid,
      offname,
      shortname,
      level,
      fulladdress,
      postalcode
    FROM common_dict.addresses
    WHERE aoguid = $1
    UNION
    SELECT
      addresses.id,
      addresses.aoguid,
      addresses.parentguid,
      addresses.offname,
      addresses.shortname,
      addresses.level,
      addresses.fulladdress,
      addresses.postalcode
    FROM common_dict.addresses
      JOIN r ON addresses.aoguid = r.parentguid
  )
  SELECT
    id,
    offname,
    shortname,
    level,
    fulladdress,
    postalcode
  FROM r;
END $$;
--временный тип данных
CREATE TYPE common_dict.TMP_ADDRESS_DATA AS (
  t_guid        CHARACTER VARYING(36), --
  t_parent_guid CHARACTER VARYING(36),
  t_address     CHARACTER VARYING(120),
  t_shortname character varying(10));

--функция строит полный адрес для адреса c указанным aoguid
CREATE OR REPLACE FUNCTION common_dict.get_full_address(address_guid CHARACTER VARYING(36), withType boolean)
  RETURNS CHARACTER VARYING(1000)
LANGUAGE plpgsql
IMMUTABLE
AS $$
DECLARE
  curr_parent  CHARACTER VARYING(36) := address_guid;
  full_address TEXT := '';
  next_rec     common_dict.TMP_ADDRESS_DATA;
BEGIN
  WHILE (curr_parent IS NOT NULL AND curr_parent <> '') LOOP
    SELECT
      aoguid,
      parentguid,
      offname,
      shortname
    INTO next_rec.t_guid, next_rec.t_parent_guid, next_rec.t_address, next_rec.t_shortname
    FROM common_dict.addresses
    WHERE aoguid = curr_parent;
    IF (withType) THEN
      full_address := trim(next_rec.t_shortname) || ' ' || trim(next_rec.t_address) || ' ' || full_address;
    ELSE
      full_address := trim(next_rec.t_address) || ' ' || full_address;
    END IF;
    curr_parent := trim(next_rec.t_parent_guid);
  END LOOP;
  RETURN full_address;
END;
$$;

CREATE OR REPLACE FUNCTION update_modified_column()
  RETURNS TRIGGER AS $$
BEGIN
  NEW.modified = now();
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Таблица статусов обновлений
CREATE TABLE common_dict.current_state (
  id                BIGSERIAL     NOT NULL,
  version           BIGINT        NOT NULL,
  name              VARCHAR(100),
  created           TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  isFinished        BOOLEAN,
  stateCode         VARCHAR(20),
  stateDescription  VARCHAR(1000),
  modified          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY (ID)
);

CREATE TRIGGER update_current_state BEFORE UPDATE ON common_dict.current_state FOR EACH ROW EXECUTE PROCEDURE update_modified_column();

-- Справочник недействительных паспортов
CREATE TABLE common_dict.invalid_identity_doc (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  passportSeries  integer,
  passportNumber  integer,
  PRIMARY KEY (ID)
);

-- Справочник экстремистов/террористов
CREATE TABLE common_dict.terrorist (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  lastName        VARCHAR(254)  NOT NULL,
  firstName       VARCHAR(254)  NOT NULL,
  middleName      VARCHAR(254),
  birthDate       date,

  birthAddress    VARCHAR(254),
  liveAddress     VARCHAR(254),
  personnelNumber BIGINT,

  passportSeries  VARCHAR(50),
  passportNumber  VARCHAR(50),

  PRIMARY KEY (ID)
);

-- Справочник блокировок/заморозок
CREATE TABLE common_dict.blockages (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  lastName        VARCHAR(254)  NOT NULL,
  firstName       VARCHAR(254)  NOT NULL,
  middleName      VARCHAR(254),
  birthDate       date,

  personnelNumber BIGINT,

  passportSeries  VARCHAR(50),
  passportNumber  VARCHAR(50),

  PRIMARY KEY (ID)
);

-- Справочник типов документов
CREATE TABLE common_dict.identity_doc_type (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  name            VARCHAR(100),
  schema          VARCHAR(1000),
  PRIMARY KEY (ID)
);


-- Справочник видов принадлежности к публичным должнострным лицам (ПДЛ)
CREATE TABLE common_dict.public_official (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  name            VARCHAR(254),
  PRIMARY KEY (ID)
);

-- Справочник видов принадлежности к иностранным публичным должностным лицам (ИПДЛ)
CREATE TABLE common_dict.foreign_public_official (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  name            VARCHAR(254),
  PRIMARY KEY (ID)
);

-- Справочник степеней родства
CREATE TABLE common_dict.kinship_type (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  name            VARCHAR(254),
  PRIMARY KEY (ID)
);

-- Справочник видов принадлежности к российским публичным должностным лицам (РПДЛ)
CREATE TABLE common_dict.russian_public_official (
  id              BIGSERIAL     NOT NULL,
  version         BIGINT        NOT NULL,
  name            VARCHAR(254),
  PRIMARY KEY (ID)
);

CREATE TABLE common_dict.rights_to_permission (
	right_id	varchar(60) not null,
	permission_id	varchar(255) not null,
	PRIMARY KEY(right_id, permission_id)
);

CREATE OR REPLACE FUNCTION common_dict.setup_permission_rights(i_permission VARCHAR(255), i_rights varchar[])
	RETURNS void AS $$
DECLARE
	rightItem varchar;
BEGIN
	FOREACH rightItem IN ARRAY i_rights LOOP
		INSERT INTO common_dict.rights_to_permission(right_id, permission_id) VALUES (rightItem, i_permission);
	END LOOP;
END;
$$ LANGUAGE plpgsql;
