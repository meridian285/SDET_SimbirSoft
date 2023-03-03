package com.saucedemo.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

import static org.junit.Assert.assertEquals;

/**
 * Order completion page class
 */

public class CheckoutCompletePage extends CartPage {
    //Order Completion Label Locator
    @FindBy(css = ".complete-header")
    private WebElement checkMessageText;

    //Element initialization constructor
    public CheckoutCompletePage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Method of checking that the order is completed")
    public void checkMessage() {
        String expectedMessage = ConfigProvider.MESSAGE_COMPLETED_ORDER;
        String expectedUrl = ConfigProvider.URL_COMPLETED_ORDER;
        assertEquals("Order completed message is not correct", expectedMessage, checkMessageText.getText());
        assertEquals("Expected to match given URL", expectedUrl, driver.getCurrentUrl());
    }
}
