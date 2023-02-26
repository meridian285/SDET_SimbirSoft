package com.saucedemo.config;

import com.saucedemo.core.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.WebDriverWait;
import readProperties.ConfigProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * The base class for initializing and setting up the web driver
 */

public abstract class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BasePage.setDriver(driver);
    }

    @After
    public void clearDate() {
        driver.manage().deleteAllCookies();
        ((WebStorage) driver).getLocalStorage().clear();
        ((WebStorage) driver).getSessionStorage().clear();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
