package com.bartosz.demoqa.page.webtables;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class WebTablesPage {
    private Page page;
    public Locator addButton;
    public Locator searchBox;
    public Locator rowDropdown;

    public WebTablesPage(Page page) {
        this.page = page;
        this.addButton = page.locator("#addNewRecordButton");
        this.searchBox = page.locator("#searchBox");
        this.rowDropdown = page.locator(".select-wrap");
    }

    public void addRecord() {
        addButton.click();
    }

}
