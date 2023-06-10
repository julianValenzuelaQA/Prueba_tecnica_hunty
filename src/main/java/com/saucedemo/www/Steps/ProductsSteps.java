package com.saucedemo.www.Steps;

import com.saucedemo.www.PageObject.ProductsObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductsSteps extends ScenarioSteps {

    ProductsObject productsObject;


    @Step
    public void goToCart() {
        productsObject.goToCart();
    }

    @Step
    public void clickProductName() {
        productsObject.clickProductName();
    }

    @Step
    public void clickProductImage() {
        productsObject.clickProductImage();
    }

    @Step
    public void selectFilterOption(String option) {
        productsObject.selectFilterOption(option);
    }

    @Step
    public void addProductToCart() {
        productsObject.addProductToCart();
    }

    @Step
    public void verifyProductDetailsPageUrl() {
        assertThat(productsObject.isOnItemDetails()).isTrue();
    }

    @Step
    public void verifyProductsSortedByPriceLowToHigh() {
        List<Double> actualPrices = productsObject.getProductPrices();
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        Collections.sort(expectedPrices);
        assertThat(actualPrices).isEqualTo(expectedPrices);
    }

    @Step
    public void verifyProductsSortedByPriceHighToLow() {
        List<Double> actualPrices = productsObject.getProductPrices();
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        Collections.sort(expectedPrices, Collections.reverseOrder());
        assertThat(actualPrices).isEqualTo(expectedPrices);
    }

    @Step
    public void verifyProductsSortedByNameAToZ() {
        List<String> actualNames = productsObject.getProductNames();
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames);
        assertThat(actualNames).isEqualTo(expectedNames);
    }

    @Step
    public void verifyProductsSortedByNameZToA() {
        List<String> actualNames = productsObject.getProductNames();
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, Collections.reverseOrder());
        assertThat(actualNames).isEqualTo(expectedNames);
    }

}
