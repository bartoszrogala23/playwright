package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.*;
import static com.bartosz.demoqa.constant.Locator.fieldErrorFormControlLocator;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TextBoxTest extends BaseTest {

    @Test
    @DisplayName("Correctly filled textBox should return filled frame")
    public void fillTextBoxTest() {
        launchBrowser();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(TEXT_BOX);
        String sampleName = FAKER.name().fullName();
        textBox.fillFormUsingName(sampleName);
        textBox.submit();
        assertThat(textBox.getOutputText(NAME)).containsText(sampleName);
    }

    @Test
    @DisplayName("Red frame should appear while filling incorrect email")
    public void fillInputUsingIncorrectEmail() {
        launchBrowser();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(TEXT_BOX);
        textBox.fillInput(USER_EMAIL, FAKER.name().name());
        textBox.submit();
        assertThat(page.locator("#userEmail")).hasClass(fieldErrorFormControlLocator);
        assertThat(page.locator("#output")).isEmpty();
    }
}
