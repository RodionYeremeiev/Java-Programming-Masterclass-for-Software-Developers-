package com.gmail.ryitlearning;

public class Main {

    /**
     * Write a method with the name sumDigits that has one int parameter
     * called number.
     *
     * If parameter is >= 10 then the method should process the number
     * and return sum of all digits, otherwise return -1 to indicate
     * an invalid value.
     *
     * The numbers from 0-9 have 1 digit so we don't want to process them,
     * also we don't want to process negative numbers, so also return -1
     * for negative numbers.
     *
     * For example calling the method sumDigits(125)
     * should return 8 since 1 + 2 + 5 = 8.
     *
     * Calling the method sumDigits(1) should return -1
     * as per requirements described above.
     *
     * Add some code to the main method to test out the sumDigits method
     * to determine that it is working correctly for valid and invalid values
     * passed as arguments.
     *
     * Hint:
     * 	Use n % 10 to extract the least-significant digit.
     * 	Use n = n / 10 to discard the least-significant digit.
     * 	The method needs to be static like other methods so far
     * 	in the course.
     *
     * Tip:
     * 	Create a project with the name DigitSumChallenge.
     */

    public static void main(String[] args) {
//        System.out.println(25%10);
//        System.out.println(25/10);
//        System.out.println(2%10);
//        System.out.println(2/10);
//        System.out.println(sumDigit(5));
//        System.out.println();
//        int number = 829641;
//        int digits = 1;
//        int n = 1;
//        int sum = number%10;
//        while (number / 10 != 0) {
//            number/=10;
//            digits++;
//            System.out.println(number);
//            sum += number%10;
//            System.out.println("Sum of al digits = " + sum);
//        }
//        System.out.println("Number has " + digits + " digits");
//        System.out.println();
//        for (int i=digits;i !=0;i--){
//            n*=10;
//            System.out.println(n);
//        }
//        System.out.println(n);
//        System.out.println();
//        System.out.println(number/n);
//        System.out.println(number%n);
        System.out.println("sum = "+ mySumDigit(0));
        System.out.println("sum = "+ mySumDigit(-10));
        System.out.println("sum = "+ mySumDigit(1));
        System.out.println("sum = "+ mySumDigit(2));
        System.out.println("sum = "+ mySumDigit(3));
        System.out.println("sum = "+ mySumDigit(7));
        System.out.println("sum = "+ mySumDigit(9));
        System.out.println();
        System.out.println("sum = "+ mySumDigit(10));
        System.out.println("sum = "+ mySumDigit(1230));
        System.out.println("sum = "+ mySumDigit(89725));
    }

    public static int mySumDigit(int number) {
        if (number <= 0 || number / 10 == 0) { //condition to skip 0-9 & negative values
            return -1;
        }
        int numberToDisplay = number;
        int sum = number % 10; //
        while (number / 10 != 0) {
            number /= 10;
            sum += number % 10;
        }
        System.out.println("Sum of a digits in " + numberToDisplay + " = " + sum);
        return sum;
    }

    public static int timsSumDigit(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            //extract the lest-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;
        }
        return sum;
    }


}
