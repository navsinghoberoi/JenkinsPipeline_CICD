package com.example.calculator;

public class AddNumbers {

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of entered numbers => " + sum);
        return sum;
    }

}
