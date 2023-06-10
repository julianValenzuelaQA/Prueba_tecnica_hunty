Feature: View product details
  As a user
  I want to view product details
  So that I can learn more about the products

  Background:
    Given I am on the Sauce Demo login page
    When I enter "standard_user" as the username
    And I enter "secret_sauce" as the password
    And I click on the login button

  Scenario: View product details by clicking on the product name
    When I click on the name of the product
    Then I should see the product details page for the product

  Scenario: View product details by clicking on the product image
    When I click on the image of product
    Then I should see the product details page for the product

