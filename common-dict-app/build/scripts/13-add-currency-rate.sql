set search_path to 'common_dict';

create table currency_rate (
  id           BIGSERIAL NOT NULL,
  currency_id  BIGINT NOT NULL,
  date_cb      DATE not null,
  start_date   timestamp not null ,
  end_date     timestamp,
  rate         NUMERIC not null,
  inner_rate   NUMERIC,
  active       boolean,
  edited       boolean,

  PRIMARY KEY (id),
  CONSTRAINT currency_rate_currency_fkey FOREIGN KEY (currency_id) REFERENCES currency (id)
);

insert into settings (key, value, description) values ('currencyRateCalculationType', 'CB_RF_RATE', 'Настройка расчета курса валюты организации');
insert into settings (key, value, description) values ('additionalPercent', '0', 'Значения параметра "Добавочный процент" для расчета курса Организации для курса валют');