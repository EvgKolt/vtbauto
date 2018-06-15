@businessportaltest
Feature: Business portal

  Scenario: Restore password of the personal account #157180

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

  @last
  Scenario: Authorization and logout of the user in the personal account#157175#157177

    Given open link from property "business.portal.link"
    And type to input with name "username" property: "login" on "LoginPage"
    And type to input with name "pass" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Authorization of the user in the personal account(negative scenario - wrong pass)#157191

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "wrongpassword" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверный логин" "exists" on "LoginPage"

  Scenario: Authorization of the user in the personal account(negative scenario - wrong login)#157191

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "wronglogin" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that element with text "Неверный логин" "exists" on "LoginPage"

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
    Then verify that element with text "Тестовый запрос" "exists" on "ActionPage"
    When press button with text "Выйти" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Restore password of the personal account(Resending smscode by timer)#166768

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When wait "330000"ms
    Then verify that element with text "Выслать код повторно" "exists" on "LoginPage"
    When press button with text "Выслать код повторно" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
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
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "wrongsmscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    Then verify that element with text "Неверный код" "exists" on "LoginPage"

  Scenario: Restore password by signer#166770

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "signer.login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "signer.login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "signer.password"
    When type to input with name "Новый пароль" property: "signer.password" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "signer.password" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "signer.login" on "LoginPage"
    And type to input with name "Пароль" property: "signer.password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

  Scenario: Restore password with validation#157243

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation1" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation1" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation1" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation2" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation2" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation2" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation3" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation3" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation3" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.parsersandhelpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation4" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation4" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation4" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation5" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation5" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation5" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation6" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation6" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation6" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation7" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation7" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation7" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsersandhelpers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "Новый пароль" property: "password.validation8" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.validation8" on "LoginPage"
    When press button with text "Сохранить пароль" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password.validation8" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Выйти" on "MainPage"

  Scenario: Restore password(negative scenario)#157247

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative1" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative1" on "LoginPage"
    Then verify that element with text "Пароль меньше 8" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative2" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative2" on "LoginPage"
    Then verify that element with text "Пароль меньше 8" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists
    When type to input with name "Новый пароль" property: "password.negative3" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative3" on "LoginPage"
    Then verify that element with text "Пароль меньше 8" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative3" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative3" on "LoginPage"
    Then verify that element with text "Пароль меньше 8" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative4" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative4" on "LoginPage"
    Then verify that element with text "Пароль не подходит" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists
    When type to input with name "Новый пароль" property: "password.negative5" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative5" on "LoginPage"
    Then verify that element with text "Пароль не подходит" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative6" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative6" on "LoginPage"
    Then verify that element with text "Пароль не подходит" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists
    When type to input with name "Новый пароль" property: "password.negative7" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative7" on "LoginPage"
    Then verify that element with text "Пароль не подходит" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative8" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative8" on "LoginPage"
    Then verify that element with text "Пароль не подходит" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative9" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative9" on "LoginPage"
    Then verify that element with text "Пароль не подходит" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    When press button with text "Восстановить" on "LoginPage"
    And type to input with name "Логин" property: "login" on "LoginPage"
    When press button with text "Восстановить_" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС код" property: "smscode" on "LoginPage"
    When press button with text "Подтвердить" on "LoginPage"
    When type to input with name "Новый пароль" property: "password.negative9" on "LoginPage"
    When type to input with name "Повторить новый пароль" property: "password.negative10" on "LoginPage"
    Then verify that element with text "Пароли не совпадают" "exists" on "LoginPage"
    Then verify that image "src/main/resources/imgs/savepassnotactive.png" exists

  Scenario: Change phone number#157222

    Given open link from property "business.portal.link"
    And type to input with name "Имя пользователя" property: "login" on "LoginPage"
    And type to input with name "Пароль" property: "password" on "LoginPage"
    When press button with text "Войти" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "Настройки" on "MainPage"
    When press button with text "Изменить телефон" on "ActionPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePhone" and save as property "phone"
    And type to input with name "Новый телефон" property: "phone" on "ActionPage"
    When press button with text "Сохранить телефон" on "ActionPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС Код" property: "smscode" on "ActionPage"
    When press button with text "Подписать" on "ActionPage"
    When wait "25000"ms
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "СМС Код" property: "smscode" on "ActionPage"
    When press button with text "Подписать" on "ActionPage"
    When press button with text "Настройки" on "MainPage"
    Then verify that element with text "Номер телефона" contains property "phone" on "ActionPage"



















