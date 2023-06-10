package com.saucedemo.www.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class FinishObject extends PageObject {

    @FindBy(className = "subheader")
    private WebElementFacade finishLabel;

    @FindBy(className = "complete-header")
    private WebElementFacade confirmationMessage;

    public boolean isOnFinishPage() {
        return finishLabel.isDisplayed();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}
