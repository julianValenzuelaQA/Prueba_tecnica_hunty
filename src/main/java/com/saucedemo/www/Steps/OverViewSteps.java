package com.saucedemo.www.Steps;

import com.saucedemo.www.PageObject.OverViewObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;
public class OverViewSteps extends ScenarioSteps {

    OverViewObject overViewObject;

    @Step
    public void verifyOverviewPage() {
        assertThat(overViewObject.isOnOverviewPage()).isTrue();
    }

    @Step
    public void clickFinish() {
        overViewObject.clickFinish();
    }
}
