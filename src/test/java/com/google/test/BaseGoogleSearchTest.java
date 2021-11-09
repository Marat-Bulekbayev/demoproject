package com.google.test;

import com.google.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseGoogleSearchTest {

    protected WebDriver driver = null;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
    }

    @AfterSuite
    public void cleanUp() {
        Driver.closeDriver();
    }
}
