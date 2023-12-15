set search_path to 'common_dict';

-- Добавление информации о загружаемом файле для таблицы со статусами загрузок
ALTER TABLE current_state ADD COLUMN IF NOT EXISTS fileDate TIMESTAMP;
ALTER TABLE current_state ADD COLUMN IF NOT EXISTS fileName VARCHAR(254);
ALTER TABLE current_state ADD COLUMN IF NOT EXISTS fileSize BIGINT;
ALTER TABLE current_state ADD COLUMN IF NOT EXISTS operationType VARCHAR(10);
