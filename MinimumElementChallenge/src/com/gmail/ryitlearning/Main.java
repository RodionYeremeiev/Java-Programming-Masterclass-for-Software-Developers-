package com.gmail.ryitlearning;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integer numbers");
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            continue;
        }
        return min;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("input desired array length");
        int[]arrayToDisplay = readIntegers(sc.nextInt());
        for (int i = 0; i < arrayToDisplay.length ; i++) {
            System.out.println(arrayToDisplay[i]);
        }
        System.out.println();
        System.out.println("Minimum value of array is: "+findMin(arrayToDisplay));
    }
}
