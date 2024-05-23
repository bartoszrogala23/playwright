package com.bartosz.demoqa;

import com.bartosz.demoqa.model.WebTableRecord;
import com.github.javafaker.Faker;

import java.util.Random;

import static java.lang.String.valueOf;

public class Specification {
    public static final Random RANDOM = new Random();
    private static final Faker FAKER = new Faker();

    public static int generateRandomNumber(int minValue, int maxValue) {
        return RANDOM.nextInt((maxValue - minValue) + 1) + minValue;
    }

    public static WebTableRecord createRandomRecord() {
        String firstName = FAKER.name().firstName();
        String lastName = FAKER.name().lastName();

        return WebTableRecord.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(String.format(firstName + "." + lastName + "@example.com"))
                .age(valueOf(generateRandomNumber(18, 42)))
                .salary(valueOf(generateRandomNumber(2000, 8000)))
                .department(FAKER.lordOfTheRings().location() + " Department")
                .build();
    }
}
