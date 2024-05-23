package com.bartosz.demoqa;

import com.bartosz.demoqa.page.*;
import com.bartosz.demoqa.page.webtables.RegistrationFormModal;
import com.bartosz.demoqa.page.webtables.WebTablesPage;
import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.BeforeEach;

import static com.bartosz.demoqa.constant.Address.HOME_PAGE;

public abstract class BaseTest {
    public Page page;
    protected CategoryPage categoryPage;
    protected TextBoxPage textBoxPage;
    protected CheckBoxPage checkBoxPage;
    protected ButtonsPage buttonsPage;
    protected RadioButtonPage radioButtonPage;
    protected WebTablesPage webTablesPage;
    protected RegistrationFormModal registrationFormModal;

    Faker FAKER = new Faker();

    protected BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);

   @BeforeEach
    public void setup() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(launchOptions);
        page = browser.newPage();
        categoryPage = new CategoryPage(page);
        textBoxPage = new TextBoxPage(page);
        checkBoxPage = new CheckBoxPage(page);
        buttonsPage = new ButtonsPage(page);
        radioButtonPage = new RadioButtonPage(page);
        webTablesPage = new WebTablesPage(page);
        registrationFormModal = new RegistrationFormModal(page);
        page.navigate(HOME_PAGE);
    }
}
