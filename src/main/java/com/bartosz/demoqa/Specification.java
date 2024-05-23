package com.bartosz.demoqa;

import java.util.Random;

public class Specification {
    public static final Random RANDOM = new Random();

    public static int generateRandomNumber(int minValue, int maxValue) {
        return RANDOM.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
