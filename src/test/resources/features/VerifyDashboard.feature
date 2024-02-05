
@login
Feature: Login

  @validCreds
  Scenario: Login with valid credentials
    Given landed at orangehrm login page
    When passing valid credentials "Admin" and "admin123"
    Then verify dashboard is displayed

  @invalidCreds
  Scenario Outline: Verifying invalid login scenarios
    Scenario: Login with invalid credentials
    Given I want to write a step with <username>
    When I check for the <password> in step
    Then I verify the <status> in step
    Examples: 
      | username  | password | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
