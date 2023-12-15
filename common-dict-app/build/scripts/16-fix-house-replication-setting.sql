set search_path to 'common_dict';

DELETE FROM settings WHERE key = 'needStrictCheckFilesSetting';

insert into settings (key, value, description)
values ('needStrictCheckFiles', 'HOUSE77.DBF', 'Файлы, которые требуется проверять перед репликацией (содержат дубли или ошибки)')
ON CONFLICT DO NOTHING;;
