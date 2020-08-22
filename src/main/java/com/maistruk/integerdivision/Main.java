package com.maistruk.integerdivision;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Division division = new Division();
        DivisionFormatter divisionFormatter = new DivisionFormatter();

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input divisible number: ");
            int dividend = scanner.nextInt();
            System.out.println("Input devider number: ");
            int divisor = scanner.nextInt();
            System.out.println(divisionFormatter.format(division.divide(dividend, divisor)));
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }

}
