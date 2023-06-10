package com.saucedemo.www.StepDefinitions;

import com.saucedemo.www.Steps.CartSteps;
import com.saucedemo.www.Steps.LoginSteps;
import com.saucedemo.www.Steps.OptionsSteps;
import com.saucedemo.www.Steps.ProductsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutStepDefinition {

    @Steps
    LoginSteps loginSteps;

    @Steps
    OptionsSteps optionsSteps;

    @Steps
    ProductsSteps productsSteps;

    @Steps
    CartSteps cartSteps;

    @When("^I click on the menu button on the products page$")
    public void iClickOnTheMenuButtonOnTheProductsPage() {
        optionsSteps.iClickOnTheMenuButton();
    }


    @When("^I click on the logout link$")
    public void iClickOnTheLogoutLink() {
        optionsSteps.iClickOnTheLogoutOption();
    }

    @Then("^I should see the login page$")
    public void iShouldSeeTheLoginPage() {
        loginSteps.verifyLoginPage();
    }

    @When("^I click on the menu button on the cart page$")
    public void iClickOnTheMenuButtonOnTheCartPage() {
        productsSteps.goToCart();
    }


}
