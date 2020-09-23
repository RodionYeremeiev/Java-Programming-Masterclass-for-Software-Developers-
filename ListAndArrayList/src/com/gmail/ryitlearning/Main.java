package com.gmail.ryitlearning;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void printArray(int[] array) {
        System.out.print("array: [");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + "; ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = sc.nextInt();
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter 10 integers");
        getInput();
        System.out.print("original ");
        printArray(baseData);
        resizeArray();
        System.out.print("resized ");
        printArray(baseData);
        baseData[baseData.length-1] = 34;
        baseData[baseData.length-2] = 67;
        System.out.print("added elements to resized ");
        printArray(baseData);

    }
}
