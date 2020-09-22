package com.gmail.ryitlearning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Please enter " + number + " integer numbers");
        int[] integers = new int[number];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = sc.nextInt();
        }
        return integers;
    }

    public static int[] sortintegers(int[] array) {
//        int[] sortedArray = Arrays.copyOf(array,array.length);

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + (i+1) + " = " + array[i]);
        }
    }

    public static void main(String[] args) {
       int[] test =  getIntegers(5);
        printArray(test);
        System.out.println("---------------------");
        int[] test2 = sortintegers(test);
        printArray(test2);
    }
}
