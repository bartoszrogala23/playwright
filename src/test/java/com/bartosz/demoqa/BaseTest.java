package com.bartosz.demoqa;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.bartosz.demoqa.page.CategoryPage;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {
    Page page;
    protected CategoryPage categoryPage;


    @BeforeEach
    public void setup (){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }
}
