@BPtest
Feature: Business portal card service
# bugs
#  Scenario: card replenishment#217623
#
#    Given open link from property "business.portal.link.cards"
#    And type to input with name "userName" property: "cards.login" on "LoginPage"
#    And type to input with name "password" property: "cards.password" on "LoginPage"
#    When press button with text "signIn" on "LoginPage"
#    When wait "5000"ms
#    When press button with text "businessCards" on "CardPage"
#    When press button with text "card" on "CardPage"
#    When press button with text "replenishment" on "CardPage"
#    And type to input with name "sum" property: "sum" on "CardPage"
#    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
#    And type to input with name "smsCode" property: "smscode" on "CardPage"
#    When press button with text "sign" on "CardPage"

  Scenario: Order card on BP#217560

    Given open link from property "business.portal.link.cards"
    When execute method "deleteCardOrderStatusFromBase" from class "ru.open.dao.DBConnect" on ""
    And type to input with name "userName" property: "cards.login1" on "LoginPage"
    And type to input with name "password" property: "cards.password1" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "5000"ms
    When press button with text "businessCards" on "CardPage"
    When press button with text "orderCard" on "CardPage"
    When press button with text "cardHolder" on "CardPage"
    When press button with text "cardHolderOption1" on "CardPage"
    And type to input with name "organ" property: "organ" on "CardPage"
    And type to input with name "placeOfBirth" property: "city" on "CardPage"
    And type to input with name "dateOfReg" property: "date" on "CardPage"
    And type to input with name "officeCode" property: "office.code" on "CardPage"
    And type to input with name "region" property: "region" on "CardPage"
    And type to input with name "city" property: "city" on "CardPage"
    And type to input with name "street" property: "street" on "CardPage"
    And type to input with name "house" property: "house" on "CardPage"
    And type to input with name "flat" property: "flat" on "CardPage"
    And type to input with name "organisation" property: "organisation" on "CardPage"
    And type to input with name "secretWord" property: "secret.word" on "CardPage"
    When press button with text "account" on "CardPage"
    When press button with text "account1" on "CardPage"
    And type to input with name "officeBank" property: "city" on "CardPage"
    When press button with text "officeBank1" on "CardPage"
    When press button with text "officeBank2" on "CardPage"
    When press button with text "officeBank3" on "CardPage"
    When execute method "moveMouseToPoint" from class "ru.open.helpers.Keyboard" on "//div[contains(@class, 'drawer__left')]/div[2]/div[3]/div"
    When press button with text "getCard" on "CardPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCodeForCard" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "CardPage"
    When press button with text "sign" on "CardPage"
    When execute method "deleteCardOrderStatusFromBase" from class "ru.open.dao.DBConnect" on ""


  Scenario: Prepare Card for checking statuses SKS #217603

    Given open link from property "business.portal.link.cards"
    When execute method "deleteCardOrderStatusFromBase" from class "ru.open.dao.DBConnect" on ""
    And type to input with name "userName" property: "cards.login1" on "LoginPage"
    And type to input with name "password" property: "cards.password1" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "15000"ms
    When press button with text "businessCards" on "CardPage"
    When press button with text "orderCard" on "CardPage"
    When press button with text "cardHolder" on "CardPage"
    When press button with text "cardHolderOption1" on "CardPage"
    And type to input with name "organ" property: "organ" on "CardPage"
    And type to input with name "placeOfBirth" property: "city" on "CardPage"
    And type to input with name "dateOfReg" property: "date" on "CardPage"
    And type to input with name "officeCode" property: "office.code" on "CardPage"
    And type to input with name "region" property: "region" on "CardPage"
    And type to input with name "city" property: "city" on "CardPage"
    And type to input with name "street" property: "street" on "CardPage"
    And type to input with name "house" property: "house" on "CardPage"
    And type to input with name "flat" property: "flat" on "CardPage"
    And type to input with name "organisation" property: "organisation" on "CardPage"
    And type to input with name "secretWord" property: "secret.word" on "CardPage"
    When press button with text "account" on "CardPage"
    When press button with text "account1" on "CardPage"
    And type to input with name "officeBank" property: "city" on "CardPage"
    When press button with text "officeBank1" on "CardPage"
    When press button with text "officeBank2" on "CardPage"
    When press button with text "officeBank3" on "CardPage"
    When execute method "moveMouseToPoint" from class "ru.open.helpers.Keyboard" on "//div[contains(@class, 'drawer__left')]/div[2]/div[3]/div"
    When press button with text "getCard" on "CardPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCodeForCard" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "CardPage"
    When press button with text "sign" on "CardPage"
    When wait "5000"ms

#  @last
#  Scenario: Check status ""#217603
#
#    Given open link from property "shugar.link"
#    And type to input with name "login" property: "shugar.login" on "ShugarLoginPage"
#    And type to input with name "password" property: "shugar.password" on "ShugarLoginPage"
#    When press button with text "signIn" on "ShugarLoginPage"
#    When press button with text "different" on "ShugarMenuPage"
#    When press button with text "accounts" on "ShugarMenuPage"
#    When execute method "clear" from class "ru.open.helpers.SelenHelper" on "//input[@id='inn_advanced']"
#    And type to input with name "inn" property: "cards.login1" on "ShugarActionPage"
#    When press button with text "requestType" on "ShugarActionPage"
#    When press button with text "search" on "ShugarActionPage"
#    When wait "50000"ms
    






















