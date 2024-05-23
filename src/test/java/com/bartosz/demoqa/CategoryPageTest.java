package com.bartosz.demoqa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CategoryPageTest extends BaseTest {

    @Test
    @DisplayName("Verify if you even can setup simple test")
    public void selectElementCardBoxTest() {
        categoryPage.selectCardBox("Elements");
        assertThat(page.locator("//*[@class='main-header']")).containsText("Elements");
    }
}
