package com.gmail.ryitlearning;

import java.util.Arrays;

public class Main {
    /**
     Write a method called reverse() with an int array as a parameter.

     The method should not return any value. In other words, the method is allowed to modify the array parameter.

     To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

     For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].

     The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

     and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

     TIP: When swapping the elements, use a variable to temporarily hold the current element.

     NOTE: The method should be defined as private static.

     NOTE: Do not add a main method to the solution code.     */
    private static void reverse(int[] array) {
        if (array.length <= 1) {
            System.out.println("Array should have at least 2 elements");
        } else {
            System.out.println("Array = " + Arrays.toString(array));
            int temp;
            int maxIndex = array.length - 1;
            int halfLength = array.length / 2;
            for (int i = 0; i < halfLength; i++) {
                temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
            }
            System.out.println("Reversed array = " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        // write your code here
        int[] unEvenArray = {1,2,3,4,5};
        int[] emptyArray = new int[0];
        int[] evenArray = {1,2,3,4,5,6};

        reverse(unEvenArray);
        reverse(emptyArray);
        reverse(evenArray);
    }
}
