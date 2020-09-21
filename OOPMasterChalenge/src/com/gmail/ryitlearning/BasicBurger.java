package com.gmail.ryitlearning;

public class BasicBurger {
    private String bread;
    private String meat;
    //    private Additions adition;
    private int price = 4;
    private Additions basicBurgerAditions = new Additions();

    public BasicBurger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public void addToBurger(boolean letuce, boolean tomato, boolean cheese, boolean pickles) {
        this.basicBurgerAditions.setLetuce(letuce);
        this.basicBurgerAditions.setTomato(tomato);
        this.basicBurgerAditions.setCheese(cheese);
        this.basicBurgerAditions.setPickles(pickles);
    }

    public int getTottallBurgerPrice() {
        if (basicBurgerAditions == null) {
            return price;
        } else {
            return price + basicBurgerAditions.getAdditionsPrice();
        }
    }

    public void showGrandPrice() {
        System.out.println("Basic price of burger = " + price + "$");
        System.out.print("Aditions are: ");
        if (basicBurgerAditions.isLetuce()) {
            System.out.print(" letuce");
        } else {
            System.out.print("");
        }
        if (basicBurgerAditions.isTomato()) {
            System.out.print(" | ");
            System.out.print("tomato");
        } else {
            System.out.print("");
        }
        if (basicBurgerAditions.isCheese()) {
            System.out.print(" | ");
            System.out.print("cheese");
        } else {
            System.out.print("");
        }
        if (basicBurgerAditions.isPickles()) {
            System.out.print(" | ");
            System.out.print("pickles");
        } else {
            System.out.print("");
        }
        System.out.print(".");
        System.out.println();
        System.out.println("The Price of burger with aditions = " + getTottallBurgerPrice() + "$");
    }
}

