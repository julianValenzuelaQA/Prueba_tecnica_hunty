package com.saucedemo.www.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsObject extends PageObject {

    @FindBy(className = "product_label")
    private WebElementFacade productsLabel;

    @FindBy(className = "shopping_cart_link")
    private WebElementFacade cartLink;

    @FindBy(className = "product_sort_container")
    private WebElementFacade filterDropdown;

    @FindBy(className = "inventory_details_back_button")
    private WebElementFacade backButton;

    public boolean isOnProductsPage() {
        return productsLabel.isDisplayed();
    }

    public void goToCart() {
        cartLink.click();
    }

    public void selectFilterOption(String option) {
        filterDropdown.selectByVisibleText(option);
    }

    public void addProductToCart() {
        findBy("//button[contains(text(),'ADD TO CART')]").click();
    }

    public void clickProductImage() {
        findBy("//img[1]").click();
    }

    public void clickProductName() {
        findBy("//div[@class='inventory_item_name'][1]").click();
    }
    public boolean isOnItemDetails() {
        return backButton.isDisplayed();
    }

    public List<String> getProductNames() {
        List<WebElementFacade> nameElements = findAll("//div[@class='inventory_item_name']");
        return nameElements.stream().map(WebElementFacade::getText).collect(Collectors.toList());
    }

    public List<Double> getProductPrices() {
        List<WebElementFacade> priceElements = findAll("//div[@class='inventory_item_price']");
        return priceElements.stream().map(WebElementFacade::getText).map(this::parsePrice).collect(Collectors.toList());
    }

    private double parsePrice(String priceText) {
        return Double.parseDouble(priceText.replace("$", ""));
    }

}
