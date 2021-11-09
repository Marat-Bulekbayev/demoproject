package com.google.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchResultsPage extends AbstractGooglePage {

    @FindBy(xpath = "//div[@id='res']//a//cite")
    private List<WebElement> searchResults;

    public GoogleSearchResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractGooglePage openPage() {
        return null;
    }

    public int getSearchResultsSize() {
        return searchResults.size();
    }

    public boolean isResultPresent(String expectedSearchResult) {
        boolean isPresent = false;

        for (WebElement result : searchResults) {
            isPresent = result.getText().contains(expectedSearchResult);
        }

        return isPresent;
    }
}
