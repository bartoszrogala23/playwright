package com.bartosz.demoqa.page;

import com.microsoft.playwright.Page;

import static com.bartosz.demoqa.constant.Locator.CARD_BOX_LOCATOR;
import static com.bartosz.demoqa.constant.Locator.MENU_LIST_BUTTON_LOCATOR;

public class CategoryPage {
private final Page page;

    public CategoryPage(Page page) {
        this.page = page;
    }

    public void selectCardBox(String name) {
        page.locator(String.format(CARD_BOX_LOCATOR, name)).click();
    }

    public void selectMenuButton(String buttonName) {
        page.locator(String.format(MENU_LIST_BUTTON_LOCATOR, buttonName)).click();
    }
}
