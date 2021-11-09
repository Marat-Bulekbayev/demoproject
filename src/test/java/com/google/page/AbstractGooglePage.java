package com.google.page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractGooglePage {

    protected WebDriver driver;

    protected AbstractGooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract AbstractGooglePage openPage();
}
