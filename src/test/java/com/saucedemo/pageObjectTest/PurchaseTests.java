package com.saucedemo.pageObjectTest;

import com.saucedemo.config.BaseTest;
import com.saucedemo.pageObject.LoginPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import readProperties.ConfigProvider;

/**
 * Test class for testing order creation
 */
public class PurchaseTests extends BaseTest {

    @Test
    @DisplayName("Checking a successful purchase")
    public void checkPurchase() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigProvider.USER_LOGIN, ConfigProvider.USER_PASSWORD)
                .findFirstElement()
                .cartClick()
                .checkoutButton()
                .inputCheckFields(ConfigProvider.FIRST_NAME, ConfigProvider.LAST_NAME, ConfigProvider.POSTAL_CODE)
                .clickButtonFinish()
                .checkMessage();
    }
}
