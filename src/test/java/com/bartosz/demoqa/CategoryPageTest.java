package com.bartosz.demoqa;

import com.bartosz.demoqa.page.CategoryPage;
import org.junit.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CategoryPageTest extends BaseTest {

    @Test
    public void test() {
        categoryPage.selectCardBox("elements");
        assertThat(categoryPage.description)
                .containsText("Please select an item from left to start practice.");
    }
}
