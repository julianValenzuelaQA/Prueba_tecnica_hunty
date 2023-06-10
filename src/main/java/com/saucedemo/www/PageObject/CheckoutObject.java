package com.saucedemo.www.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutObject extends PageObject {

    @FindBy(className = "subheader")
    private WebElementFacade checkoutLabel;

    @FindBy(id = "first-name")
    private WebElementFacade firstNameField;

    @FindBy(id = "last-name")
    private WebElementFacade lastNameField;

    @FindBy(id = "postal-code")
    private WebElementFacade zipCodeField;

    @FindBy(xpath = "//input[@value='CONTINUE']")
    private WebElementFacade continueButton;

    public boolean isOnCheckoutPage() {
        return checkoutLabel.isDisplayed();
    }

    public void enterFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.type(lastName);
    }

    public void enterZipCode(String zipCode) {
        zipCodeField.type(zipCode);
    }

    public void clickContinue() {
        continueButton.click();
    }
}
