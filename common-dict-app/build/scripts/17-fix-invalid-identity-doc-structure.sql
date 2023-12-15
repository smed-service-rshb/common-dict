set search_path to 'common_dict';


ALTER TABLE invalid_identity_doc ADD COLUMN IF NOT EXISTS passportSeriesNumber  VARCHAR(11);
ALTER TABLE invalid_identity_doc DROP COLUMN IF EXISTS passportSeries;
ALTER TABLE invalid_identity_doc DROP COLUMN IF EXISTS passportNumber;
ALTER TABLE invalid_identity_doc DROP COLUMN IF EXISTS version;

DO $$
    DECLARE A BIGINT;
    BEGIN
        SELECT COUNT(id) INTO A FROM common_dict.invalid_identity_doc WHERE passportSeriesNumber IS NOT NULL;
        IF A < 1 THEN
            RAISE NOTICE E'\n\n\n###############################################################################################################\n\tПРОСЬБА ОБНОВИТЬ СПРАВОЧНИК ПАСПОРТОВ. PLEASE UPDATE INVALID_IDENTITY_DOC TABLE\n###############################################################################################################\n\n';
        END IF;

    EXCEPTION
        WHEN others THEN
            RAISE NOTICE 'Table invalid_identity_doc, or column passportSeriesNumber does not exist, or something else. Details: %', SQLERRM;
END $$;

