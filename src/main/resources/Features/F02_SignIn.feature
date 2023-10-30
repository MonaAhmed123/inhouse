@smoke
Feature: F02_SignIn |  SignIn functionality
  Scenario: User sign in with valid credentials
    Given User is on the login page
    When User enters valid "mona@nourcode.com" and "mona1234"
    And User clicks on the login button
    Then user go to my account page