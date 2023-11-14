package com.bartosz.demoqa;

import com.bartosz.demoqa.page.CategoryPage;
import com.bartosz.demoqa.page.TextBox;
import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.BeforeEach;

import static com.bartosz.demoqa.constant.Address.HOME_PAGE;

public abstract class BaseTest {
    protected Page page;
    protected CategoryPage categoryPage;
    protected TextBox textBox;

    Faker FAKER = new Faker();

    public void launchBrowser() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        page = browser.newPage();
        categoryPage = new CategoryPage(page);
        textBox = new TextBox(page);
        page.navigate(HOME_PAGE);
    }
}
