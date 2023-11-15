package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.CHECK_BOX;
import static com.bartosz.demoqa.constant.Item.ELEMENTS;
import static com.bartosz.demoqa.constant.Locator.BY_CLASS_CHECK_BOX_LOCATOR;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckBoxPageTest extends BaseTest {

    @Test
    @DisplayName("Home checkbox should be selected")
    public void checkBoxTest() {
        setup();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(CHECK_BOX);
        checkBoxPage.selectHome();
        assertThat(page.locator(BY_CLASS_CHECK_BOX_LOCATOR)).isChecked();
    }
}
