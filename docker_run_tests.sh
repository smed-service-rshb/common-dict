#!/bin/bash

# build params
# $1 - http port number

# Запускаем контейнер интеграционных тестов (с ожидание ответа от ключевых систем), результат выполнения интеграционных тестов будет сохранен в директорию билда
docker-compose -f docker-compose.test.yml -f docker-compose.integration-tests.yml run -u $(id -u) integration-test \
    ../wait-for-it.sh common-dict-app:$1 -s -t 1000 -- \
    mvn verify -Duser.home=/var/maven