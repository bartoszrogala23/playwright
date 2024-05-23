package com.bartosz.demoqa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.bartosz.demoqa.constant.Item.*;

public class WebTablesPageTest extends BaseTest{

    @Test
    @DisplayName("added record should be visible in the table")
    public void addRecordTest() {
        categoryPage.selectCardBox(ELEMENTS);
        categoryPage.selectMenuButton(WEB_TABLES);
        webTablesPage.addRecord();
        registrationFormModal.fillRegistrationForm();
    }
}
