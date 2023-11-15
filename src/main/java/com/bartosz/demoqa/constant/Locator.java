package com.bartosz.demoqa.constant;

import lombok.Getter;

@Getter
public class Locator {
    public static final String CARD_BOX_LOCATOR = "//*[@class='card-body']/*[contains(text(),'%s')]";
    public static final String MENU_LIST_BUTTON_LOCATOR = "//*[text()='%s']";
    public static final String TEXT_FIELD_CONTAINER_LOCATOR = ".text-field-container ";
    public static final String FIELD_ERROR_FORM_CONTROL_LOCATOR = "mr-sm-2 field-error form-control";
    public static final String BY_ID_USER_EMAIL_LOCATOR = "#userEmail";
    public static final String BY_ID_OUTPUT_LOCATOR = "#output";
    public static final String BY_CLASS_CHECK_BOX_LOCATOR = ".rct-checkbox";
}
