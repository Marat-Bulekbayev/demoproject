package com.google.test;

import com.google.page.GoogleMainPage;
import com.google.page.GoogleSearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseGoogleSearchTest {

    private static final String SEARCH_VALUE = "купить кофемашину bork c804";
    private static final String EXPECTED_SEARCH_RESULT = "mvideo.ru";
    private static final int EXPECTED_SEARCH_RESULT_SIZE = 10;

    @Test
    public void testGoogleSearch() {
        GoogleSearchResultsPage searchResultsPage = new GoogleMainPage(driver).openPage().search(SEARCH_VALUE);

        Assert.assertTrue(searchResultsPage.getSearchResultsSize() >= EXPECTED_SEARCH_RESULT_SIZE);
        Assert.assertTrue(searchResultsPage.isResultPresent(EXPECTED_SEARCH_RESULT));
    }
}
