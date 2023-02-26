package com.saucedemo.pageObject;

import com.saucedemo.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

import static org.junit.Assert.assertEquals;

/**
 * Authorization page class
 */

public class LoginPage extends BasePage {

    //Login input field locator
    @FindBy(xpath = "//input[@name='user-name']")
    private WebElement loginField;
    //Password input field locator
    @FindBy(id = "password")
    private WebElement passwordField;
    //LOGIN button locator
    @FindBy(id = "login-button")
    private WebElement loginButton;
    //Invalid login message locator
    @FindBy(css = ".error-message-container")
    private WebElement errorMessage;

    //Element initialization constructor
    public LoginPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    @Step("Authorization method")
    public MainPage login(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
        return new MainPage();
    }

    @Step("Method for Checking the Error Message for Invalid Login Details")
    public void checkErrorMessage() {
        String expected = "Epic sadface: Username and password do not match any user in this service";
        String actual = errorMessage.getText();
        assertEquals("Expected message about invalid credentials",expected, actual);
    }
}
