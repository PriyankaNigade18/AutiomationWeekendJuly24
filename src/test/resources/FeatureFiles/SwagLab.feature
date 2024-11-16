Feature: Test SwagLab Application

  Scenario: Test Login with valid credentials
    Given Open SwagLab application
    When User enter valid "standard_user" and valid "secret_sauce"
    And User click on swagLab login button
    Then User should able to login and navigate to inventory page
