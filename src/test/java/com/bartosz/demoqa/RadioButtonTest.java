package com.bartosz.demoqa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.bartosz.demoqa.constant.Item.ELEMENTS;
import static com.bartosz.demoqa.constant.Item.RADIO_BUTTON;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class RadioButtonTest extends BaseTest {

    @Test
    @DisplayName("'No' button should not be clickable test")
    public void fillTextBoxTest() {
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(RADIO_BUTTON);
        radioButtonPage.selectRadioButton("Yes");
        assertThat(radioButtonPage.resultLocator).containsText("Yes");
        radioButtonPage.selectRadioButton("Impressive");
        assertThat(radioButtonPage.resultLocator).containsText("Impressive");
        assertThat(radioButtonPage.noButton).isDisabled();

    }
}
