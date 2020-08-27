package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("--------------------------");
//
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//        System.out.println("--------------------------");
//
//        for (int i=6;i!=6;i++){
//            System.out.println("Count value is " + count);
//        }
//        System.out.println("--------------------------");
//
//
////        count = 1;
////        while(true){
////            if (count ==6){
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
////        }
//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//            if (count > 100){
//                break;
//            }
//        } while (count != 6);
//        System.out.println(isEvenNumber(4));
//        System.out.println(isEvenNumber(56));
//        System.out.println(isEvenNumber(13));
//        System.out.println(isEvenNumber(0));
//        System.out.println(isEvenNumber(-888));

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even number " + number);
            if (evenNumbersFound == 5){
                break;
            }
        }
        System.out.println("Total even numbers found " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
//        if (number <= 0) {
//            return false;
//        }
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
