package com.bartosz.demoqa;

import com.bartosz.demoqa.page.ButtonsPage;
import com.bartosz.demoqa.page.CategoryPage;
import com.bartosz.demoqa.page.CheckBoxPage;
import com.bartosz.demoqa.page.TextBoxPage;
import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.bartosz.demoqa.constant.Address.HOME_PAGE;

public abstract class BaseTest {
    protected Page page;
    protected CategoryPage categoryPage;
    protected TextBoxPage textBoxPage;
    protected CheckBoxPage checkBoxPage;
    protected ButtonsPage buttonsPage;

    Faker FAKER = new Faker();

    public void launchBrowser() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        page = browser.newPage();
        categoryPage = new CategoryPage(page);
        textBoxPage = new TextBoxPage(page);
        checkBoxPage = new CheckBoxPage(page);
        buttonsPage = new ButtonsPage(page);
        page.navigate(HOME_PAGE);
    }
}
