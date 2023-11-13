package com.bartosz.demoqa.page;

import com.microsoft.playwright.Page;

public class CategoryPage {
private final Page page;

    public CategoryPage(Page page) {
        this.page = page;
    }

    public final String cardBoxLocator = "//*[@class='card-body']/*[contains(text(),'%s')]";

    public void selectCardBox(String name) {
        page.locator(String.format(cardBoxLocator, name)).click();
    }
}
