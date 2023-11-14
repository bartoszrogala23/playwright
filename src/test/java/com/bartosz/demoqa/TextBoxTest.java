package com.bartosz.demoqa;

import com.bartosz.demoqa.page.TextBox;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TextBoxTest extends BaseTest {

    @Test
    @DisplayName("Correctly filled textbox should return filled frame")
    public void fillTextBoxTest() {
        launchBrowser();
        categoryPage.selectCardBox("Elements");
        categoryPage.selectMenuButton("Text Box");
        String sampleName = FAKER.name().fullName();
//        klasa + builder żeby ułatwić asercję i zmienic argumenty w fillFormUsingName
        textBox.fillFormUsingName(sampleName);
        textBox.submit();
        assertThat(textBox.getOutputText("name")).containsText(sampleName);
    }
}
