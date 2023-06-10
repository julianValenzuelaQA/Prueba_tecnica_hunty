package com.saucedemo.www.StepDefinitions;

import com.saucedemo.www.Steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    LoginSteps loginSteps;

    @Given("^I am on the Sauce Demo login page$")
    public void iAmOnTheSauceDemoLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("^I enter \"([^\"]*)\" as the username$")
    public void iEnterAsTheUsername(String username) {
        loginSteps.enterUsername(username);
    }

    @When("^I enter \"([^\"]*)\" as the password$")
    public void iEnterAsThePassword(String password) {
        loginSteps.enterPassword(password);
    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        loginSteps.clickLogin();
    }

    @Then("^I should see the products page$")
    public void iShouldSeeTheProductsPage() {
        loginSteps.verifyProductsPage();
    }

    @Then("^I should see an error message saying \"([^\"]*)\"$")
    public void iShouldSeeAnErrorMessageSaying(String message) {
        loginSteps.verifyErrorMessage(message);
    }
}
