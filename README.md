
# Микросервис общих справочников

[rest-api](docs/API.md) <br/>
[docker](docs/docker.md)

#Обновление справочников
http://confluence.softlab.ru/pages/viewpage.action?pageId=319225865

# Поставка печатных форм
Пример создания нового шаблона:

    insert into common_dict.PRINT_TEMPLATES(TYPE, COPIES_NUMBER, FILE_NAME, CONTENT)
    values ('1f2434ae-5eb1-4b10-8f83-2cbcddfdb100', 
    7, 
    'УСЛОВИЯ СТРАХОВАНИЯ №1-МС «ВЫБЕРИ ЗДОРОВЬЕ»', 
    convert_to('...'::text, 'utf8'))
       ON CONFLICT (type)
       DO NOTHING;
 Пример обновления существующего шаблона:
 
     UPDATE common_dict.PRINT_TEMPLATES
     SET  content = convert_to('...'::text, 'utf8')
     WHERE FILE_NAME = 'Памятка к договору и договор страхования';