package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        System.out.println();
        sumFirstAndLastDigit(257);
        System.out.println();
        sumFirstAndLastDigit(0);
        System.out.println();
        sumFirstAndLastDigit(5);
        System.out.println();
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println("invalid value");
            return -1;
        }
        System.out.println("Number = " + number);
        int lastDigit = number % 10;
        System.out.println("last digit = " + lastDigit);
        int sum = number % 10;
        while (number / 10 != 0) {
            number /= 10;
        }
        System.out.println("first digit = " + number);
        sum += number;
        System.out.println("sum of first and last digits =  " + lastDigit + "+" + number + " = " + sum);
        return sum;
    }
}
