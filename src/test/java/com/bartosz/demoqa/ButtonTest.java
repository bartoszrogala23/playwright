package com.bartosz.demoqa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.bartosz.demoqa.constant.Item.BUTTONS;
import static com.bartosz.demoqa.constant.Item.ELEMENTS;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ButtonTest extends BaseTest {

    @Test
    @DisplayName("Double click button should invoke expected message")
    public void doubleClickTest() {
        setup();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(BUTTONS);
        buttonsPage.doubleClick();
        assertThat(buttonsPage.doubleClickMessageLocator)
                .containsText("You have done a double click");
    }

    @Test
    @DisplayName("Right click button should invoke expected message")
    public void rightClickTest() {
        setup();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(BUTTONS);
        buttonsPage.rightClick();
        assertThat(buttonsPage.rightClickMessageLocator)
                .containsText("You have done a right click");
    }

    @Test
    @DisplayName("Single click button should invoke expected message")
    public void singleClickTest() {
        setup();
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(BUTTONS);
        buttonsPage.dynamicClick();
        assertThat(buttonsPage.dynamicClickMessageLocator)
                .containsText("You have done a dynamic click");
    }
}
