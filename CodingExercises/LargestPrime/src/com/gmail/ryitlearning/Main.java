package com.gmail.ryitlearning;

public class Main {
    /**
     * Write a method named getLargestPrime with one parameter of type int named number.
     *
     * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
     *
     *
     * The method should calculate the largest prime factor of a given number and return it.
     *
     *
     * EXAMPLE INPUT/OUTPUT:
     *
     * * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
     *
     * * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
     *
     * * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
     *
     * * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
     *
     * * getLargestPrime (-1); should return -1 since the parameter is negative
     *
     *
     * HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
     *
     * NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
     *
     * NOTE: Do not add a main method to the solution code.
     */

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

//        System.out.println(isPrime(6));
//        System.out.println(isPrime(15));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(5));
//        System.out.println(isPrime(17));
//        System.out.println(isPrime(29));


    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int divider = 0;

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    divider = i;
                }
            }
        }
        return divider;
    }


    public static int getLargestPrimeShort(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }

    static boolean isPrime(int number) {
        // Corner case
        if (number <= 1) {
            return false;
        }
        // Check from 2 to n-1
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
