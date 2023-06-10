package com.saucedemo.www.StepDefinitions;

import com.saucedemo.www.Steps.ProductsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FilterProductsStepDefinition {

    @Steps
    ProductsSteps productsSteps;

    @When("^I select the \"([^\"]*)\" option from the filter dropdown$")
    public void iSelectTheOptionFromTheFilterDropdown(String option) {
        productsSteps.selectFilterOption(option);
    }


    @Then("^I should see the products sorted by price from low to high$")
    public void iShouldSeeTheProductsSortedByPriceFromLowToHigh() {
        productsSteps.verifyProductsSortedByPriceLowToHigh();
    }

    @Then("^I should see the products sorted by price from high to low$")
    public void iShouldSeeTheProductsSortedByPriceFromHighToLow() {
        productsSteps.verifyProductsSortedByPriceHighToLow();
    }

    @Then("^I should see the products sorted by name from A to Z$")
    public void iShouldSeeTheProductsSortedByNameFromAToZ() {
        productsSteps.verifyProductsSortedByNameAToZ();
    }

    @Then("^I should see the products sorted by name from Z to A$")
    public void iShouldSeeTheProductsSortedByNameFromZToA() {
        productsSteps.verifyProductsSortedByNameZToA();
    }
}
