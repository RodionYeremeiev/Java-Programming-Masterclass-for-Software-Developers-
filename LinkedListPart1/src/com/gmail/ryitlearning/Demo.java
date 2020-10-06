package com.gmail.ryitlearning;

import java.util.LinkedList;
import java.util.ListIterator;

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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as an destination");
                return false;
            } else if(comparison > 0) {
                //new City should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return ;
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

        placeToVisit.add(1, "Alice Springs");
        printList(placeToVisit);

        placeToVisit.remove(4);
        printList(placeToVisit);

    }
}
