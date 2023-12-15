# API микросервиса общих справочников

## API сервисов для работы  co справочником банков

### Постраничный вывод справочника банков, банки выводятся только с полем deleted установленным в false
Адрес: `/dictionaries/banks`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице (по умолчанию 50)
* `sort`: поля для сортировки, например: `sort=name&sort=bic,desc`
* `name`: подстрока с именем банка, по которой будет производиться регистронезависимый поиск
* `bic`: подстрока с БИК банка, по которой будет производиться поиск

Ответ:  
`403 FORBIDDEN`:  нет доступа  
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "name":"Банк №1",
    "shortName":"Банк №1",
    "bic":"111",
    "swift":null,
    "description":null,
    "corrAccount":null,
    "address":null,
    "changedByHand":false,
    "resident":true,
    "deleted":false
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности банка
Адрес: `/dictionaries/banks/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:   
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "name":"Банк №1",
    "shortName":"Банк №1",
    "bic":"111",
    "swift":null,
    "description":null,
    "corrAccount":null,
    "address":null,
    "changedByHand":false,
    "resident":true,
    "deleted":false
}
```

### Создание банка
Адрес: `/dictionaries/banks`  
Метод: `POST`  
Запрос:  
```json
{
    "name":"Банк №1",
    "shortName":"Банк №1",
    "bic":"111",
    "swift":null,
    "description":null,
    "corrAccount":null,
    "address":null,
    "changedByHand":false,
    "resident":true,
    "deleted":false
}
```
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`409 CONFLICT`:  если указан id и банк с таким id уже существует   
`201 CREATED`:  заголовок `location` будет содержать ссылку на созданный банк `...\bank\{id}`
```json
{
    "id":1,
    "name":"Банк №1",
    "shortName":"Банк №1",
    "bic":"111",
    "swift":null,
    "description":null,
    "corrAccount":null,
    "address":null,
    "changedByHand":false,
    "resident":true,
    "deleted":false
}
```

### Редактирование банка
Адрес: `/dictionaries/banks/{id}`  
Метод: `PUT`  
Запрос:  
```json
{
    "name":"Банк №1",
    "shortName":"Банк №1",
    "bic":"111",
    "swift":null,
    "description":null,
    "corrAccount":null,
    "address":null,
    "changedByHand":false,
    "resident":true,
    "deleted":false
}
```
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "name":"Банк №1",
    "shortName":"Банк №1",
    "bic":"111",
    "swift":null,
    "description":null,
    "corrAccount":null,
    "address":null,
    "changedByHand":false,
    "resident":true,
    "deleted":false
}
```

### Удаление банка
Адрес: `/dictionaries/banks/{id}`  
Метод: `DELETE`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`204 NO_CONTENT`: запись успешно удалена (в БД запись остается с флагом ```deleted=true```)

### Репликация
Адрес: `/dictionaries/banks/replication`  
Метод: `POST`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`500 INTERNAL_SERVER_ERROR`: ошибка на сервере, невозможно прочитать файл
`204 NO_CONTENT`:  запрос успешно выполнен, нечего возвращать   

## API сервисов для работы co справочником филиалов

### Постраничный вывод справочника филиалов

Адрес: `/dictionaries/branches`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице (по умолчанию 50)
* `sort`: поля для сортировки, например: `sort=simpleName`

Ответ:    
`403 FORBIDDEN`:  нет доступа     
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "code": "код_филиала",
    "simpleName":"Банк №1",
    "officialName":"Отделение Банка №1 в городе"
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности филиала по id

Адрес: `/dictionaries/branches/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "code": "код_филиала",
    "simpleName":"Банк №1",
    "officialName":"Отделение Банка №1 в городе"
}
```

### Получение сущности филиала по коду

Адрес: `/dictionaries/branches/?code={code}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "code": "код_филиала",
    "simpleName":"Банк №1",
    "officialName":"Отделение Банка №1 в городе"
}
```


## API сервисов для работы co справочником каналов

### Постраничный вывод справочника каналов

Адрес: `/dictionaries/channels`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице
* `sort`: поля для сортировки, например: `sort=simpleName`

Ответ:    
`403 FORBIDDEN`:  нет доступа     
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "shortName":"Отд",      //краткое название канала для отображения в списках
    "fullName":"Отделение"  //полное название канала
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности канала по id

Адрес: `/dictionaries/channels/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "simpleName":"канал 1",
    "officialName":"Канал № 1"
}
```


## API сервисов для работы co справочником внешних систем

### Постраничный вывод справочника внешних систем

Адрес: `/dictionaries/external-systems`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице (по умолчанию 50)
* `sort`: поля для сортировки, например: `sort=name`

Ответ:    
`403 FORBIDDEN`:  нет доступа     
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "name":"внешняя система",
    "connectTimeout":"1000",
    "failurePeriod":"5000",
    "failurePeriodCount":"5"
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности внешней системы по id

Адрес: `/dictionaries/external-systems/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа      
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "name":"внешняя система",
    "connectTimeout":"1000",
    "failurePeriod":"5000",
    "failurePeriodCount":"5"
}
```

### Создание внешней системы

Адрес: `/dictionaries/external-systems`  
Метод: `POST`  
Запрос: 
```json
{
    "name":"внешняя система",
    "connectTimeout":"1000",
    "failurePeriod":"5000",
    "failurePeriodCount":"5"
}
```
Ответ:       
`403 FORBIDDEN`:  нет доступа         
`409 CONFLICT`:  если указан id и внешняя система с таким id уже существует   
`201 CREATED`:  заголовок `location` будет содержать ссылку на созданный банк `...\external-systems\{id}`
```json
{
    "id":1,
    "name":"внешняя система",
    "connectTimeout":"1000",
    "failurePeriod":"5000",
    "failurePeriodCount":"5"
}
```

### Редактирование внешней системы по id
Адрес: `/dictionaries/external-systems/{id}`  
Метод: `PUT`  
Запрос:  
```json
{
    "name":"внешняя система",
    "connectTimeout":"1000",
    "failurePeriod":"5000",
    "failurePeriodCount":"5"
}
```
Ответ:    
`403 FORBIDDEN`:  нет доступа            
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "name":"внешняя система",
    "connectTimeout":"1000",
    "failurePeriod":"5000",
    "failurePeriodCount":"5"
}
```

### Удаление внешней системы по id
Адрес: `/dictionaries/external-systems/{id}`  
Метод: `DELETE`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                  
`404 NOT_FOUND`:  запись не найдена   
`204 NO_CONTENT`: запись успешно удалена


## API сервисов для работы co справочником ошибок внешних систем

### Постраничный вывод справочника ошибок внешних систем

Адрес: `/dictionaries/external-system-errors`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице (по умолчанию 50)
* `sort`: поля для сортировки, например: `sort=serviceName`

Ответ:    
`403 FORBIDDEN`:  нет доступа                  
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "serviceName":"редактирование банка",
    "errorCode":"1",
    "message":"Ошибка"
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности ошибки внешней системы по id

Адрес: `/dictionaries/external-system-errors/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                   
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "serviceName":"редактирование банка",
    "errorCode":"1",
    "message":"Ошибка"
}
```

### Создание ошибки внешней системы

Адрес: `/dictionaries/external-system-errors`  
Метод: `POST`  
Запрос: 
```json
{
    "serviceName":"редактирование банка",
    "errorCode":"1",
    "message":"Ошибка"
}
```
Ответ:    
`403 FORBIDDEN`:  нет доступа                   
`409 CONFLICT`:  если указан id и ошибка внешней системы с таким id уже существует   
`201 CREATED`:  заголовок `location` будет содержать ссылку на созданный банк `...\external-system-errors\{id}`
```json
{
    "id":1,
    "serviceName":"редактирование банка",
    "errorCode":"1",
    "message":"Ошибка"
}
```

### Редактирование ошибки внешней системы по id
Адрес: `/dictionaries/external-system-errors/{id}`  
Метод: `PUT`  
Запрос:  
```json
{
    "serviceName":"редактирование банка",
    "errorCode":"1",
    "message":"Ошибка"
}
```
Ответ:    
`403 FORBIDDEN`:  нет доступа                   
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "serviceName":"редактирование банка",
    "errorCode":"1",
    "message":"Ошибка"
}
```

### Удаление ошибки внешней системы по id
Адрес: `/dictionaries/external-system-errors/{id}`  
Метод: `DELETE`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                   
`404 NOT_FOUND`:  запись не найдена   
`204 NO_CONTENT`: запись успешно удалена


## API сервисов для работы co справочником офисов

### Постраничный вывод справочника офисов

Адрес: `/dictionaries/offices`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице (по умолчанию 50)
* `sort`: поля для сортировки, например: `sort=simpleName`

Ответ:    
`403 FORBIDDEN`:  нет доступа                  
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "rfId":2,
    "simpleName":"Офис № 1",
    "officialName":"Офис № 1 в городе",
    "postAddress":"улица Цезаря, 1",
    "phone":"+1-234-567-89-01",
    "startTime":"8:00",
    "endTime":"19:00"
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности офиса по id

Адрес: `/dictionaries/offices/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                 
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "rfId":2,
    "simpleName":"Офис № 1",
    "officialName":"Офис № 1 в городе",
    "postAddress":"улица Цезаря, 1",
    "phone":"+1-234-567-89-01",
    "startTime":"8:00",
    "endTime":"19:00"
}
```

## API сервисов для работы co справочником "Коды подразделений"

### Постраничный вывод справочника

Адрес: `/dictionaries/division-codes`  
Метод: `GET`  
Запрос: -  
Необязательные параметры:
* `page`: номер страницы (нумерация с 0)
* `size`: количество записей на странице (по умолчанию 50)
* `sort`: поля для сортировки, например: `sort=code`

Ответ:    
`403 FORBIDDEN`:  нет доступа                  
`200 OK`:  
```json
{
  "content":[{  //данные справочника
    "id":1,
    "code":"123-456",
    "description":"Подразделение № 1 в г. Москва"
    },...
  ],
  "totalElements":7, // общее количество элементов
  "totalPages":1,      // общее количество страниц
  "last":true,             // является ли текущая страница последней
  "size":50,              // размер страницы
  "number":0,          // номер страницы (нумерация с 0)
  "sort":null,            // использованная сортировка
  "first":true,           // является ли страница первой
  "numberOfElements":7 // количество элементов на странице
}
```

### Получение сущности справочника "Коды подразделений" по id

Адрес: `/dictionaries/division-codes/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                 
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "code":"123-456",
    "description":"Подразделение № 1 в г. Москва"
}
```

### Получение сущности справочника "Коды подразделений" по коду подразделения

Адрес: `/dictionaries/division-codes/{code}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                 
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "code":"123-456",
    "description":"Подразделение № 1 в г. Москва"
}
```

### Создание сущности справочника "Коды подразделений"

Адрес: `/dictionaries/division-codes`  
Метод: `POST`  
Запрос: 
```json
{
    "code":"123-456",
    "description":"Подразделение № 1 в г. Москва"
}
```
Ответ:    
`403 FORBIDDEN`:  нет доступа                   
`409 CONFLICT`:  если указан id и запись с таким id уже существует   
`201 CREATED`:  заголовок `location` будет содержать ссылку на созданную запись `...\division-codes\{id}`
```json
{
    "code":"123-456",
    "description":"Подразделение № 1 в г. Москва"
}
```

## API сервисов для работы co справочником "Адреса"

### Поиск адреса

Адрес: `/dictionaries/addresses`  
Метод: `GET`  
Запрос: words - слова поиска   
Необязательные параметры:
* `parentId`: идентификатор родительской записи

Ответ:    
`400 BAD REQUEST`:  передан некорректный parentId   
`403 FORBIDDEN`:  нет доступа    
`404 NOT_FOUND`:  записи не найдены   
`200 OK`:  
не более 10 адресов в ответе
```json
{
  [{  //данные справочника
    "id":1,
    "offname":"Москва",
    "shortname":"г.",
    "level":"CITY",
    "fulladdress":"Московская обл. г. Москва",
    "postalcode":"111111"
    },...
  ]
}
```

### Получение списка родительских адресов

Адрес: `/dictionaries/addresses/{id}/parents`  
Метод: `GET`  
Запрос: -
Ответ:    
`403 FORBIDDEN`:  нет доступа    
`404 NOT_FOUND`:  адрес с указанным id не найден  
`200 OK`:  
```json
{
  [{  //данные справочника
    "id":1,
    "offname":"Москва",
    "shortname":"г.",
    "level":"CITY",
    "fulladdress":"Московская обл. г. Москва",
    "postalcode":"111111"
    },...
  ]
}
```

### Получение адреса по id

Адрес: `/dictionaries/addresses/{id}`  
Метод: `GET`  
Запрос: -  
Ответ:    
`403 FORBIDDEN`:  нет доступа                 
`404 NOT_FOUND`:  запись не найдена   
`200 OK`:  
```json
{
    "id":1,
    "offname":"Москва",
    "shortname":"г.",
    "level":"CITY",
    "fulladdress":"Московская обл. г. Москва",
    "postalcode":"111111"
}
```

### Получение списка строений для адреса с указанным id

Адрес: `/dictionaries/addresses/{id}/houses`  
Метод: `GET`  
Запрос: house - подстрока, cодержащая номер дома
Ответ:    
`400 BAD REQUEST`:  передан некорректный id     
`403 FORBIDDEN`:  нет доступа    
`404 NOT_FOUND`:  строения не найднены   
`200 OK`:  
```json
{
  [{  //данные справочника
    "id":1,
    "housenum":"22",
    "buildnum":"3",
    "strucnum":"1",
    "postalcode":"111111",
    "houseType":"BUILDING"
    },...
  ]
}
```


