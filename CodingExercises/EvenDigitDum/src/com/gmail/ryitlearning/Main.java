package com.gmail.ryitlearning;

public class Main {
    /**
     * Write a method named getEvenDigitSum with one parameter of type int called number.
     *
     * The method should return the sum of the even digits within the number.
     *
     * If the number is negative, the method should return -1 to indicate an invalid value.
     *
     *
     * EXAMPLE INPUT/OUTPUT:
     *
     * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
     *
     * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
     *
     * * getEvenDigitSum(-22); → should return -1 since the number is negative
     *
     *
     * NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
     *
     * NOTE: Do not add a main method to the solution code.
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println(isEven(0));
        System.out.println(isEven(4));
        System.out.println(isEven(-8));
        System.out.println(isEven(-5));
        System.out.println(isEven(3));
        System.out.println("---------------------");
        System.out.println(getEvenDigitSum(123456789));
        System.out.println("---------------------");
        System.out.println(getEvenDigitSum(252));
        System.out.println("---------------------");
        System.out.println(getEvenDigitSum(-22));
        System.out.println("---------------------");
        System.out.println(getEvenDigitSum(0));

    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
//            if (isEven(digit)) {
            if (digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("sum of even digits of " + originalNumber + " = " + sum);
        return sum;
    }

    public static boolean isEven(int number){
        if (number <0){
//            System.out.println("Invalid input");
            return false;
        }
        if (number%2 ==0){
//            System.out.println("Number is even");
            return true;
        }
//        System.out.println("Number is not even");
        return false;
    }
}
