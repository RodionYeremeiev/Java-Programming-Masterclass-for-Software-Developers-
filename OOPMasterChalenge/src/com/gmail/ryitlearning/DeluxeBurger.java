package com.gmail.ryitlearning;

import java.sql.SQLOutput;

public class DeluxeBurger extends BasicBurger{
    private String chips;
    private String drink;
    private int price = 20;

    public DeluxeBurger(String bread, String meat, String chips, String drink) {
        super(bread, meat);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public void addToBurger(boolean letuce, boolean tomato, boolean cheese, boolean pickles) {
        System.out.println("No additions allowed");
    }

    @Override
    public int getTottallBurgerPrice() {
        return this.price;
    }

    @Override
    public void showGrandPrice() {
        System.out.println(this.price + "$");;
    }
}
