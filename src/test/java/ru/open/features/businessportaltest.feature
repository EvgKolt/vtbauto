@businessportaltest
Feature: Бизнес портал

  Scenario: Авторизация и ЛогАут юзера в личном кабинете

    Given open businessportal
    And type to input with name "Имя пользователя" text: "7701787371" on "LoginPage"
    And type to input with name "Пароль" text: "!Qwerty123" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened
