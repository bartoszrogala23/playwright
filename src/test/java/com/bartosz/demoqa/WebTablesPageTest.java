package com.bartosz.demoqa;

import com.bartosz.demoqa.model.WebTableRecord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.bartosz.demoqa.constant.Item.ELEMENTS;
import static com.bartosz.demoqa.constant.Item.WEB_TABLES;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class WebTablesPageTest extends BaseTest {

    @Test
    @DisplayName("added record should be visible in the table")
    public void addRecordTest() {
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(WEB_TABLES);
        webTablesPage.addRecord();
        WebTableRecord sampleWorker = Specification.createRandomRecord();
        registrationFormModal.fillRegistrationForm(sampleWorker);
        registrationFormModal.search(sampleWorker.getEmail());
        assertThat(webTablesPage.emailLocator).containsText(sampleWorker.getEmail());
    }
}
