package com.saucedemo.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.saucedemo.www.Features/buy_products.feature",
        glue = "com/saucedemo/www/StepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuyProductsRunner {
}
