package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.ELEMENTS;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckBoxPageTest extends BaseTest {

    @Test
    @DisplayName("Home checkbox should be selected")
    public void checkBoxTest() {
        launchBrowser();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton("Check Box");
        checkBoxPage.selectHome();
        assertThat(page.locator(".rct-checkbox")).isChecked();
    }
}
