package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;// 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //        result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //        result = result * 10 ;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //        result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //        result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
//        boolean isAlien = true;

//        if (isAlien == false)   System.out.println("It is not an alien!")
//        else System.out.println("Die XENOSCUM!");

        if (isAlien) {
            System.out.println("Die XENOSCUM!");
        } else {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("this is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar;
        if (wasCar) {
            System.out.println("Was car is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20;
        System.out.println("isEighteenOrOver is set to be : " + isEighteenOrOver);

//        Challenge
        double firstValue = 20.00;
        double secndValue = 80.00;

        double remainder = ((firstValue + secndValue) * 100.00) % 40.00;

        boolean isNoRemainder = remainder == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
