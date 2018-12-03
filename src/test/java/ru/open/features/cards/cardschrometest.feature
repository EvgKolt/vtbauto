@BPtest
Feature: Business portal card service

  @cleancookies @last
  Scenario: Order card on BP#217560 and status checking #217603

    Given open link from property "business.portal.link"
    When execute method "deleteCardOrderStatusFromBase" from class "ru.open.dao.DBConnect" on ""
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "15000"ms
    When press button with text "businessCards" on "CardPage"
    When press button with text "orderCard" on "CardPage"
    When press button with text "cardHolder" on "CardPage"
    When press button with text "cardHolderOption1" on "CardPage"
    And type to input with name "lastName" property: "lastname" on "CardPage"
    And type to input with name "mainName" property: "name" on "CardPage"
    And type to input with name "midName" property: "midname" on "CardPage"
    And type to input with name "dateOfBirth" property: "ps.date" on "CardPage"
    When wait "5000"ms
    And type to input with name "placeOfBirth" property: "city" on "CardPage"
    And type to input with name "series" property: "ps.serial" on "CardPage"
    And type to input with name "number" property: "ps.number" on "CardPage"
    And type to input with name "organ" property: "organ" on "CardPage"
    And type to input with name "email" property: "email" on "CardPage"
    And type to input with name "phone" property: "phone" on "CardPage"
    And type to input with name "dateOfReg" property: "date" on "CardPage"
    And type to input with name "officeCode" property: "office.code" on "CardPage"
    When press button with text "downloadImg" on "CardPage"
    When load file with address "test.jpg.file.address"
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
    When wait "15000"ms
    When press button with text "getCard" on "CardPage"
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCode" and save as property "smscode"
    And type to input with name "smsCode" property: "smscode" on "CardPage"
    When press button with text "sign" on "CardPage"
    When wait "35000"ms
    When execute method "refreshPage" from class "ru.open.helpers.SelenHelper" on ""
    Then verify that element with text "inWork" "exists" on "CardPage"
    Then verify that element with text "waitForAccount" "exists" on "CardPage"
    When wait "10000"ms
    When execute method "verifyCardStatus" from class "ru.open.dao.DBConnect" on "REQUEST_IS_IN_WORK"
    When wait "10000"ms
    When execute method "setCardStatus" from class "ru.open.dao.DBConnect" on "RETURN_APPLICATION_FOR_REVISION"
    When wait "10000"ms
    When execute method "refreshPage" from class "ru.open.helpers.SelenHelper" on ""
    Then verify that element with text "needInfo" "exists" on "CardPage"
    Then verify that element with text "waitForAccount" "exists" on "CardPage"
    When execute method "setCardStatus" from class "ru.open.dao.DBConnect" on "REFUSAL_BANK"
    When wait "10000"ms
    When execute method "refreshPage" from class "ru.open.helpers.SelenHelper" on ""
    Then verify that element with text "cantOpenCard" "exists" on "CardPage"
    When execute method "setCardStatus" from class "ru.open.dao.DBConnect" on "REQUEST_ERROR"
    When wait "10000"ms
    When execute method "refreshPage" from class "ru.open.helpers.SelenHelper" on ""
    Then verify that element with text "orderCard" "exists" on "CardPage"
    When execute method "setCardStatus" from class "ru.open.dao.DBConnect" on "CANCELED_CLIENT"
    When wait "10000"ms
    When execute method "refreshPage" from class "ru.open.helpers.SelenHelper" on ""
    Then verify that element with text "orderCard" "exists" on "CardPage"
    When press button with text "signOut" on "MainPage"
    When execute method "deleteCardOrderStatusFromBase" from class "ru.open.dao.DBConnect" on ""

  @cleancookies
  Scenario: card replenishment#217623
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login.card" on "LoginPage"
    And type to input with name "password" property: "password.card" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "5000"ms
    When press button with text "businessCards" on "CardPage"
    When press button with text "card" on "CardPage"
    When press button with text "replenishment" on "CardPage"
    And type to input with name "sum" property: "sum" on "CardPage"
    When wait "35000"ms
    When press button with text "nextStep" on "CardPage"
    When wait "35000"ms
    When get param from class "ru.open.parsers.LogParser" by method "getLastSmsCodeForReplenishment" and save as property "smscode"
    When wait "15000"ms
    And type to input with name "smsCode" property: "smscode" on "CardPage"
    When press button with text "sign" on "CardPage"
    When wait "5000"ms
    When press button with text "close" on "CardPage"
    When press button with text "signOut" on "MainPage"
    When wait "5000"ms

  @cleancookies
  Scenario: check Card account's requisites#218188

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login.card" on "LoginPage"
    And type to input with name "password" property: "password.card" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "20000"ms
    When press button with text "myAccounts" on "MainPage"
    When press button with text "myAccount" on "CardPage"
    When press button with text "requisites" on "CardPage"
    Then verify that element with text "myRequisites" "exists" on "CardPage"
    Then verify that element with text "bankRequisites" "exists" on "CardPage"
    Then verify that element with text "accountNumber" "exists" on "CardPage"
    Then verify that element with text "name" "exists" on "CardPage"
    Then verify that element with text "inn" "exists" on "CardPage"
    Then verify that element with text "kpp" "exists" on "CardPage"
    Then verify that element with text "bik" "exists" on "CardPage"
    Then verify that element with text "saveRequisites" "exists" on "CardPage"

  @cleancookies
  Scenario: check Card's display#220933

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login.card" on "LoginPage"
    And type to input with name "password" property: "password.card" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "20000"ms
    When press button with text "businessCards" on "CardPage"
    When wait "10000"ms
    Then verify that element with text "vizElemO" "exists" on "CardPage"
    Then verify that element with text "vizElemN" "exists" on "CardPage"
    Then verify that element with text "vizElemM" "exists" on "CardPage"
    Then verify that element with text "vizElemL" "exists" on "CardPage"
    Then verify that element with text "vizElemK" "exists" on "CardPage"
    Then verify that element with text "vizElemJ" "exists" on "CardPage"
    Then verify that element with text "vizElemI" "exists" on "CardPage"
    Then verify that element with text "vizElemG" "exists" on "CardPage"
    When press button with text "card" on "CardPage"
    When wait "10000"ms
    Then verify that element with text "vizElemA" "exists" on "CardPage"
    Then verify that element with text "vizElemB" "exists" on "CardPage"
    Then verify that element with text "vizElemC" "exists" on "CardPage"
    Then verify that element with text "vizElemD" "exists" on "CardPage"
    Then verify that element with text "vizElemE" "exists" on "CardPage"
    Then verify that element with text "vizElemF" "exists" on "CardPage"


  @cleancookies
  Scenario: Account renaming #223412
    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login.card" on "LoginPage"
    And type to input with name "password" property: "password.card" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    When wait "20000"ms
    When press button with text "businessCards" on "CardPage"
    When press button with text "accountName" on "CardPage"
    When execute method "clear" from class "ru.open.helpers.SelenHelper" on "//input"
    When get param from class "ru.open.helpers.TextGenerator" by method "generateAccName" and save as property "secret.word"
    When wait "10000"ms
    And type to input with name "accountNameInput" property: "secret.word" on "CardPage"
    When wait "5000"ms
    When execute method "typeEnter" from class "ru.open.helpers.Keyboard" on ""
    When wait "5000"ms
    When execute method "refreshPage" from class "ru.open.helpers.SelenHelper" on ""
    When press button with text "accountName" on "CardPage"
    When execute method "getValue" from class "ru.open.helpers.SelenHelper" on "//input"
    When execute method "compareProperties" from class "ru.open.parsers.LogParser" on "tmp,secret.word"
    When wait "5000"ms
    When press button with text "myAccounts" on "MainPage"
    When execute method "verifyElementFromtmp" from class "ru.open.helpers.SelenHelper" on ""

















