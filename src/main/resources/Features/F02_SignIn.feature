@smoke
  Feature: F02_SignIn | SignIn functionality
  Background:
    Given User is on the login page

  Scenario: User sign in with valid credentials
    When User enters valid "admin@test.com" and "admin123"
    And clicks on the login button
    Then user should be redirected to the home page

  Scenario: User sign in with invalid email
    When User enters invalid email "monaahmed@gmail.com"
    And enters valid password "test123"
    And clicks on the login button
    Then user should see an error message

  Scenario: User sign in with incorrect password
    When User enters valid email "admin@test.com"
    And enters incorrect password "test"
    And clicks on the login button
    Then user should see an error message

  Scenario: User sign in without entering email and password
    When User enters empty email and password
    And clicks on the login button
    Then user should see validation errors for email and password fields