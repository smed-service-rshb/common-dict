set search_path to 'common_dict';

-- Добавление индексов, которые должны ускорить поиск по списку недействительных паспортов.
CREATE INDEX IF NOT EXISTS invalid_identity_doc_series_number_idx
ON invalid_identity_doc(passportSeries, passportNumber);

-- Добавление индексов, которые должны ускорить поиск по списку террористов и экстремистов.
CREATE INDEX IF NOT EXISTS terrorist_series_number_idx
ON terrorist(passportSeries, passportNumber);

CREATE INDEX IF NOT EXISTS terrorist_lastname_firstname_idx
ON terrorist(lastName, firstName);

-- Добавление индексов, которые должны ускорить поиск по списку лиц, в отношении которых действует решение
-- межведомственной комиссии о замораживании (блокировании) принадлежащих им денежных средств или иного имущества.
CREATE INDEX IF NOT EXISTS blockages_series_number_idx
ON blockages(passportSeries, passportNumber);

CREATE INDEX IF NOT EXISTS blockages_lastname_firstname_idx
ON blockages(lastName, firstName);