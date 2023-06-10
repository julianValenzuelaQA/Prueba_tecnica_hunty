package com.saucedemo.www.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OptionsObject extends PageObject {

    @FindBy(xpath = "//div[@class='bm-burger-button']")
    private WebElementFacade menuButton;


    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElementFacade logoutLink;


    public void openMenu() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }
}
