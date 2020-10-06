package com.gmail.ryitlearning;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
//    public static void printList(LinkedList linkedList) {
//        System.out.println("-----------------------");
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println((i+1) + ". " + linkedList.get(i));
//        }
//        System.out.println("-----------------------");
//    }

    public static void printList(LinkedList<String> linkedList) {
        for (String s : linkedList) {
            System.out.println("Now visiting - " + s + ";");
        }
        System.out.println("-----------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as an destination");
                return false;
            } else if (comparison > 0) {
                //new City should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Vacation is over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");
        printList(placeToVisit);


        LinkedList<String> sortedPlaceToVisit = new LinkedList<>();
        addInOrder(sortedPlaceToVisit, "Sydney");
        addInOrder(sortedPlaceToVisit, "Melbourne");
        addInOrder(sortedPlaceToVisit, "Brisbane");
        addInOrder(sortedPlaceToVisit, "Perth");
        addInOrder(sortedPlaceToVisit, "Canberra");
        addInOrder(sortedPlaceToVisit, "Adelaide");
        addInOrder(sortedPlaceToVisit, "Darwin");
        printList(sortedPlaceToVisit);

        addInOrder(sortedPlaceToVisit, "Alice Springs");
        addInOrder(sortedPlaceToVisit, "Darwin");
        printList(sortedPlaceToVisit);

        visit(sortedPlaceToVisit);

//        placeToVisit.add(1, "Alice Springs");
//        printList(placeToVisit);
//
//        placeToVisit.remove(4);
//        printList(placeToVisit);
    }
}
