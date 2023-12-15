set search_path to 'common_dict';

ALTER TABLE addresses ADD COLUMN IF NOT EXISTS okato varchar(11) NULL;

update addresses set okato = '60000000000' where offname = 'Ростовская' and orig_level = 1;
update addresses set okato = '61000000000' where offname = 'Рязанская' and orig_level = 1;
update addresses set okato = '63000000000' where offname = 'Саратовская' and orig_level = 1;
update addresses set okato = '64000000000' where offname = 'Сахалинская' and orig_level = 1;
update addresses set okato = '65000000000' where offname = 'Свердловская' and orig_level = 1;
update addresses set okato = '66000000000' where offname = 'Смоленская' and orig_level = 1;
update addresses set okato = '68000000000' where offname = 'Тамбовская' and orig_level = 1;
update addresses set okato = '28000000000' where offname = 'Тверская' and orig_level = 1;
update addresses set okato = '69000000000' where offname = 'Томская' and orig_level = 1;
update addresses set okato = '71000000000' where offname = 'Тюменская' and orig_level = 1;
update addresses set okato = '73000000000' where offname = 'Ульяновская' and orig_level = 1;
update addresses set okato = '75000000000' where offname = 'Челябинская' and orig_level = 1;
update addresses set okato = '76000000000' where offname = 'Забайкальский' and orig_level = 1;
update addresses set okato = '78000000000' where offname = 'Ярославская' and orig_level = 1;
update addresses set okato = '40000000000' where offname = 'Санкт-Петербург' and orig_level = 1;
update addresses set okato = '45000000000' where offname = 'Москва' and orig_level = 1;
update addresses set okato = '71100000000' where offname = 'Ханты-Мансийский Автономный округ - Югра' and orig_level = 1;
update addresses set okato = '11100000000' where offname = 'Ненецкий' and orig_level = 1;
update addresses set okato = '99000000000' where offname = 'Еврейская' and orig_level = 1;
update addresses set okato = '67000000000' where offname = 'Севастополь' and orig_level = 1;
update addresses set okato = '77000000000' where offname = 'Чукотский' and orig_level = 1;
update addresses set okato = '71140000000' where offname = 'Ямало-Ненецкий' and orig_level = 1;
update addresses set okato = '55000000000' where offname = 'Байконур' and orig_level = 1;
update addresses set okato = '30000000000' where offname = 'Камчатский' and orig_level = 1;
update addresses set okato = '81000000000' where offname = 'Бурятия' and orig_level = 1;
update addresses set okato = '58000000000' where offname = 'Псковская' and orig_level = 1;
update addresses set okato = '36000000000' where offname = 'Самарская' and orig_level = 1;
update addresses set okato = '70000000000' where offname = 'Тульская' and orig_level = 1;
update addresses set okato = '35000000000' where offname = 'Крым' and orig_level = 1;
update addresses set okato = '79000000000' where offname = 'Адыгея' and orig_level = 1;
update addresses set okato = '84000000000' where offname = 'Алтай' and orig_level = 1;
update addresses set okato = '80000000000' where offname = 'Башкортостан' and orig_level = 1;
update addresses set okato = '85000000000' where offname = 'Калмыкия' and orig_level = 1;
update addresses set okato = '82000000000' where offname = 'Дагестан' and orig_level = 1;
update addresses set okato = '26000000000' where offname = 'Ингушетия' and orig_level = 1;
update addresses set okato = '83000000000' where offname = 'Кабардино-Балкарская' and orig_level = 1;
update addresses set okato = '88000000000' where offname = 'Марий Эл' and orig_level = 1;
update addresses set okato = '91000000000' where offname = 'Карачаево-Черкесская' and orig_level = 1;
update addresses set okato = '87000000000' where offname = 'Коми' and orig_level = 1;
update addresses set okato = '86000000000' where offname = 'Карелия' and orig_level = 1;
update addresses set okato = '90000000000' where offname = 'Северная Осетия - Алания' and orig_level = 1;
update addresses set okato = '89000000000' where offname = 'Мордовия' and orig_level = 1;
update addresses set okato = '98000000000' where offname = 'Саха /Якутия/' and orig_level = 1;
update addresses set okato = '92000000000' where offname = 'Татарстан' and orig_level = 1;
update addresses set okato = '96000000000' where offname = 'Чеченская' and orig_level = 1;
update addresses set okato = '93000000000' where offname = 'Тыва' and orig_level = 1;
update addresses set okato = '94000000000' where offname = 'Удмуртская' and orig_level = 1;
update addresses set okato = '95000000000' where offname = 'Хакасия' and orig_level = 1;
update addresses set okato = '04000000000' where offname = 'Красноярский' and orig_level = 1;
update addresses set okato = '97000000000' where offname = 'Чувашская Республика -' and orig_level = 1;
update addresses set okato = '01000000000' where offname = 'Алтайский' and orig_level = 1;
update addresses set okato = '03000000000' where offname = 'Краснодарский' and orig_level = 1;
update addresses set okato = '07000000000' where offname = 'Ставропольский' and orig_level = 1;
update addresses set okato = '05000000000' where offname = 'Приморский' and orig_level = 1;
update addresses set okato = '17000000000' where offname = 'Владимирская' and orig_level = 1;
update addresses set okato = '10000000000' where offname = 'Амурская' and orig_level = 1;
update addresses set okato = '12000000000' where offname = 'Астраханская' and orig_level = 1;
update addresses set okato = '08000000000' where offname = 'Хабаровский' and orig_level = 1;
update addresses set okato = '14000000000' where offname = 'Белгородская' and orig_level = 1;
update addresses set okato = '11000000000' where offname = 'Архангельская' and orig_level = 1;
update addresses set okato = '15000000000' where offname = 'Брянская' and orig_level = 1;
update addresses set okato = '18000000000' where offname = 'Волгоградская' and orig_level = 1;
update addresses set okato = '20000000000' where offname = 'Воронежская' and orig_level = 1;
update addresses set okato = '19000000000' where offname = 'Вологодская' and orig_level = 1;
update addresses set okato = '25000000000' where offname = 'Иркутская' and orig_level = 1;
update addresses set okato = '24000000000' where offname = 'Ивановская' and orig_level = 1;
update addresses set okato = '34000000000' where offname = 'Костромская' and orig_level = 1;
update addresses set okato = '27000000000' where offname = 'Калининградская' and orig_level = 1;
update addresses set okato = '29000000000' where offname = 'Калужская' and orig_level = 1;
update addresses set okato = '32000000000' where offname = 'Кемеровская' and orig_level = 1;
update addresses set okato = '33000000000' where offname = 'Кировская' and orig_level = 1;
update addresses set okato = '37000000000' where offname = 'Курганская' and orig_level = 1;
update addresses set okato = '42000000000' where offname = 'Липецкая' and orig_level = 1;
update addresses set okato = '38000000000' where offname = 'Курская' and orig_level = 1;
update addresses set okato = '41000000000' where offname = 'Ленинградская' and orig_level = 1;
update addresses set okato = '44000000000' where offname = 'Магаданская' and orig_level = 1;
update addresses set okato = '46000000000' where offname = 'Московская' and orig_level = 1;
update addresses set okato = '22000000000' where offname = 'Нижегородская' and orig_level = 1;
update addresses set okato = '47000000000' where offname = 'Мурманская' and orig_level = 1;
update addresses set okato = '49000000000' where offname = 'Новгородская' and orig_level = 1;
update addresses set okato = '53000000000' where offname = 'Оренбургская' and orig_level = 1;
update addresses set okato = '52000000000' where offname = 'Омская' and orig_level = 1;
update addresses set okato = '50000000000' where offname = 'Новосибирская' and orig_level = 1;
update addresses set okato = '54000000000' where offname = 'Орловская' and orig_level = 1;
update addresses set okato = '56000000000' where offname = 'Пензенская' and orig_level = 1;
update addresses set okato = '57000000000' where offname = 'Пермский' and orig_level = 1;