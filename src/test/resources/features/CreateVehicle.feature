@vehicle
Feature: Create vehicle

  As a user, I want to be able to create vehicle

  Scenario: Create a vehicle
    Given user is on the landing page
    When user logs in with "storemanager85" and "UserUser123" credentials
    Then user navigates to "Fleet" and "Vehicles"
    And user click on create car button
    Then user enter vehicles information:
      |License Plate|Driver|Location       |Model Year|
      |4AB9080  | SDET |Washington D.C.|2020      |