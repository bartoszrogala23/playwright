package com.bartosz.demoqa.page;

import com.microsoft.playwright.Page;

public class CheckBoxPage {
    private Page page;

    public CheckBoxPage(Page page) {
        this.page = page;
    }

    public void expandNodeTree() {
        page.getByTitle("Toggle")
                .first()
                .click();
    }

    public void selectTreeNode(String nodeName) {
        page.getByText(nodeName).click();
    }
}
