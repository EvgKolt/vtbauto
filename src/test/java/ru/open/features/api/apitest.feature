@BPtest
Feature: Business portal api tests
#http://rumskapp266.open.ru:11218/webapi-2.1/swagger-ui.html#/account-enrolment-controller

  Scenario: ACCOUNT_CONTROLLER #GET acc list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/"

  Scenario: ACCOUNT_CONTROLLER #GET account statement
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/2185/statement?format=TXT&from=2018-05-10&print=false&to=2018-07-13"

  Scenario: ACCOUNT_CONTROLLER #GET negativeOperationPage
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/2185/negativeOperations?pageNumber=1&pageSize=1"

  Scenario: ACCOUNT_CONTROLLER #GET requisites
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accounts/2185/requisites"

  Scenario: ACCOUNT_ENROLLMENT_CONTROLLER #GET list of applications for opening an account
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accountEnrolments"

#  Scenario: ACCOUNT_ENROLLMENT_CONTROLLER #GET Document Bundles
#    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accountEnrolments/1624/attachments"

  Scenario: ACCOUNT_ENROLLMENT_CONTROLLER #GET HtmlForm
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accountEnrolments/1624/form"

  Scenario: ACCOUNT_ENROLLMENT_CONTROLLER #GET Persons
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accountEnrolments/1624/persons"

  Scenario: BANK_CONTROLLER #GET list of banks
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/banks"

  Scenario: BANK_CONTROLLER #GET bank by id
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/banks/-1"

  Scenario: BASIC_ERROR_CONTROLLER #GET errorHTML
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/error"

  Scenario: CALENDAR_CONTROLLER #GET calendar
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/calendar?from=2018-03-06&pageNumber=1&pageSize=1&paginationParams.pageNumber=1&paginationParams.pageSize=1&to=2018-07-06"

  Scenario: CALENDAR_CONTROLLER #GET workingDays
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/calendar/workingDays?daysCount=3&officeId=-100"

  Scenario: CASH_SYMBOL_DICT_CONTROLLER #GET cashsymboldict
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/cashSymbolDict"

  Scenario: CATALOG_CONTROLLER #GET bank by bic
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/catalogs/bic?bic=044525985"

  Scenario: CERTIFICATE_CONTROLLER #GET certificates
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/certificates?pageNumber=1&pageSize=1"

  Scenario: CITY_CONTROLLER #GET cities
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/cities?pageNumber=1&pageSize=1"

#   Doesn't use %(
#  Scenario: CLIENT_MANAGER_CONTROLLER #GET applications list
#    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "

  Scenario: CORPORATE_CARD_APP_CONTROLLER #GET cards list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/cardApplications"