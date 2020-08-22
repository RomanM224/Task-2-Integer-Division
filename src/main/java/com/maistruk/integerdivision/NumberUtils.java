package com.maistruk.integerdivision;

public class NumberUtils {

    public static int countDigits(int number) {
        int digitsAmount = 0;
        do {
            number = number / 10;
            digitsAmount++;
        } while (number != 0);
        return digitsAmount;
    }

    public static int[] splitToDigits(int number) {
        int digits[] = new int[countDigits(number)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }
}
