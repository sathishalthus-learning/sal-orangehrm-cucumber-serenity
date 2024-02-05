
@login
Feature: Login

  @validCreds
  Scenario: Login with valid credentials
    Given landed at orangehrm login page
    When passing valid credentials "Admin" and "admin123"
    Then verify dashboard is displayed

