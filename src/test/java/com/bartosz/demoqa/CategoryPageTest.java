package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CategoryPageTest extends BaseTest {

    @Test
    @DisplayName("Verify if you even can setup simple test")
    public void selectElementCardBoxTest() {
        launchBrowser();
        categoryPage.selectCardBox("Elements");
        assertThat(page.locator("//*[@class='main-header']")).containsText("Elements");
    }
}
