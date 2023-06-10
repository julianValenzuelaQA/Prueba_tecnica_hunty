Feature: Filter products by different criteria
  As a user
  I want to filter products by different criteria
  So that I can find the products that suit me best

  Background:
    Given I am on the Sauce Demo login page
    When I enter "standard_user" as the username
    And I enter "secret_sauce" as the password
    And I click on the login button

  Scenario: Filter products by price from low to high
    When I select the "Price (low to high)" option from the filter dropdown
    Then I should see the products sorted by price from low to high

  Scenario: Filter products by price from high to low
    When I select the "Price (high to low)" option from the filter dropdown
    Then I should see the products sorted by price from high to low

  Scenario: Filter products by name from A to Z
    When I select the "Name (A to Z)" option from the filter dropdown
    Then I should see the products sorted by name from A to Z

  Scenario: Filter products by name from Z to A
    When I select the "Name (Z to A)" option from the filter dropdown
    Then I should see the products sorted by name from Z to A

