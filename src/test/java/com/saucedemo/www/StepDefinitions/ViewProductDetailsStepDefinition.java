package com.saucedemo.www.StepDefinitions;

import com.saucedemo.www.Steps.ProductsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ViewProductDetailsStepDefinition {

    @Steps
    ProductsSteps productsSteps;

    @When("^I click on the name of the product$")
    public void iClickOnTheNameOfTheProduct() {
        productsSteps.clickProductName();
    }


    @Then("^I should see the product details page for the product$")
    public void iShouldSeeTheProductDetailsPageForTheProduct() {
        productsSteps.verifyProductDetailsPageUrl();
    }

    @When("^I click on the image of product$")
    public void iClickOnTheImageOfProduct() {
        productsSteps.clickProductImage();
    }


}
