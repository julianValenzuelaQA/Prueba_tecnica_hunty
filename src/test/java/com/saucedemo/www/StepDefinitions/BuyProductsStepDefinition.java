package com.saucedemo.www.StepDefinitions;

import com.saucedemo.www.Steps.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuyProductsStepDefinition {

    @Steps
    ProductsSteps productsSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    CheckoutSteps checkoutSteps;

    @Steps
    OverViewSteps overViewSteps;

    @Steps
    FinishSteps finishSteps;

    @When("^I add the a product to the cart$")
    public void iAddTheAProductToTheCart() {
        productsSteps.addProductToCart();
    }

    @When("^I go to the cart page$")
    public void iGoToTheCartPage() {
        productsSteps.goToCart();
        cartSteps.verifyCartPage();
    }

    @When("^I click on the checkout button$")
    public void iClickOnTheCheckoutButton() {
        cartSteps.clickCheckout();
        checkoutSteps.verifyCheckoutPage();
    }

    @When("^I enter \"([^\"]*)\" as the first name,\"([^\"]*)\" as the last name,\"([^\"]*)\" as the zip code$")
    public void iEnterAsTheFirstNameAsTheLastNameAsTheZipCode(String firstName, String lastName, String zipCode) {
        checkoutSteps.enterFirstName(firstName);
        checkoutSteps.enterLastName(lastName);
        checkoutSteps.enterZipCode(zipCode);
    }

    @When("^I click on the continue button$")
    public void iClickOnTheContinueButton() {
        checkoutSteps.clickContinue();
        overViewSteps.verifyOverviewPage();
    }

    @When("^I click on the finish button$")
    public void iClickOnTheFinishButton() {
        overViewSteps.clickFinish();
        finishSteps.verifyFinishPage();
    }

    @Then("^I should see a confirmation message saying \"([^\"]*)\"$")
    public void iShouldSeeAConfirmationMessageSaying(String message) {
        finishSteps.verifyConfirmationMessage(message);
    }

    @When("^I add the a products to the cart$")
    public void iAddTheAProductsToTheCart() {
        productsSteps.addProductToCart();
        productsSteps.addProductToCart();
    }
}
