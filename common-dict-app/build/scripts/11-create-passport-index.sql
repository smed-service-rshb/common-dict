set search_path to 'common_dict';

CREATE INDEX passport_data ON invalid_identity_doc ((passportSeries || '$' || passportNumber));