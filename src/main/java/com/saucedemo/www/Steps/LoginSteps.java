package com.saucedemo.www.Steps;

import com.saucedemo.www.PageObject.LoginObject;
import com.saucedemo.www.PageObject.ProductsObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends ScenarioSteps {

    LoginObject loginObject;
    ProductsObject productsObject;


    @Step
    public void openLoginPage() {
        loginObject.open();
    }

    @Step
    public void enterUsername(String username) {
        loginObject.enterUsername(username);
    }

    @Step
    public void enterPassword(String password) {
        loginObject.enterPassword(password);
    }

    @Step
    public void clickLogin() {
        loginObject.clickLogin();
    }

    @Step
    public void verifyProductsPage() {
        assertThat(productsObject.isOnProductsPage()).isTrue();
    }

    @Step
    public void verifyLoginPage() {
        assertThat(loginObject.isOnLoginPage()).isTrue();
    }

    @Step
    public void verifyErrorMessage(String message) {
        assertThat(loginObject.getErrorMessage()).isEqualTo(message);
    }



}
