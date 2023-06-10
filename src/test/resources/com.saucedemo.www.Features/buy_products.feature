Feature: Buy products from the Sauce Demo website
  As a user
  I want to buy products from the Sauce Demo website
  So that I can enjoy them

  Background:
    Given I am on the Sauce Demo login page
    When I enter "standard_user" as the username
    And I enter "secret_sauce" as the password
    And I click on the login button

  Scenario: Buy a single product
    When I add the a product to the cart
    And I go to the cart page
    And I click on the checkout button
    And I enter "John" as the first name,"Doe" as the last name,"1234" as the zip code
    And I click on the continue button
    And I click on the finish button
    Then I should see a confirmation message saying "THANK YOU FOR YOUR ORDER"

  Scenario: Buy multiple products
    When I add the a products to the cart
    And I go to the cart page
    And I click on the checkout button
    And I enter "John" as the first name,"Doe" as the last name,"1234" as the zip code
    And I click on the continue button
    And I click on the finish button
    Then I should see a confirmation message saying "THANK YOU FOR YOUR ORDER"