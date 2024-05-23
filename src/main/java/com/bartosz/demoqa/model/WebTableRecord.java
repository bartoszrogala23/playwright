package com.bartosz.demoqa.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WebTableRecord {
    String firstName;
    String lastName;
    String email;
    String age;
    String salary;
    String department;
}
