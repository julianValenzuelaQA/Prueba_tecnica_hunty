package com.saucedemo.www.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartObject extends PageObject {

    @FindBy(className = "subheader")
    private WebElementFacade cartLabel;

    @FindBy(xpath = "//a[@href='./checkout-step-one.html']")
    private WebElementFacade checkoutButton;

    public boolean isOnCartPage() {
        return cartLabel.isDisplayed();
    }

    public void clickCheckout() {
        checkoutButton.waitUntilVisible().click();
    }

    public boolean isProductInCart() {
        return findBy("//div[@class='cart_item_label']").isPresent();
    }
}
