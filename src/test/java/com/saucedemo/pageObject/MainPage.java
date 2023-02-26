package com.saucedemo.pageObject;

import com.saucedemo.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Main page class
 */

public class MainPage extends BasePage {
    //Product item list locator
    @FindBy(xpath = "//button[text()='Add to cart']")
    private List<WebElement> productList;
    //Cart Locator
    @FindBy(css = ".shopping_cart_container")
    private WebElement basketButton;

    //Element initialization constructor
    public MainPage() {
        PageFactory.initElements(driver, this);
    }
    @Step("Method for adding the first item to the cart")
    public MainPage findFirstElement() {
        productList.get(0).click();
        return this;
    }

    @Step("Cart click method")
    public CartPage cartClick() {
        basketButton.click();
        return new CartPage();
    }
}
