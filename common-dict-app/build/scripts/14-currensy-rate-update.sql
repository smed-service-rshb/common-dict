set search_path to 'common_dict';

create table currency_rate_cb (
  id           BIGSERIAL NOT NULL,
  currency_id  BIGINT NOT NULL,
  date      DATE not null,
  value         NUMERIC not null,

    PRIMARY KEY (id),
  UNIQUE (currency_id, date),
  CONSTRAINT currency_rate_currency_fkey FOREIGN KEY (currency_id) REFERENCES currency (id)
);

CREATE OR REPLACE FUNCTION update_currency_rate_cb()
  RETURNS void AS $$
DECLARE
  row  RECORD;
BEGIN
  FOR row IN
  select distinct  date_cb, rate, currency_id from currency_rate
  LOOP
    insert into currency_rate_cb (currency_id, date, value) values (row.currency_id, row.date_cb, row.rate);
  END LOOP;
END;
$$ LANGUAGE plpgsql;

select from update_currency_rate_cb();

alter table currency_rate add column if not exists rate_id bigint;

CREATE OR REPLACE FUNCTION update_currency_rate()
  RETURNS void AS $$
DECLARE
  row    RECORD;
BEGIN
  FOR row IN
  select id, date_cb, currency_id from currency_rate
  LOOP
    update currency_rate set rate_id = (select id from currency_rate_cb where date = row.date_cb and currency_id = row.currency_id) where id = row.id;
  END LOOP;
END;
$$ LANGUAGE plpgsql;

select from update_currency_rate();

ALTER TABLE common_dict.currency_rate DROP column if exists date_cb;
ALTER TABLE common_dict.currency_rate DROP column if exists rate;
ALTER TABLE common_dict.currency_rate DROP constraint if exists currency_rate_currency_fkey;
ALTER TABLE common_dict.currency_rate DROP column if exists currency_id;
ALTER TABLE currency_rate_cb add constraint currency_rate_cb_currency_fkey FOREIGN KEY (currency_id) REFERENCES currency (id);
ALTER TABLE currency_rate add constraint currency_rate_2_currency_rate_cb_fkey FOREIGN KEY (rate_id) REFERENCES currency_rate_cb (id);




