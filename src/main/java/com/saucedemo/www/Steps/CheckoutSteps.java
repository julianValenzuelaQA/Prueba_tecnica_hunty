package com.saucedemo.www.Steps;


import com.saucedemo.www.PageObject.CheckoutObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutSteps extends ScenarioSteps {

    CheckoutObject checkoutObject;

    @Step
    public void verifyCheckoutPage() {
        assertThat(checkoutObject.isOnCheckoutPage()).isTrue();
    }

    @Step
    public void enterFirstName(String firstName) {
        checkoutObject.enterFirstName(firstName);
    }

    @Step
    public void enterLastName(String lastName) {
        checkoutObject.enterLastName(lastName);
    }

    @Step
    public void enterZipCode(String zipCode) {
        checkoutObject.enterZipCode(zipCode);
    }

    @Step
    public void clickContinue() {
        checkoutObject.clickContinue();
    }
}
