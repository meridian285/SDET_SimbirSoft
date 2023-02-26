package com.saucedemo.pageObject;

import com.saucedemo.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Your Information Validation Class
 */

public class CheckYouInformationPage extends BasePage {
    //Name input field locator
    @FindBy(xpath = "//input[@id = 'first-name']")
    private WebElement firstNameField;
    //Last name input field locator
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameField;
    //Zip code input field locator
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCodField;
    //Continue button locator
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    //Element initialization constructor
    public CheckYouInformationPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Method for filling in validation fields")
    public CheckoutOverviewPage inputCheckFields(String firstName, String lastName, String postalCod) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodField.sendKeys(postalCod);
        continueButton.click();
        return new CheckoutOverviewPage();
    }
}