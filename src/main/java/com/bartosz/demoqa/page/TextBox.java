package com.bartosz.demoqa.page;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.bartosz.demoqa.constant.Locator.textFieldContainerLocator;

public class TextBox {
    private Page page;
    Faker FAKER = new Faker();


    public TextBox(Page page) {
        this.page = page;
    }

    public void fillInput(String locatorId, String text) {
        page.locator("#" + locatorId).fill(text);
    }

    public void fillFormUsingName(String name) {
        page.locator(textFieldContainerLocator +"#userName").fill(name);
        page.locator(textFieldContainerLocator +"#userEmail").fill(FAKER.internet().emailAddress());
        page.locator(textFieldContainerLocator +"#currentAddress").fill(FAKER.address().fullAddress());
        page.locator(textFieldContainerLocator +"#permanentAddress").fill(FAKER.address().secondaryAddress());
    }

    public Locator getOutputText(String rowName) {
        return page.locator("#output #" + rowName);
    }

    public void submit() {
        page.locator("#submit").click();
    }
}
