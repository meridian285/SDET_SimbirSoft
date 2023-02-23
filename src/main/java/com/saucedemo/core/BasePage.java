package com.saucedemo.core;

import org.openqa.selenium.WebDriver;

/**
 Базовый класс для всех page классов
 */

public abstract class BasePage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
}
