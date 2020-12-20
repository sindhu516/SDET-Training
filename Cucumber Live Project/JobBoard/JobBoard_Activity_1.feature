@JobBoard_Activity_1
Feature: Create a new user
 
  Scenario: Create a new user using admin
    Given The user is on login page
    And Admin user enters"<Username>"and"<Password>"
    When user finds the Users option
    And clicks on Add New user 
    And fills in the required details
    And creates new user
    Then validates if user is created
    And closes the browser

Examples:
    | Username | Password |
    | root     | pa$$w0rd |
 