@cschrometest
Feature: Business portal client service

  Scenario: Restore password(negative scenario)#157247

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative1" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative1" on "LoginPage"
    Then verify that element with text "errorHint" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative2" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative2" on "LoginPage"
    Then verify that element with text "errorHint" "exists" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative3" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative3" on "LoginPage"
    Then verify that element with text "errorHint" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative3" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative3" on "LoginPage"
    Then verify that element with text "errorHint" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative4" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative4" on "LoginPage"
    Then verify that element with text "errorHint1" "exists" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative5" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative5" on "LoginPage"
    Then verify that element with text "errorHint1" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative6" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative6" on "LoginPage"
    Then verify that element with text "errorHint1" "exists" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative7" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative7" on "LoginPage"
    Then verify that element with text "errorHint1" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative8" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative8" on "LoginPage"
    Then verify that element with text "errorHint1" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative9" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative9" on "LoginPage"
    Then verify that element with text "errorHint1" "exists" on "LoginPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When type to input with name "newPassword" property: "password.negative9" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.negative10" on "LoginPage"
    Then verify that element with text "errorHint2" "exists" on "LoginPage"

  Scenario: Restore password of the personal account #157180

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Authorization and logout of the user in the personal account#157175#157177

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Authorization of the user in the personal account(negative scenario - wrong pass)#157191

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "wrongpassword" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that element with text "errorMessage" "exists" on "LoginPage"

  Scenario: Authorization of the user in the personal account(negative scenario - wrong login)#157191

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "wronglogin" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that element with text "errorMessage" "exists" on "LoginPage"

  Scenario: Send message #157198

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When press button with text "letters" on "MainPage"
    When press button with text "writeLetter" on "ActionPage"
    When press button with text "questionCategory" on "ActionPage"
    When press button with text "openAccount" on "ActionPage"
    And type to input with name "theme" property: "text.for.theme" on "ActionPage"
    And type to input with name "message" property: "text.for.message" on "ActionPage"
    When press button with text "addFile" on "ActionPage"
    When load file with address "test.jpg.file.address"
    When press button with text "sendMessage" on "ActionPage"
    Then verify that element with text "testRequest" "exists" on "ActionPage"
    When press button with text "signOut" on "MainPage"
    Then verify that page with url "http://rumskapt273.open.ru/273/login" is opened

  Scenario: Change phone number#157222

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "settings" on "MainPage"
    When press button with text "changePhone" on "ActionPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePhone" and save as property "phone"
    And type to input with name "inputNumber" property: "phone" on "ActionPage"
    When press button with text "savePhone" on "ActionPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "ActionPage"
    When press button with text "sign" on "ActionPage"
    When wait "25000"ms
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "ActionPage"
    When press button with text "sign" on "ActionPage"
    When press button with text "settings" on "MainPage"
    Then verify that element with text "phone" contains property "phone" on "ActionPage"
    When press button with text "close" on "ActionPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Restore password of the personal account(Resending smscode by timer)#166768

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When wait "330000"ms
    Then verify that element with text "resendCode" "exists" on "LoginPage"
    When press button with text "resendCode" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Restore password of the personal account with wrong smscode#157210

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "wrongsmscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    Then verify that element with text "wrongCode" "exists" on "LoginPage"

  Scenario: Restore password by signer#166770

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "signer.login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "signer.login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "signer.password"
    When type to input with name "newPassword" property: "signer.password" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "signer.password" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "signer.login" on "LoginPage"
    And type to input with name "password" property: "signer.password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Restore password with validation#157243

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation1" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation1" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation1" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation2" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation2" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation2" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation3" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation3" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation3" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation4" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation4" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation4" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation5" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation5" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation5" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation6" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation6" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation6" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation7" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation7" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation7" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password.validation8" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password.validation8" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password.validation8" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"
  #need to refresh password after tests, so just restore pass again
  Scenario: Restore password of the personal account #157180

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    When press button with text "restore" on "LoginPage"
    And type to input with name "login" property: "login" on "LoginPage"
    When press button with text "restore1" on "LoginPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastReference" and save as property "reference.to.confirm"
    Given open link from property "reference.to.confirm"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "LoginPage"
    When press button with text "confirm" on "LoginPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generatePassword" and save as property "password"
    When type to input with name "newPassword" property: "password" on "LoginPage"
    When type to input with name "repeatNewPassword" property: "password" on "LoginPage"
    When press button with text "savePassword" on "LoginPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Change login #157184

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "settings" on "MainPage"
    When press button with text "changeLogin" on "ActionPage"
    And type to input with name "currentPass" property: "password" on "ActionPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generateLogin" and save as property "login"
    And type to input with name "newLogin" property: "login" on "ActionPage"
    When press button with text "saveLogin" on "ActionPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode1" property: "smscode" on "ActionPage"
    When press button with text "confirm1" on "ActionPage"
    When press button with text "signOut" on "MainPage"
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Change email #157224

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "settings" on "MainPage"
    When get param from class "ru.open.helpers.TextGenerator" by method "generateEmail" and save as property "email"
    When press button with text "changeEmail" on "ActionPage"
    And type to input with name "newEmail" property: "email" on "ActionPage"
    When press button with text "saveEmail" on "ActionPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode2" property: "smscode" on "ActionPage"
    When press button with text "confirm1" on "ActionPage"
    When get param from class "ru.open.parsers.LogParser" by method "getReferenceToChangeEmail" and save as property "reference.to.change.email"
    Given open link from property "reference.to.change.email"
    When wait "20000"ms
    When press button with text "settings" on "MainPage"
    Then verify that element with text "email" contains property "email" on "ActionPage"
    When press button with text "close" on "ActionPage"
    Then verify that page with url "http://rumskapt273.open.ru/main" is opened
    When press button with text "signOut" on "MainPage"

  Scenario: Check rates #157204 and get help#226647

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "rate" on "MainPage"
    Then verify that element with text "rate1" contains property "rate1" on "ActionPage"
    Then verify that element with text "rate2" contains property "rate2" on "ActionPage"
    Then verify that element with text "rate3" contains property "rate3" on "ActionPage"
    Then verify that element with text "account" "exists" on "ActionPage"
    When press button with text "rate1" on "ActionPage"
    Then verify that element with text "rateInfo" contains property "rate1" on "ActionPage"
    Then verify that element with text "rateInfo1" "exists" on "ActionPage"
    Then verify that element with text "rateInfo2" "exists" on "ActionPage"
    Then verify that element with text "rateInfo3" "exists" on "ActionPage"
    When press button with text "rate" on "MainPage"
    When press button with text "rate2" on "ActionPage"
    Then verify that element with text "rateInfo" contains property "rate2" on "ActionPage"
    Then verify that element with text "rateInfo1" "exists" on "ActionPage"
    Then verify that element with text "rateInfo2" "exists" on "ActionPage"
    Then verify that element with text "rateInfo3" "exists" on "ActionPage"
    When press button with text "rate" on "MainPage"
    When press button with text "rate3" on "ActionPage"
    Then verify that element with text "rateInfo" contains property "rate3" on "ActionPage"
    Then verify that element with text "rateInfo1" "exists" on "ActionPage"
    Then verify that element with text "rateInfo2" "exists" on "ActionPage"
    Then verify that element with text "rateInfo3" "exists" on "ActionPage"
    Given open link from property "business.portal.link"
    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
    When press button with text "help" on "ActionPage"
    When press button with text "helpMenu" on "ActionPage"
    When press button with text "helpMenuOptionOne" on "ActionPage"
    When press button with text "order" on "ActionPage"
    When press button with text "confirm" on "ActionPage"
    When wait "30000"ms
    When press button with text "closeHelp" on "ActionPage"
    When press button with text "help" on "ActionPage"
    Then verify that element with text "helpDoc" "exists" on "ActionPage"
    Then press button with text "deleteDoc" on "ActionPage"
    Then press button with text "deleteDoc1" on "ActionPage"

  # Scenario: Khabenskiy's fund#247871
    #wait for access to system

  # Scenario: filling out a draft#157236
    #functional has not been developed yet

  # Scenario: filling out a draft#157237
    #functional has not been developed yet

  # Scenario: filling out a draft#157238
    #functional has not been developed yet

  # Scenario: filling out a draft#157239
    #functional has not been developed yet

  # Scenario: filling out a draft#157239
    #functional has not been developed yet

#  bugs
#  Scenario: UIDM logging #218218
#    #doesn't work last 5 days of month
#    Given open link from property "business.portal.link"
#    And type to input with name "userName" property: "login" on "LoginPage"
#    And type to input with name "password" property: "password" on "LoginPage"
#    When press button with text "signIn" on "LoginPage"
#    Then verify that page with url "http://rumskapt273.open.ru/main/" is opened
#    When press button with text "rate" on "MainPage"
#    When get param from class "ru.open.parsers.LogParser" by method "getLastRate" and save as property "current.rate"
#    When get param from class "ru.open.helpers.TextGenerator" by method "generateNewRate" and save as property "new.rate"
#    When press button with text "account" on "ActionPage"
#    When press button with text "changeRate" on "ActionPage"
#    When press button with text "ratesTable" on "ActionPage"
#    When execute method "verifyLogs" from class "ru.open.parsers.LogParser" on ""









    































