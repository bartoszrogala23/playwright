package com.bartosz.demoqa.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.AllArgsConstructor;

public class CategoryPage {
public Page categoryPage;

    public CategoryPage(Page page) {
        this.categoryPage = page;
    }

    private final String cardBoxLocator = "//*[@class='card-body']/*[contains(text(),'%s')]";

    public Locator description = categoryPage.locator("Ad.Plus-728x90");

    public void selectCardBox(String name) {
        categoryPage.locator(String.format(cardBoxLocator, name)).click();
    }
}
