DELETE FROM BLOCKAGES;
DELETE FROM TERRORIST;
DELETE FROM INVALID_IDENTITY_DOC;
DELETE FROM current_state;
DELETE FROM currency_rate;
DELETE FROM currency_rate_cb;
DELETE FROM currency;
-- Удаление старой схемы
--DROP SCHEMA IF EXISTS common_dict CASCADE;