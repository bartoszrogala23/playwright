package com.bartosz.demoqa.page;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.bartosz.demoqa.constant.Locator.TEXT_FIELD_CONTAINER_LOCATOR;

public class TextBoxPage {
    private Page page;
    Faker FAKER = new Faker();

    public TextBoxPage(Page page) {
        this.page = page;
    }

    public void fillInput(String locatorId, String text) {
        page.locator("#" + locatorId).fill(text);
    }

    public void fillFormUsingName(String name) {
        page.locator(TEXT_FIELD_CONTAINER_LOCATOR +"#userName").fill(name);
        page.locator(TEXT_FIELD_CONTAINER_LOCATOR +"#userEmail").fill(FAKER.internet().emailAddress());
        page.locator(TEXT_FIELD_CONTAINER_LOCATOR +"#currentAddress").fill(FAKER.address().fullAddress());
        page.locator(TEXT_FIELD_CONTAINER_LOCATOR +"#permanentAddress").fill(FAKER.address().secondaryAddress());
    }

    public Locator getOutputText(String rowName) {
        return page.locator("#output #" + rowName);
    }

    public void submit() {
        page.locator("#submit").click();
    }
}
