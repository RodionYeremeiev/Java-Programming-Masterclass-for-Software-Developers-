package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {

        int value = 22;

        if (value == 1 ){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchChar = 'F';

        switch (switchChar){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E': case 'F': case 'G':
                System.out.println(switchChar +" was found");
                break;
            default:
                System.out.println("Could not find A,B,C,D,E,F or G");
                break;
        }

        String month = "JaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
