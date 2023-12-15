CREATE ALIAS UPLOAD_INVALID_IDENTITY_DOC AS '
int uploadInvalidIdentityDoc(String value){
    return 0;
}
';

INSERT INTO invalid_identity_doc (passportSeriesNumber)
VALUES ('9704,307537');