@businessportaltest
Feature: Бизнес портал

  Scenario: Авторизация и ЛогАут юзера в личном кабинете#157175#157177

    Given open businessportal
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Авторизация юзера в личном кабинете(негативные сценарии - неверный пароль)#157191

    Given open businessportal
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "wrongpassword" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверный логин" exists on "LoginPage"

  Scenario: Авторизация юзера в личном кабинете(негативные сценарии - неверный логин)#157191

    Given open businessportal
    And type to input with name "Имя пользователя" property: "wronglogin" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверный логин" exists on "LoginPage"

  Scenario: Отправка письма #157198

    Given open businessportal
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    When press button with text "Письма" on "MainPage"
    When press button with text "Написать письмо" on "ActionPage"
    When press button with text "Категория вопроса" on "ActionPage"
    When press button with text "Открытие счета" on "ActionPage"
    And type to input with name "Тема" property: "textfortheme" on "ActionPage"
    And type to input with name "Сообщение" property: "textformessage" on "ActionPage"
    When press button with text "Приложить файл" on "ActionPage"
    When load file with address "testjpgfileaddress"
    When press button with text "Отправить" on "ActionPage"
    Then verify that element with text "Тестовый запрос" exists on "ActionPage"
