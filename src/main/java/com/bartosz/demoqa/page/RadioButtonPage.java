package com.bartosz.demoqa.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RadioButtonPage {
    private Page page;
    public Locator resultLocator;
    public Locator noButton;

    public RadioButtonPage(Page page) {
        this.page = page;
        this.resultLocator = page.locator(".text-success");
        this.noButton = page.getByText("No");
    }

    public void selectRadioButton(String name) {
        page.getByText(name)
                .click();
    }
}
