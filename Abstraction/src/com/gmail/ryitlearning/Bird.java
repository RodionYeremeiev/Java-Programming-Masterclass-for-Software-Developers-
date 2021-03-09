package com.gmail.ryitlearning;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breathing in, breathing out, repeat");
    }

    public void fly(){
        System.out.println(getName() + " is flapping it's wings");
    }
}
