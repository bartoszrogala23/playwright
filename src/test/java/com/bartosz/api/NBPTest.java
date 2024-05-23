package com.bartosz.api;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.core.api.Assertions.assertThat;


public class NBPTest {

    @Test
    @DisplayName("Sample GET test")
    public void getTable() {
        Playwright playwright = Playwright.create();
        APIRequest request = playwright.request();
        APIRequestContext requestContext = request.newContext();

        APIResponse response = requestContext.get("http://api.nbp.pl/api/exchangerates/tables/A/");
        assertThat(response.status()).isEqualTo(SC_OK);

    }

}
