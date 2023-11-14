package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.*;
import static com.bartosz.demoqa.constant.Locator.fieldErrorFormControlLocator;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TextBoxPageTest extends BaseTest {

    @Test
    @DisplayName("Correctly filled textBox should return filled frame")
    public void fillTextBoxTest() {
        launchBrowser();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(TEXT_BOX);
        String sampleName = FAKER.name().fullName();
        textBoxPage.fillFormUsingName(sampleName);
        textBoxPage.submit();
        assertThat(textBoxPage.getOutputText(NAME)).containsText(sampleName);
    }

    @Test
    @DisplayName("Red frame should appear while filling incorrect email")
    public void fillInputUsingIncorrectEmail() {
        launchBrowser();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(TEXT_BOX);
        textBoxPage.fillInput(USER_EMAIL, FAKER.name().name());
        textBoxPage.submit();
        assertThat(page.locator("#userEmail")).hasClass(fieldErrorFormControlLocator);
        assertThat(page.locator("#output")).isEmpty();
    }
}
