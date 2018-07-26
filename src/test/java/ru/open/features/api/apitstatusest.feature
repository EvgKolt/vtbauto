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

  Scenario: ACCOUNT_ENROLLMENT_CONTROLLER #GET HtmlForm
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accountEnrolments/1624/form"

  Scenario: ACCOUNT_ENROLLMENT_CONTROLLER #GET Persons
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/accountEnrolments/1624/persons"

  Scenario: BANK_CONTROLLER #GET list of banks
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/banks"

  Scenario: BANK_CONTROLLER #GET bank by id
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/banks/-4"

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

  Scenario: CORPORATE_CARD_APP_CONTROLLER #GET cards list with statuses
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/cardApplications"

  Scenario: CORPORATE_CARD_CONTROLLER #GET corp cards list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/cards"

  Scenario: COUNTRY_CONTROLLER #GET country by id
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/country?countryId=1"

  Scenario: CURRENCY_CONTROLLER #GET currency list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/currency"

  Scenario: CURRENCY_OPER_CONTROLLER #GET currency operlist
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/currency-opers"

  Scenario: DEPARTMENT_CONTROLLER #GET cities
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/departments/-6/cities?pageNumber=1&pageSize=1"

  Scenario: DICTIONARY_CONTROLLER #GET dictionaries
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/dictionaries?pageNumber=1&pageSize=1"

  Scenario: DICTIONARY_CONTROLLER #GET dictionary
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/dictionaries/2"

  Scenario: DOCUMENT_BUNDLE_CONTROLLER #GET document bundle
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/documentBundles/9f021964-b0f2-4fb0-b9ae-7ed55c10f0df"

  Scenario: MESSAGE_CONTROLLER #GET all messages
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/messages?pageNumber=1&pageSize=1"

  Scenario: MESSAGE_GROUP_CONTROLLER #GET all group
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/messageGroups?pageNumber=1&pageSize=1"

  Scenario: NOTIFICATION_CONTROLLER #GET document bundle
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/notifications"

  Scenario: NSO_CONTROLLER #GET nso contracts
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/nsoContracts?accountId=2185"

  Scenario: NSO_CONTROLLER #GET nso tariffs
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/nsoTariffs"

  Scenario: OFFICE_CONTROLLER #GET office list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/offices"

  Scenario: ORGANIZATION_CONTROLLER #GET organization
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/km/orgs?fetchPersonId=true&inn=7721564013"

  Scenario: PAYMENT_CONTROLLER #GET payment
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/payments/7648"

  Scenario: PAYMENT_PATTERN_CONTROLLER #GET payment pattern list
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/paymentTemplates?template=false"

  Scenario: SMS_INFO_CONTROLLER #GET sms info service
    Then execute method "checkStatusCodeGET" from class "ru.open.api.ApiTester" on "http://rumskapp266.open.ru:11218/webapi-2.1/services/smsInfo/2185"



