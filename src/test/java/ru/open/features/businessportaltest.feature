@businessportaltest
Feature: Business portal

  Scenario: Authorization and logout of the user in the personal account#157175#157177

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Authorization of the user in the personal account(negative scenario - wrong pass)#157191

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "wrongpassword" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверный логин" exists on "LoginPage"

  Scenario: Authorization of the user in the personal account(negative scenario - wrong login)#157191

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "wronglogin" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверный логин" exists on "LoginPage"

  Scenario: Send message #157198

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    When press button with text "Письма" on "MainPage"
    When press button with text "Написать письмо" on "ActionPage"
    When press button with text "Категория вопроса" on "ActionPage"
    When press button with text "Открытие счета" on "ActionPage"
    And type to input with name "Тема" property: "text.for.theme" on "ActionPage"
    And type to input with name "Сообщение" property: "text.for.message" on "ActionPage"
    When press button with text "Приложить файл" on "ActionPage"
    When load file with address "test.jpg.file.address"
    When press button with text "Отправить" on "ActionPage"
    Then verify that element with text "Тестовый запрос" exists on "ActionPage"
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Restore password of the personal account #157180

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

  Scenario: Restore password of the personal account(Resending smscode by timer)#166768

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When wait "330000"ms
    Then verify that element with text "Выслать код повторно" exists on "LoginPage"
    When press button with text "Выслать код повторно" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

  Scenario: Restore password of the personal account with wrong smscode#157210

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "wrongsmscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    Then verify that element with text "Неверный код" exists on "LoginPage"

  Scenario: Restore password by signer#166770

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"







