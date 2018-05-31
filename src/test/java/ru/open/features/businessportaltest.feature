@businessportaltest
Feature: Бизнес портал

  Scenario: Авторизация и ЛогАут юзера в личном кабинете#157175#157177

    Given open businessportal
    And type to input with name "Имя пользователя" text: "7701787371" on "LoginPage"
    And type to input with name "Пароль" text: "!Qwerty123" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Авторизация юзера в личном кабинете(негативные сценарии - неверный пароль)#157191

    Given open businessportal
    And type to input with name "Имя пользователя" text: "7701787371" on "LoginPage"
    And type to input with name "Пароль" text: "123" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверная пара логин/пароль" exists

  Scenario: Авторизация юзера в личном кабинете(негативные сценарии - неверный логин)#157191

    Given open businessportal
    And type to input with name "Имя пользователя" text: "123" on "LoginPage"
    And type to input with name "Пароль" text: "!Qwerty123" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверная пара логин/пароль" exists

  Scenario: Отправка письма #157198

    Given open businessportal
    And type to input with name "Имя пользователя" text: "7701787371" on "LoginPage"
    And type to input with name "Пароль" text: "!Qwerty123" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    When press button with text "Письма" on "MainPage"
    When press button with text "Написать письмо" on "ActionPage"
    When press button with text "Категория вопроса" on "ActionPage"
    When press button with text "Открытие счета" on "ActionPage"
    And type to input with name "Тема" text: "Тестовый запрос" on "ActionPage"
    And type to input with name "Сообщение" text: "Автоматический тестовый прогон" on "ActionPage"
    When press button with text "Приложить файл" on "ActionPage"
    When load file with address "C:\Users\koltunovskiy_ea\Documents\JPGtestfile.jpg"
    When press button with text "Отправить" on "ActionPage"
    Then verify that element with text "Тестовый запрос" exists

  @last
  Scenario: Отправка письма #157198

    Given open businessportal
    And type to input with name "Имя пользователя" text: "7701787371" on "LoginPage"
    And type to input with name "Пароль" text: "!Qwerty123" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    When press button with text "Письма" on "MainPage"
    When press button with text "Написать письмо" on "ActionPage"
    When press button with text "Категория вопроса" on "ActionPage"
    When press button with text "Открытие счета" on "ActionPage"
    And type to input with name "Тема" text: "Тестовый запрос" on "ActionPage"
    And type to input with name "Сообщение" text: "Автоматический тестовый прогон" on "ActionPage"
    When press button with text "Приложить файл" on "ActionPage"
    When load file with address "C:\Users\koltunovskiy_ea\Documents\JPGtestfile.jpg"
    When press button with text "Отправить" on "ActionPage"
    Then verify that element with text "Тестовый запрос" exists