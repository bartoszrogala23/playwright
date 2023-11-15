package com.bartosz.demoqa.page;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.MouseButton;


public class ButtonsPage {
    private Page page;
    private Locator doubleClickButtonLocator;
    private Locator rightClickButtonLocator;
    private Locator dynamicClickButtonLocator;
    public Locator doubleClickMessageLocator;
    public Locator rightClickMessageLocator;
    public Locator dynamicClickMessageLocator;

    public ButtonsPage(Page page) {
        this.page = page;
        this.doubleClickButtonLocator = page.locator("#doubleClickBtn");
        this.rightClickButtonLocator = page.locator("#rightClickBtn");
        this.dynamicClickButtonLocator = page.locator("//button[normalize-space()='Click Me']");
        this.doubleClickMessageLocator = page.locator("#doubleClickMessage");
        this.rightClickMessageLocator = page.locator("#rightClickMessage");
        this.dynamicClickMessageLocator = page.locator("#dynamicClickMessage");
    }



    public void doubleClick() {
        doubleClickButtonLocator.dblclick();
    }

    public void rightClick() {
        rightClickButtonLocator.elementHandle()
                .click(new ElementHandle.ClickOptions().setButton(MouseButton.RIGHT));
    }

    public void dynamicClick() {
        dynamicClickButtonLocator.click();
    }
}
