package com.bartosz.demoqa.page.webtables;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.bartosz.demoqa.Specification.generateRandomNumber;
import static java.lang.String.valueOf;

public class RegistrationFormModal extends WebTablesPage {
    private Page page;
    public Locator firstNameInput;
    public Locator lastNameInput;
    public Locator emailInput;
    public Locator ageInput;
    public Locator salaryInput;
    public Locator departmentInput;
    public Locator submitButton;

    private static final Faker FAKER = new Faker();

    public RegistrationFormModal(Page page) {
        super(page);
        this.firstNameInput = page.getByPlaceholder("First Name");
        this.lastNameInput = page.getByPlaceholder("Last Name");
        this.emailInput = page.getByPlaceholder("name@example.com");
        this.ageInput = page.getByPlaceholder("Age");
        this.salaryInput = page.getByPlaceholder("Salary");
        this.departmentInput = page.getByPlaceholder("Department");
        this.submitButton = page.locator("#submit");
    }


    public void fillRegistrationForm() {
        firstNameInput.fill(FAKER.name().firstName());
        lastNameInput.fill(FAKER.name().lastName());
        emailInput.fill(FAKER.internet().emailAddress());
        ageInput.fill(valueOf(generateRandomNumber(18, 42)));
        salaryInput.fill(valueOf(generateRandomNumber(2000, 8000)));
        departmentInput.fill(FAKER.lordOfTheRings().location() + " Department");
        submitButton.click();
    }
}
