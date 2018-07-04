@BPtest
Feature: Business portal card service

  Scenario: Order card on BP#217560

    Given open link from property "business.portal.link.cards"
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
    And type to input with name "officeBank" property: "city" on "CardPage"
    When press button with text "officeBank1" on "CardPage"
    When press button with text "account" on "CardPage"
    When press button with text "account1" on "CardPage"
    When press button with text "getCard" on "CardPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCodeForCard" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "CardPage"
    When press button with text "sign" on "CardPage"
    When execute method "deleteCardOrderStatusFromBase" from class "ru.open.dao.DBConnect" on ""
    When wait "35000"ms





















