set search_path to 'common_dict';

ALTER TABLE blockages ALTER COLUMN lastname DROP NOT NULL;
ALTER TABLE blockages ALTER COLUMN firstname DROP NOT NULL;
