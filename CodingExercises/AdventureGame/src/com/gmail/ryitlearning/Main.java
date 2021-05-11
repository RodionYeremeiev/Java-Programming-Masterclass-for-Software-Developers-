package com.gmail.ryitlearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private  Map<Integer, Location> locations = new HashMap<>();
    private Map<String, String> vocabulary = new HashMap<>();

//    public Main() {
//        vocabulary.put("QUIT", "Q");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("WEST", "W");
//        vocabulary.put("EAST", "E");
//    }

    public static void main(String[] args) {
        Main main = new Main();

        main.locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        main.locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        main.locations.put(2, new Location(2, "You are at the top of a hill"));
        main.locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        main.locations.put(4, new Location(4, "You are in a valley beside a stream"));
        main.locations.put(5, new Location(5, "You are in the forest"));

        main.locations.get(1).addExit("W", 2);
        main.locations.get(1).addExit("E", 3);
        main.locations.get(1).addExit("S", 4);
        main.locations.get(1).addExit("N", 5);

        main.locations.get(2).addExit("N", 5);

        main.locations.get(3).addExit("W", 1);

        main.locations.get(4).addExit("N", 1);
        main.locations.get(4).addExit("W", 2);

        main.locations.get(5).addExit("S", 1);
        main.locations.get(5).addExit("W", 2);

        main.comand();
    }

    public void comand() {
        Scanner scanner = new Scanner(System.in);

        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }        }

    }
}
