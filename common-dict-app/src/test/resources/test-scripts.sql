
INSERT INTO current_state(
  id, version, name, created, isfinished, statecode, statedescription,
  modified, filedate, filename, filesize, operationtype)
VALUES (1, 1, 'BlockagesUpdate', TIMESTAMP '2019-01-28 10:34:12', false, 'SUCCESS', 'Идёт обновление',
        TIMESTAMP '2019-01-28 10:34:55', TIMESTAMP '2019-01-22 10:34:32', 'блокировки.xml', 123421342, 'UPDATE');

INSERT INTO current_state(
  id, version, name, created, isfinished, statecode, statedescription,
  modified, filedate, filename, filesize, operationtype)
VALUES (2, 1, 'TerroristUpdate', TIMESTAMP '2019-01-28 10:34:12', false, 'SUCCESS', 'Идёт обновление',
        TIMESTAMP '2019-01-28 10:34:55', TIMESTAMP '2019-01-22 10:34:32', 'террористы.dbf', 123421342, 'UPDATE');

INSERT INTO current_state(
  id, version, name, created, isfinished, statecode, statedescription,
  modified, filedate, filename, filesize, operationtype)
VALUES (3, 1, 'InvalidIdentityDocUpdate', TIMESTAMP '2019-01-28 10:34:12', false, 'SUCCESS', 'Идёт обновление',
        TIMESTAMP '2019-01-28 10:34:55', TIMESTAMP '2019-01-22 10:34:32', 'паспорта.csv', 123421342, 'UPDATE');

INSERT INTO currency (id, literal_iso, digital_iso, currency_name, full_currency_name, country_holder)
  VALUES(1, 'RUB', '643', 'Рубль', 'Рубль РФ', 'Россия');

INSERT INTO currency (id, literal_iso, digital_iso, currency_name, full_currency_name, country_holder)
  VALUES(2, 'USD', '840', 'Доллар', 'Доллар американский', 'США');

INSERT INTO currency (id, literal_iso, digital_iso, currency_name, full_currency_name, country_holder)
  VALUES(3, 'EUR', '978', 'Евро', 'Европейская валюта', 'ЕС');

insert into currency_rate_cb (id, currency_id,  date, value) VALUES (1, 1, TIMESTAMP '2019-02-13', 1.3);
insert into currency_rate_cb (id, currency_id,  date, value) VALUES (2, 1, TIMESTAMP '2019-02-12', 1.1);
insert into currency_rate_cb (id, currency_id,  date, value) VALUES (3, 2, TIMESTAMP '2019-02-13', 0.2);
insert into currency_rate_cb (id, currency_id,  date, value) VALUES (4, 2, TIMESTAMP '2019-02-12', 0.1);

insert into currency_rate(id,  start_date, end_date, inner_rate, active, edited, rate_id)
VALUES (1, TIMESTAMP '2019-02-13 10:34:11', null, 1.2, true, false, 1);
insert into currency_rate(id, start_date, end_date, inner_rate, active, edited, rate_id)
VALUES (2, TIMESTAMP '2019-02-13 00:00:12', TIMESTAMP '2019-02-13 10:34:10', 1.1, false, false, 1);
insert into currency_rate(id, start_date, end_date, inner_rate, active, edited, rate_id)
VALUES (3, TIMESTAMP '2019-02-12 10:34:12', TIMESTAMP '2019-02-13 00:00:11', 1.0, false, false, 2);
insert into currency_rate(id, start_date, end_date, inner_rate, active, edited, rate_id)
VALUES (4, TIMESTAMP '2019-02-13 10:34:12', null, 1.0, true, false, 3);
insert into currency_rate(id, start_date, end_date, inner_rate, active, edited, rate_id)
VALUES (5, TIMESTAMP '2019-02-13 1:34:12', TIMESTAMP '2019-02-13 10:34:11', 2.2, false , false, 3);
insert into currency_rate(id, start_date, end_date, inner_rate, active, edited, rate_id)
VALUES (6, TIMESTAMP '2019-02-12 10:34:12', TIMESTAMP '2019-02-13 1:34:11', 1.5, false , false, 4);