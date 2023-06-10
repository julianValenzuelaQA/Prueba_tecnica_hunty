package com.saucedemo.www.Steps;

import com.saucedemo.www.PageObject.OptionsObject;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class OptionsSteps extends ScenarioSteps {

    @Steps
    OptionsObject optionsObject;

    public void iClickOnTheMenuButton() {
        optionsObject.openMenu();
    }

    public void iClickOnTheLogoutOption() {
        optionsObject.clickLogout();
    }

}
