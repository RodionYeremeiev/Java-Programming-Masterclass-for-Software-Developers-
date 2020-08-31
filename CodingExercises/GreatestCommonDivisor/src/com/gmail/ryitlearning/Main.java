package com.gmail.ryitlearning;

public class Main {
    /**
     * Write a method named getGreatestCommonDivisor with two parameters of type int
     * named first and second.
     *
     * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
     *
     * The method should return the greatest common divisor of the two numbers (int).
     *
     * The greatest common divisor is the largest positive integer
     * that can fully divide each of the integers (i.e. without leaving a remainder).
     *
     *
     * For example 12 and 30:
     *
     * 12 can be divided by 1, 2, 3, 4, 6, 12
     *
     * 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
     *
     * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
     * and there is no resulting remainder.
     *
     *
     * EXAMPLE INPUT/OUTPUT:
     *
     * * getGreatestCommonDivisor(25, 15); should return 5
     * since both can be divided by 5 without a remainder
     *
     * * getGreatestCommonDivisor(12, 30); should return 6
     * since both can be divided by 6 without a remainder
     *
     * * getGreatestCommonDivisor(9, 18); should return -1
     * since the first parameter is < 10
     *
     * * getGreatestCommonDivisor(81, 153); should return 9
     * since both can be divided by 9 without a remainder
     *
     *
     * HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
     *
     * HINT: Find the minimum of the two numbers.
     *
     *
     * NOTE: The method getGreatestCommonDivisor should be defined as public static
     * like we have been doing so far in the course.
     *
     * NOTE: Do not add a main method to the solution code.
     */

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println("--------------------------------");
        System.out.println(getGreatestDivisor(25,15));
        System.out.println(getGreatestDivisor(12,30));
        System.out.println(getGreatestDivisor(9,18));
        System.out.println(getGreatestDivisor(81,153));


    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int minimum;
        int count = 1;
        int divider = 1;
        if (first <= second) {
            minimum = first;
        } else {
            minimum = second;
        }
        while (count <= minimum) {
            if (first % count == 0 && second % count == 0) {
                divider = count;
            }
            count++;
        }
        return divider;
    }

    public static int getGreatestDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divider;

        if (first < second) {
            divider = first;
        } else {
            divider = second;
        }

        while (first % divider != 0 || second % divider != 0) {
            divider--;
        }
        return divider;
    }
}
