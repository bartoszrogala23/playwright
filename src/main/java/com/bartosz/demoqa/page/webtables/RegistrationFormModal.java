package com.bartosz.demoqa.page.webtables;

import com.bartosz.demoqa.model.WebTableRecord;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RegistrationFormModal extends WebTablesPage {
    public Locator firstNameInput;
    public Locator lastNameInput;
    public Locator emailInput;
    public Locator ageInput;
    public Locator salaryInput;
    public Locator departmentInput;
    public Locator submitButton;
    public Locator tableRow;
    public Locator searchInput;
    public Locator currentControlIcon;

    public RegistrationFormModal(Page page) {
        super(page);
        this.firstNameInput = page.getByPlaceholder("First Name");
        this.lastNameInput = page.getByPlaceholder("Last Name");
        this.emailInput = page.getByPlaceholder("name@example.com");
        this.ageInput = page.getByPlaceholder("Age");
        this.salaryInput = page.getByPlaceholder("Salary");
        this.departmentInput = page.getByPlaceholder("Department");
        this.submitButton = page.locator("#submit");
        this.tableRow = page.locator("role='rowgroup'");
        this.searchInput = page.getByPlaceholder("Type to search");
        this.currentControlIcon = page.locator(".input-group-append");
    }

    public void fillRegistrationForm(WebTableRecord record) {
        firstNameInput.fill(record.getFirstName());
        lastNameInput.fill(record.getLastName());
        emailInput.fill(record.getEmail());
        ageInput.fill(record.getAge());
        salaryInput.fill(record.getSalary());
        departmentInput.fill(record.getDepartment());
        submitButton.click();
    }

    public void search(String searchValue) {
        currentControlIcon.click();
        searchInput.fill(searchValue);
    }
}
