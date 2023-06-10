Feature: Login to the Sauce Demo website
  As a user
  I want to login to the Sauce Demo website
  So that I can buy some products

  Scenario: Successful login with standard user
    Given I am on the Sauce Demo login page
    When I enter "standard_user" as the username
    And I enter "secret_sauce" as the password
    And I click on the login button
    Then I should see the products page

  Scenario: Failed login with invalid credentials
    Given I am on the Sauce Demo login page
    When I enter "invalid_user" as the username
    And I enter "wrong_password" as the password
    And I click on the login button
    Then I should see an error message saying "Epic sadface: Username and password do not match any user in this service"