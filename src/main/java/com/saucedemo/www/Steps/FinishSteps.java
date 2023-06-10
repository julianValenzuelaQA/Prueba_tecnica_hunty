package com.saucedemo.www.Steps;

import com.saucedemo.www.PageObject.FinishObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;
public class FinishSteps extends ScenarioSteps {

    FinishObject finishObject;

    @Step
    public void verifyFinishPage() {
        assertThat(finishObject.isOnFinishPage()).isTrue();
    }

    @Step
    public void verifyConfirmationMessage(String expectedMessage) {
        assertThat(finishObject.getConfirmationMessage()).isEqualTo(expectedMessage);
    }
}
