package com.gmail.ryitlearning;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        System.out.println("-------------");

        Bird parrot = new Parrot("Twitie");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println("-------------");

        Penguin penguin = new Penguin("Chilly-Willi");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
