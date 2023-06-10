package com.saucedemo.www.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class OverViewObject extends PageObject {

    @FindBy(className = "subheader")
    private WebElementFacade overviewLabel;

    @FindBy(className = "summary_total_label")
    private WebElementFacade totalLabel;

    @FindBy(xpath = "//a[@href='./checkout-complete.html']")
    private WebElementFacade finishButton;

    public boolean isOnOverviewPage() {
        return overviewLabel.isDisplayed();
    }

    public void clickFinish() {
        finishButton.click();
    }
}
