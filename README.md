# Экзамен java core

Экзамен состоит из теоретической и практической части.

## Теоретическая часть

Теоретическая часть - тесты.
Максимально возможная оценка теоретической части - 10 баллов (тесты на русском) и 12 баллов (тесты на английсокм).

* [Тесты на русском](https://forms.gle/TxxjN8ZkvogwLJ7o8)
* [Test in engish](https://forms.gle/wubcNqA6NH9UsGSq9)


## Практическая часть


Реализовать консольную программу на `Java`, которая бы представляла некую реализацию командной строки, то есть могла бы выполнять команды вводимые построчно пользователем. 

Под командой понимается следующая строка:
"имя команды" "аргумент №1" "аргумент №2" ... "аргумент №N"

Код, который выполняет необходимую команду пользователя, должен оформляться как отдельный Java класс. 

Команда во время выполнения может так же взаимодействовать с пользователем используя стандартный ввод/вывод.

Программа должна поддерживать следующие команды:
*    `dir` — выводит список файлов и директорий в текущей директории
*    `cd` «путь» — перейти в директорию, путь к которой задан первым аргументом
*    `pwd` — вывести полный путь до текущей директории
*    `cat` «имя_файла» - выводит содержимое текстового файла «имя_файла»

Максимальная оценка задания: 10 баллов

Дополнительные задания:

1. Команда `download` «url» «имя_файла» - загружает файл (+1 балл)
2. Соответствие между классом и именем команды должно задаваться в конфигурационном файле программы. (+1 балл)
3. Программа должна поддерживать возможность запускать команды в фоновом режиме. Для этого достаточно в конце командной строчки ввести знак "&". (+2 балла)
4. Команда find выполняет поиск файла в файловой системе. Так же программа должна поддерживать команду `jobs`, которая выводит список задач, которые выполняются в фоне (+2 балла)

Практическую часть экзамена необходимо выгрузить на mystat до субботы (5 октября).


