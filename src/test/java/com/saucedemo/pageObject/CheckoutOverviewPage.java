package com.saucedemo.pageObject;

import com.saucedemo.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Operation confirmation page class
 */

public class CheckoutOverviewPage extends BasePage {
    //Finish button locator
    @FindBy(id = "finish")
    private WebElement finishButton;

    //Element initialization constructor
    public CheckoutOverviewPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Finish button click method")
    public CheckoutCompletePage clickButtonFinish() {
        finishButton.click();
        return new CheckoutCompletePage();
    }
}
