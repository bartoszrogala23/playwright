package com.bartosz.demoqa.page;

import com.microsoft.playwright.Page;

import static com.bartosz.demoqa.constant.Locator.cardBoxLocator;
import static com.bartosz.demoqa.constant.Locator.menuListButtonLocator;

public class CategoryPage {
private final Page page;

    public CategoryPage(Page page) {
        this.page = page;
    }

    public void selectCardBox(String name) {
        page.locator(String.format(cardBoxLocator, name)).click();
    }

    public void selectMenuButton(String buttonName) {
        page.locator(String.format(menuListButtonLocator, buttonName)).click();
    }
}
