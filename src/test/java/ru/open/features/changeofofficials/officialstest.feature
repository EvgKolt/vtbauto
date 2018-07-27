@BPtest
Feature: Change of officials(shugar)

  @last
  Scenario: Restore password(negative scenario)#157247

    Given open link from property "shugar.link"
    And type to input with name "login" property: "shugar.login" on "ShugarLoginPage"
    And type to input with name "password" property: "shugar.password" on "ShugarLoginPage"
    When press button with text "signIn" on "ShugarLoginPage"
    When wait "5000"ms


