@BPtest
Feature: Team TP testCases

  @cleancookies
  Scenario: Checking rates

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "rate" on "MainPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/tariffs" is opened
    Then verify that element with text "rateName1" "exists" on "RatePage"
    Then verify that element with text "rateName2" "exists" on "RatePage"
    Then verify that element with text "rateName3" "exists" on "RatePage"
    Then verify that element with text "rateName4" "exists" on "RatePage"

  @cleancookies
  Scenario: Checking possibility to change rate

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "rate" on "MainPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/tariffs" is opened
    Then verify that element with text "switchTo1" "exists" on "RatePage"
    Then verify that element with text "switchTo2" "exists" on "RatePage"
    Then verify that element with text "switchTo3" "exists" on "RatePage"
    Then verify that element with text "switchTo4" "exists" on "RatePage"
    When press button with text "switchTo1" on "RatePage"
    When press button with text "switchRate" on "RatePage"
    Then verify that element with text "confirm" "exists" on "RatePage"

  @cleancookies
  Scenario: Checking nso

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "deposits" on "MainPage"
    Then verify that element with text "depo1" "exists" on "RatePage"
    Then verify that element with text "depo2" "exists" on "RatePage"
    Then verify that element with text "depo3" "exists" on "RatePage"
    Then verify that element with text "depo4" "exists" on "RatePage"

  @cleancookies
  Scenario: load empty file from 1C

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.txt.file.address"
    When verify that element with text "fileEmpty" "exists" on "RatePage"

  @cleancookies
  Scenario: load wrong format *.jpg file from 1C

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.jpg.file.address"
    When verify that element with text "fileWrong1" "exists" on "RatePage"

  @cleancookies
  Scenario: load wrong file's size from 1C

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.jpg.file.address"
    When verify that element with text "fileWrong2" "exists" on "RatePage"

  @cleancookies
  Scenario: load wrong data format file(abra kadabra)

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.txt.wrongformat.address"
    When verify that element with text "wrongFormat" "exists" on "RatePage"

  @cleancookies
  Scenario: load wrong data format file without "FileEnd"

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.txt.wrongfile.address"
    When verify that element with text "wrongFormat" "exists" on "RatePage"

  @cleancookies
  Scenario: load wrong data format file (string in "number" field)

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.txt.wrongfile.address2"
    Then execute method "getValidatingStatus" from class "ru.open.dao.DBConnect" on ""
    Then execute method "compareProperties" from class "ru.open.parsers.LogParser" on "tmp,validating.status1"

  @cleancookies
  Scenario: load wrong data format file (string in "sum" field)

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.txt.wrongfile.address3"
    Then execute method "getValidatingStatus" from class "ru.open.dao.DBConnect" on ""
    Then execute method "compareProperties" from class "ru.open.parsers.LogParser" on "tmp,validating.status1"

  @cleancookies
  Scenario: load wrong data format file (string in "data" field)

    Given open link from property "business.portal.link"
    And type to input with name "userName" property: "login" on "LoginPage"
    And type to input with name "password" property: "password" on "LoginPage"
    When press button with text "signIn" on "LoginPage"
    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
    When press button with text "loadFrom1C" on "RatePage"
    When press button with text "addFile" on "RatePage"
    When load file with address "test.txt.wrongfile.address4"
    Then execute method "getValidatingStatus" from class "ru.open.dao.DBConnect" on ""
    Then execute method "compareProperties" from class "ru.open.parsers.LogParser" on "tmp,validating.status1"

#  @cleancookies @last
#  Scenario: load RIGHT data format file
#
#    Given open link from property "business.portal.link"
#    And type to input with name "userName" property: "login" on "LoginPage"
#    And type to input with name "password" property: "password" on "LoginPage"
#    When press button with text "signIn" on "LoginPage"
#    Then verify that page with url "https://rumskapt273.open.ru/app/accounts" is opened
#    When press button with text "loadFrom1C" on "RatePage"
#    When press button with text "addFile" on "RatePage"
#    When load file with address "test.txt.right.address"
