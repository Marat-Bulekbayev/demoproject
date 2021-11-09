package com.google.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage extends AbstractGooglePage {

    private static final String PAGE_URL = "https://google.com/";

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchInput;

    public GoogleMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public GoogleMainPage openPage() {
        driver.navigate().to(PAGE_URL);
        return this;
    }

    public GoogleSearchResultsPage search(String searchItem) {
        searchInput.sendKeys(searchItem);
        searchInput.sendKeys(Keys.RETURN);
        return new GoogleSearchResultsPage(driver);
    }
}
