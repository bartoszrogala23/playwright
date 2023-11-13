package com.bartosz.demoqa;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.bartosz.demoqa.constant.Address.HOME_PAGE;

public class Main {
    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch(
                    new LaunchOptions().setHeadless(false)
            );
            Page page = browser.newPage();
            page.navigate(HOME_PAGE);

        }
    }
}