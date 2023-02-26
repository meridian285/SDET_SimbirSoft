package com.saucedemo.pageObject;

import com.saucedemo.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Order completion page class
 */

public class CartPage extends BasePage {
    //Data Verification Confirmation Button Locator
    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    //Element initialization constructor
    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Validation confirmation button click method")
    public CheckYouInformationPage checkoutButton() {
        checkoutButton.click();
        return new CheckYouInformationPage();
    }
}
