package com.bartosz.demoqa.page.webtables;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class WebTablesPage {
    private Page page;
    public Locator addButton;
    public Locator searchBox;
    public Locator rowDropdown;
    public Locator emailLocator;


    public WebTablesPage(Page page) {
        this.page = page;
        this.addButton = page.locator("#addNewRecordButton");
        this.searchBox = page.locator("#searchBox");
        this.rowDropdown = page.locator(".select-wrap");
        this.emailLocator = page.locator("[role=rowgroup] [role=gridcell]").nth(3);
    }

    public void addRecord() {
        addButton.click();
    }

}
