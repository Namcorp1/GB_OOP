# Домашнее задание №5
Задание
1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
2. Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher,
   List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его
3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
   преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
   Формат сдачи: ссылка на гитхаб проект

## Решение:
1. Запуск всей программы осуществляется в App
2. Очередность методов и условия выбора описаны в Controller
3. Логика действий описана в классе Model, который имплементирует интерфейс StudeGroupService
4. В классе View описан вывод меню и прочей информации в консоль
5. Классы Student и Teacher образованы от абстрактного класса User