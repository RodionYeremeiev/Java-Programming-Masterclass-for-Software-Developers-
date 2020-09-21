package com.gmail.ryitlearning;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
//    public Mitsubishi() {
//        super("Lancer", 4);
//    }

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
//        return "Mitsubishi -> startEngine()";
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
//        return "Mitsubishi -> accelerate()";
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
//        return "Mitsubishi -> brake()";
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Volvo extends Car {
//    public Volvo() {
//        super("S90", 8);
//    }

    public Volvo(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
//        return "Volvo -> startEngine()";
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
//        return "Volvo -> accelerate()";
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
//        return "Volvo -> brake()";
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Lamborghini extends Car {
//    public Lamborghini() {
//        super("Diablo", 12);
//    }

    public Lamborghini(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
//        return "Lamborghini -> startEngine()";
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
//        return "Lamborghini -> accelerate()";
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
//        return "Lamborghini -> brake()";
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class Main {
    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generic car class.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi lancer = new Mitsubishi("Mitsubishi Lancer", 4);
        System.out.println(lancer.startEngine());
        System.out.println(lancer.accelerate());
        System.out.println(lancer.brake());

        Volvo s90 = new Volvo("Volvo S90", 8);
        System.out.println(s90.startEngine());
        System.out.println(s90.accelerate());
        System.out.println(s90.brake());

        Lamborghini diablo = new Lamborghini("Lamborghini Diablo", 12);
        System.out.println(diablo.startEngine());
        System.out.println(diablo.accelerate());
        System.out.println(diablo.brake());
    }
}
