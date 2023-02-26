package com.saucedemo.core;

import org.openqa.selenium.WebDriver;

/**
 Base class for all page classes
 */

public abstract class BasePage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
}
