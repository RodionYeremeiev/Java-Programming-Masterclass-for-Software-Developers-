package com.gmail.ryitlearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input 10 numbers to find their sum:");
//        boolean hasNextInt = scanner.hasNextInt();
//        if (!hasNextInt){
//            System.out.println("Invalid Number");
//        }
//        int count=1;
//        int sum = 0;
//        while (count <=10){
//            System.out.println("Enter number #"+count);
//            int numberToSum = scanner.nextInt();
//            count++;
//            sum+=numberToSum;
//        }
//        scanner.close();
//        System.out.println(sum);

        Scanner scanner1 = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

//        while (true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter #" + order + ":");

            boolean isAnInt = scanner1.hasNextInt();

            if (isAnInt){
                int number = scanner1.nextInt();
                counter++;
                sum+=number;
//                if (counter ==10){
//                    break;
//                }
            }else{
                System.out.println("Invalid Number");
            }
            scanner1.nextLine(); //handle end of line (enter key)
        }
        System.out.println("Sum = "+sum);
        scanner1.close();
    }

}
