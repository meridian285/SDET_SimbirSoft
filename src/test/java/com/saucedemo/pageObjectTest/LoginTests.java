package com.saucedemo.pageObjectTest;

import com.saucedemo.config.BaseTest;
import com.saucedemo.pageObject.LoginPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import readProperties.ConfigProvider;

/**
 * Test class for testing login
 */
public class LoginTests extends BaseTest {

    @Test
    @DisplayName("Checking the error message when trying to login to a non-existent user")
    public void loginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigProvider.INVALID_USER_LOGIN, ConfigProvider.INVALID_USER_PASSWORD);
    }
}
