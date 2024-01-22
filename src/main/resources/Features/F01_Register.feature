Feature: F01_Register | users could register with new accounts //test suit(collection)

  Scenario: guest user could signup with valid data successfully
    Given The user is on the signup page
    When The user enters "tester", "test", "tester@test.com","0526542875","test1234", and "test1234"
    And click the create account button
    Then signup must be successful.

  Scenario: guest user enters an existing email during signup
    When The user enters "tester", "test", "tester@test.com","0526542875","test1234", and "test1234"
    And click the create account button
    Then An error message "Email already exists" should be displayed

  Scenario: guest user enters mismatched passwords during signup
    When The user enters "tester", "test", "tester@test.com","0526542875","test1234", and "test123"
    And click the create account button
    Then An error message "Password and Confirm Password do not match" should be displayed

  Scenario: guest user leaves a required field blank during signup
    When The user enters " ", " ", " "," "," ", and " "
    And click the create account button
    Then An error message "Email field is required" should be displayed

  Scenario: guest user leaves a required field blank during signup
    When The user enters " ", " ", " "," "," ", and " "
    And click the create account button
    Then An error message "m" should be displayed