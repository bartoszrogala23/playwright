package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.*;
import static com.bartosz.demoqa.constant.Locator.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TextBoxPageTest extends BaseTest {


    @Test
    @DisplayName("Correctly filled textBox should return filled frame")
    public void fillTextBoxTest() {
        setup();
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
        setup();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(TEXT_BOX);
        textBoxPage.fillInput(USER_EMAIL, FAKER.name().name());
        textBoxPage.submit();
        assertThat(page.locator(BY_ID_USER_EMAIL_LOCATOR)).hasClass(FIELD_ERROR_FORM_CONTROL_LOCATOR);
        assertThat(page.locator(BY_ID_OUTPUT_LOCATOR)).isEmpty();
    }
}
