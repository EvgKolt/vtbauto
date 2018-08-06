@BPtest
Feature: Change of officials(shugar)

  Scenario: Change officials#223371

    Given open link from property "shugar.link"
    And type to input with name "login" property: "shugar.login" on "ShugarLoginPage"
    And type to input with name "password" property: "shugar.password" on "ShugarLoginPage"
    When press button with text "signIn" on "ShugarLoginPage"
    When wait "5000"ms
    When press button with text "different" on "ShugarMenuPage"
    When press button with text "accounts" on "ShugarMenuPage"
    When press button with text "createAccount" on "ShugarMenuPage"
    When press button with text "choose" on "ShugarActionPage"
    When wait "5000"ms
    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "1"
    When wait "5000"ms
    And type to input with name "chooseByInn" property: "inn" on "ShugarActionPage"
    When press button with text "find" on "ShugarActionPage"
    When press button with text "client" on "ShugarActionPage"
    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "0"
    When press button with text "type" on "ShugarActionPage"
    When press button with text "typeOption1" on "ShugarActionPage"
    When type to input with name "kpp" property: "kpp" on "ShugarActionPage"
    When press button with text "typeDbo" on "ShugarActionPage"
    When press button with text "typeDboOption1" on "ShugarActionPage"
    When press button with text "ownership" on "ShugarActionPage"
    When press button with text "ownershipOption1" on "ShugarActionPage"
    When execute method "moveMouseToPoint" from class "ru.open.helpers.Keyboard" on "//input[@id='kpp']"
    When wait "5000"ms
    And type to input with name "okved" property: "okved" on "ShugarActionPage"
    When wait "5000"ms
    When press button with text "okpo" on "ShugarActionPage"
    When wait "5000"ms
    And type to input with name "okpo" property: "okpo" on "ShugarActionPage"
    And type to input with name "contact1" property: "phone" on "ShugarActionPage"
    And type to input with name "contact2" property: "phone" on "ShugarActionPage"
    When press button with text "numGetInfo" on "ShugarActionPage"
    When press button with text "serviceOffice" on "ShugarActionPage"
    When press button with text "serviceOfficeOption1" on "ShugarActionPage"
    When press button with text "save" on "ShugarActionPage"
#    When execute method "moveMouseToPoint" from class "ru.open.helpers.Keyboard" on "//form[@id='formformAccounts_msb']/input[contains(@class, 'button')]"
    When press button with text "addDoc" on "ShugarActionPage"
    When press button with text "chooseDoc" on "ShugarActionPage"
    When wait "10000"ms
    When load file with address "test.jpg.file.address"
    When wait "10000"ms
    When press button with text "saveDoc" on "ShugarActionPage"
    When press button with text "addPerson" on "ShugarActionPage"
    When press button with text "action" on "ShugarActionPage"
    When press button with text "actionOption1" on "ShugarActionPage"
    When press button with text "signatureType" on "ShugarActionPage"
    When press button with text "signatureTypeOption1" on "ShugarActionPage"
    When press button with text "resident" on "ShugarActionPage"
    When press button with text "residentOption1" on "ShugarActionPage"
    And type to input with name "name" property: "name" on "ShugarActionPage"
    And type to input with name "middleName" property: "name" on "ShugarActionPage"
    And type to input with name "lastName" property: "name" on "ShugarActionPage"
    When press button with text "sex" on "ShugarActionPage"
    When press button with text "sexOption1" on "ShugarActionPage"
    When press button with text "dateOfBirth" on "ShugarActionPage"
    When wait "5000"ms
    And type to input with name "dateOfBirth" property: "ps.date" on "ShugarActionPage"
    And type to input with name "phone" property: "phone" on "ShugarActionPage"
    When press button with text "region" on "ShugarActionPage"
    When press button with text "regionOption1" on "ShugarActionPage"
    And type to input with name "birthPlace" property: "city" on "ShugarActionPage"
    When press button with text "docType" on "ShugarActionPage"
    When press button with text "docTypeOption1" on "ShugarActionPage"
    And type to input with name "psSerial" property: "ps.serial" on "ShugarActionPage"
    And type to input with name "psNumber" property: "ps.number" on "ShugarActionPage"
    And type to input with name "department" property: "office.code" on "ShugarActionPage"
    When press button with text "psDate" on "ShugarActionPage"
    When wait "5000"ms
    And type to input with name "psDate" property: "date" on "ShugarActionPage"
    And type to input with name "passportIssue" property: "street" on "ShugarActionPage"
    When press button with text "address" on "ShugarActionPage"
    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "1"
    And type to input with name "addressOneString" property: "address" on "ShugarActionPage"
    When press button with text "checkAddressButton" on "ShugarActionPage"
    When press button with text "okButton" on "ShugarActionPage"
    When wait "5000"ms
    And type to input with name "oksm" property: "okved" on "ShugarActionPage"
    When press button with text "kladdressSave" on "ShugarActionPage"
    When wait "2000"ms
    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "0"
    When wait "2000"ms
    And type to input with name "email" property: "email" on "ShugarActionPage"
    When press button with text "savePerson" on "ShugarActionPage"
    When press button with text "statusChange" on "ShugarActionPage"
    When press button with text "status" on "ShugarActionPage"
    When wait "5000"ms
    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "11"
    When press button with text "saveStatus" on "ShugarActionPage"
    When wait "5000"ms
    When press button with text "statusChange" on "ShugarActionPage"
    When press button with text "status" on "ShugarActionPage"
    When wait "5000"ms
    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "-4"
    When press button with text "saveStatus" on "ShugarActionPage"
    When wait "5000"ms
    When press button with text "statusChange" on "ShugarActionPage"
    When press button with text "status" on "ShugarActionPage"
    When wait "3000"ms
    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "5"
    When press button with text "saveStatus" on "ShugarActionPage"
    When press button with text "checking" on "ShugarActionPage"
    When press button with text "saveZone" on "ShugarActionPage"
    When wait "10000"ms
    When press button with text "working" on "ShugarActionPage"
    When wait "5000"ms
    When execute method "typeEnter" from class "ru.open.helpers.Keyboard" on ""
    When press button with text "statusChange" on "ShugarActionPage"
    When press button with text "status" on "ShugarActionPage"
    When wait "3000"ms
    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "-14"
    When press button with text "assignedUser" on "ShugarActionPage"
    When press button with text "assignedUserOption1" on "ShugarActionPage"
    When press button with text "saveStatus" on "ShugarActionPage"

#  Scenario: Change officials#223370
#
#    Given open link from property "shugar.link"
#    And type to input with name "login" property: "shugar.login" on "ShugarLoginPage"
#    And type to input with name "password" property: "shugar.password" on "ShugarLoginPage"
#    When press button with text "signIn" on "ShugarLoginPage"
#    When wait "5000"ms
#    When press button with text "different" on "ShugarMenuPage"
#    When press button with text "accounts" on "ShugarMenuPage"
#    When press button with text "createAccount" on "ShugarMenuPage"
#    When press button with text "choose" on "ShugarActionPage"
#    When wait "5000"ms
#    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "1"
#    When wait "5000"ms
#    And type to input with name "chooseByInn" property: "inn" on "ShugarActionPage"
#    When press button with text "find" on "ShugarActionPage"
#    When press button with text "client" on "ShugarActionPage"
#    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "0"
#    When press button with text "type" on "ShugarActionPage"
#    When press button with text "typeOption1" on "ShugarActionPage"
#    When type to input with name "kpp" property: "kpp" on "ShugarActionPage"
#    When press button with text "typeDbo" on "ShugarActionPage"
#    When press button with text "typeDboOption1" on "ShugarActionPage"
#    When press button with text "ownership" on "ShugarActionPage"
#    When press button with text "ownershipOption1" on "ShugarActionPage"
#    When execute method "moveMouseToPoint" from class "ru.open.helpers.Keyboard" on "//input[@id='kpp']"
#    When wait "5000"ms
#    And type to input with name "okved" property: "okved" on "ShugarActionPage"
#    When wait "5000"ms
#    When press button with text "okpo" on "ShugarActionPage"
#    When wait "5000"ms
#    And type to input with name "okpo" property: "okpo" on "ShugarActionPage"
#    And type to input with name "contact1" property: "phone" on "ShugarActionPage"
#    And type to input with name "contact2" property: "phone" on "ShugarActionPage"
#    When press button with text "numGetInfo" on "ShugarActionPage"
#    When press button with text "serviceOffice" on "ShugarActionPage"
#    When press button with text "serviceOfficeOption1" on "ShugarActionPage"
#    When press button with text "save" on "ShugarActionPage"
#    When execute method "moveMouseToPoint" from class "ru.open.helpers.Keyboard" on "//form[@id='formformAccounts_msb']/input[contains(@class, 'button')]"
#    When press button with text "addDoc" on "ShugarActionPage"
#    When press button with text "chooseDoc" on "ShugarActionPage"
#    When wait "10000"ms
#    When load file with address "test.jpg.file.address"
#    When wait "10000"ms
#    When press button with text "saveDoc" on "ShugarActionPage"
#    When press button with text "addPerson" on "ShugarActionPage"
#    When press button with text "action" on "ShugarActionPage"
#    When press button with text "actionOption1" on "ShugarActionPage"
#    When press button with text "signatureType" on "ShugarActionPage"
#    When press button with text "signatureTypeOption1" on "ShugarActionPage"
#    When press button with text "resident" on "ShugarActionPage"
#    When press button with text "residentOption1" on "ShugarActionPage"
#    And type to input with name "name" property: "name" on "ShugarActionPage"
#    And type to input with name "middleName" property: "name" on "ShugarActionPage"
#    And type to input with name "lastName" property: "name" on "ShugarActionPage"
#    When press button with text "sex" on "ShugarActionPage"
#    When press button with text "sexOption1" on "ShugarActionPage"
#    When press button with text "dateOfBirth" on "ShugarActionPage"
#    When wait "5000"ms
#    And type to input with name "dateOfBirth" property: "ps.date" on "ShugarActionPage"
#    And type to input with name "phone" property: "phone" on "ShugarActionPage"
#    When press button with text "region" on "ShugarActionPage"
#    When press button with text "regionOption1" on "ShugarActionPage"
#    And type to input with name "birthPlace" property: "city" on "ShugarActionPage"
#    When press button with text "docType" on "ShugarActionPage"
#    When press button with text "docTypeOption1" on "ShugarActionPage"
#    And type to input with name "psSerial" property: "ps.serial" on "ShugarActionPage"
#    And type to input with name "psNumber" property: "ps.number" on "ShugarActionPage"
#    And type to input with name "department" property: "office.code" on "ShugarActionPage"
#    When press button with text "psDate" on "ShugarActionPage"
#    When wait "5000"ms
#    And type to input with name "psDate" property: "date" on "ShugarActionPage"
#    And type to input with name "passportIssue" property: "street" on "ShugarActionPage"
#    When press button with text "address" on "ShugarActionPage"
#    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "1"
#    And type to input with name "addressOneString" property: "address" on "ShugarActionPage"
#    When press button with text "checkAddressButton" on "ShugarActionPage"
#    When press button with text "okButton" on "ShugarActionPage"
#    When wait "5000"ms
#    And type to input with name "oksm" property: "okved" on "ShugarActionPage"
#    When press button with text "kladdressSave" on "ShugarActionPage"
#    When wait "2000"ms
#    When execute method "switchToWindow" from class "ru.open.helpers.SelenHelper" on "0"
#    When wait "2000"ms
#    And type to input with name "email" property: "email" on "ShugarActionPage"
#    When press button with text "savePerson" on "ShugarActionPage"
#    When press button with text "statusChange" on "ShugarActionPage"
#    When press button with text "status" on "ShugarActionPage"
#    When wait "5000"ms
#    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "11"
#    When press button with text "saveStatus" on "ShugarActionPage"
#    When wait "5000"ms
#    When press button with text "statusChange" on "ShugarActionPage"
#    When press button with text "status" on "ShugarActionPage"
#    When wait "5000"ms
#    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "-4"
#    When press button with text "saveStatus" on "ShugarActionPage"
#    When wait "5000"ms
#    When press button with text "statusChange" on "ShugarActionPage"
#    When press button with text "status" on "ShugarActionPage"
#    When wait "3000"ms
#    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "5"
#    When press button with text "saveStatus" on "ShugarActionPage"
#    When press button with text "checking" on "ShugarActionPage"
#    When press button with text "saveZone" on "ShugarActionPage"
#    When wait "10000"ms
#    When press button with text "working" on "ShugarActionPage"
#    When wait "5000"ms
#    When execute method "typeEnter" from class "ru.open.helpers.Keyboard" on ""
#    When press button with text "statusChange" on "ShugarActionPage"
#    When press button with text "status" on "ShugarActionPage"
#    When wait "3000"ms
#    When execute method "clickOnStatus" from class "ru.open.helpers.Keyboard" on "-14"
#    When press button with text "assignedUser" on "ShugarActionPage"
#    When press button with text "assignedUserOption1" on "ShugarActionPage"
#    When press button with text "saveStatus" on "ShugarActionPage"



