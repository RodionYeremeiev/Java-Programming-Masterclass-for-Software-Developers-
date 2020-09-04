package com.gmail.ryitlearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number");
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();

//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
        sc.close();
    }
}
