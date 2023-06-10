package com.saucedemo.www.Steps;

import com.saucedemo.www.PageObject.CartObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps extends ScenarioSteps {

    CartObject cartObject;

    @Step
    public void verifyCartPage() {
        assertThat(cartObject.isOnCartPage()).isTrue();
    }

    @Step
    public void clickCheckout() {
        cartObject.clickCheckout();
    }

}
