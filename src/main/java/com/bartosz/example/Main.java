package com.bartosz.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Main {
    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch(
                    new LaunchOptions().setHeadless(false)
            );
            Page page = browser.newPage();
            page.navigate("https://demoqa.com/");

        }
    }
}