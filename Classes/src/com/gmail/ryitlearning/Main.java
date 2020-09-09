package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("porsch model is " + porsche.getModel());
        porsche.setModel("911");
        porsche.setModel("Carrera");
        System.out.println("porsch model is " + porsche.getModel());
    }
}
