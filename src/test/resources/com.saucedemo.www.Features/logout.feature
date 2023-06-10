Feature: Logout from the Sauce Demo website
  As a user
  I want to logout from the Sauce Demo website
  So that I can end my session securely

  Background:
    Given I am on the Sauce Demo login page
    When I enter "standard_user" as the username
    And I enter "secret_sauce" as the password
    And I click on the login button

  Scenario: Logout from the products page
    When I click on the menu button on the products page
    And I click on the logout link
    Then I should see the login page

  Scenario: Logout from the cart page
    When I click on the menu button on the cart page
    And I click on the menu button on the products page
    And I click on the logout link
    Then I should see the login page

