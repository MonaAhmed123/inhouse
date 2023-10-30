Feature: F01_Register | users could register with new accounts //test suit(collection)
  Scenario: guest user could signup with valid data successfully //test case
    Given The user is on the website's homepage
    When  The user clicks on the Sign Up button in the top right corner of the page.
    Then  The user is redirected to the Sign Up page
    When The user enters "<firstName>", "<lastName>", "<email>", "<password>", and "<confirmPassword>"
    And click the create account button
    Then signup must be successful.

