package com.bartosz.demoqa.constant;

import lombok.Getter;

@Getter
public class Locator {
    public static final String cardBoxLocator = "//*[@class='card-body']/*[contains(text(),'%s')]";
    public static final String menuListButtonLocator = "//*[text()='%s']";
    public static final String textFieldContainerLocator = ".text-field-container ";
    public static final String fieldErrorFormControlLocator = "mr-sm-2 field-error form-control";

}
