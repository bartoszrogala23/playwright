package com.bartosz.demoqa.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckBoxPage {
    private Page page;
    Locator homeCheckBox;

    public CheckBoxPage(Page page) {
        this.page = page;
        this.homeCheckBox = page.locator("//*[@id='tree-node']//*[text()='Home']");
    }

    public void selectHome() {
        homeCheckBox.click();
    }
}
