package com.gmail.ryitlearning;

import java.util.Arrays;

public class Main {

    public static void reverse(int[] array) {
        System.out.print("Original ");
        printArray(array);
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.print("Reversed ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.print("array: [");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + "; ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void main(String[] args) {
        int[] arrayToReverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arrayToReverse));
        reverse(arrayToReverse);
        System.out.println("Reversed array: " + Arrays.toString(arrayToReverse));
        int n = 5 / 2;
        System.out.println(n);
    }
}
