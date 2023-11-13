package com.bartosz.api;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.junit.Test;


public class NBPTest {

    @Test
    public void test() {
        Playwright playwright = Playwright.create();
        APIRequest request = playwright.request();
        APIRequestContext requestContext = request.newContext();

        APIResponse response = requestContext.get("http://api.nbp.pl/api/exchangerates/tables/A/");

    }

}
