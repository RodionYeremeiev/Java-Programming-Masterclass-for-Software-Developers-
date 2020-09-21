package com.gmail.ryitlearning;

public class HealthyAdditions extends Additions {
    private boolean onion = false;
    private boolean mustard = false;
    private int price = 0;

    public HealthyAdditions() {
    }

    public HealthyAdditions(boolean addLetuce, boolean addTomato, boolean addCheese, boolean addPickles, boolean onion, boolean mustard) {
        super(addLetuce, addTomato, addCheese, addPickles);
        this.onion = onion;
        this.mustard = mustard;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isMustard() {
        return mustard;
    }

    public void setMustard(boolean mustard) {
        this.mustard = mustard;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getAdditionsPrice() {
        int temp = super.getAdditionsPrice();
        if (this.onion){
            temp+=1;
        } if (this.mustard){
            temp+=1;
        }
        return this.price = temp;
    }

    @Override
    public void printAditionsPrice() {
        System.out.println("Healthy Additions price = " + this.price + " $");
    }
}
