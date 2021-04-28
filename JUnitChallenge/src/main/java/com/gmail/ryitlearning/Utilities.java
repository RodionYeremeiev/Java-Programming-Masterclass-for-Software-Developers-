package com.gmail.ryitlearning;

public class Utilities {

    /**
     * returns a char array containing every nth char.
     * When sourceArray.length < n, returns sourceArray
     */
    public char[] everyNthChar(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    /**
     * Removes pairs of the same characters that are next to each other,
     * by removing on e occurrence of the character.
     * "ABBCDEEF" -> "ABCDEF"
     * "ABCBDEEF" -> "ABCBDEF" (the two 'B' aren't next to each other,
     * so they aren't removed.
     *
     * @param source
     * @return
     */
    public String removePairs(String source) {
        if (source.length() == 0) {
            throw new IllegalArgumentException();
        }
        if (source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length-1; i++) {
//            System.out.println(string[i]);
            if (string[i] != string[i+1]) {
                sb.append(string[i]);
            }
        }
//        System.out.println(string[string.length-1]);
        sb.append(string[string.length-1]);
        return String.valueOf(sb);
    }

    /**
     * Perform conversion on some internal business rule.
     *
     * @param a
     * @param b
     * @return
     */
    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }
        return null;
    }

}
