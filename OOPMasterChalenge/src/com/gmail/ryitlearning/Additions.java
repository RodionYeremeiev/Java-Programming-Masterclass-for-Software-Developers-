package com.gmail.ryitlearning;

public class Additions {
    private boolean letuce = false;
    private boolean tomato = false;
    private boolean cheese = false;
    private boolean pickles = false;

    private int price = 0;

    public Additions() {
    }

    public Additions(boolean addLetuce, boolean addTomato, boolean addCheese, boolean addPickles) {
        this.price = 0;
        if (addLetuce == true) {
            this.letuce = addLetuce;
            this.price+=1;
        }
        if (addTomato == true) {
            this.tomato = addTomato;
            this.price+=1;
        }
        if (addCheese == true) {
            this.cheese = addCheese;
            this.price+=1;
        }
        if (addPickles == true) {
            this.pickles = addPickles;
            this.price+=1;
        }
    }

    public boolean isLetuce() {
        return letuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPickles() {
        return pickles;
    }

    public void setLetuce(boolean letuce) {
        this.letuce = letuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPickles(boolean pickles) {
        this.pickles = pickles;
    }

    public int getPrice() {
        return price;
    }

    public int getAdditionsPrice() {
        int temp = 0;
            if (this.letuce) {
                temp += 1;
            }
            if (this.tomato) {
                temp += 1;
            }
            if (this.cheese) {
                temp += 1;
            }
            if (this.pickles) {
                temp += 1;
            }
//        System.out.println("Additions price = " + price + " $");
        return this.price = temp;
    }

    public void printAditionsPrice(){
        System.out.println("Additions price = " + this.price + " $");
    }
}
