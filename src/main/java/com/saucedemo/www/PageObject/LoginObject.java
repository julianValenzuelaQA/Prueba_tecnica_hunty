package com.saucedemo.www.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/v1/index.html")

public class LoginObject extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade usernameField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElementFacade errorMessage;

    public void enterUsername(String username) {
        usernameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isOnLoginPage() {
        return loginButton.isDisplayed();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
