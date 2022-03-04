Feature: Login
  As user, I want to be able to login with username and password

  Background: go to login page
    Given user is on the login page

  @scenario_1
  Scenario: Login as store manager
    When user logs in as a store manager
    Then user should be able to see Dashboard page title

  @scenario_2
  Scenario: Login as store manager
    When user logs in as a store manager
    Then user should be able to see Dashboard page title

  @scenario_3
  Scenario: Login as store manager
    When user logs in as a store manager
    Then user should be able to see Dashboard page title

    @scenario_outline
    Scenario Outline: Login under different credentials as <username>
      When user enters "<username>" and "<password>"
      Then user should be able to see Dashboard page title
      Examples:
      |username         |password  |
      |user001          |UserUse123|
      |user002          |UserUse123|
      |user003          |UserUse123|
      |user004          |UserUse123|
      |storemanager85   |UserUse123|
      |storemanager999  |UserUse123|
      |storemanager205  |UserUse123|