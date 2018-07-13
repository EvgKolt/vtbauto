@BPtest
Feature: Business portal api tests
#http://rumskapp266.open.ru:11218/webapi-2.1/swagger-ui.html#/account-enrolment-controller

  Scenario: ACCOUNT_CONTROLLER #GET acc list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/"

  Scenario: ACCOUNT_CONTROLLER #GET account statement
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/2185/statement?format=TXT&from=2018-05-10&print=false&to=2018-07-13"

  Scenario: ACCOUNT_CONTROLLER #GET negativeOperationPage
    Then execute method "checkStatusCode" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/2185/negativeOperations?pageNumber=1&pageSize=1"

  Scenario: ACCOUNT_CONTROLLER #GET requisites
    Then execute method "checkStatusCode" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/2185/requisites"




