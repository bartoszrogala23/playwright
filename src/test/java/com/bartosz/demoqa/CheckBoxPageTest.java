package com.bartosz.demoqa;

import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.bartosz.demoqa.constant.Item.CHECK_BOX;
import static com.bartosz.demoqa.constant.Item.ELEMENTS;
import static com.bartosz.demoqa.constant.Locator.BY_CLASS_CHECK_BOX_LOCATOR;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckBoxPageTest extends BaseTest {

    @Test
    @DisplayName("Home checkbox should be selected")
    public void checkBoxTest() {
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(CHECK_BOX);
        checkBoxPage.selectTreeNode("Home");
        assertThat(page.locator(BY_CLASS_CHECK_BOX_LOCATOR)).isChecked();
    }
}
