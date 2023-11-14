package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.*;
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
}
