package com.gmail.ryitlearning;

public class TV {
    private String model;
    private String manufacturer;
    private int size;
    private boolean isSmart;

    public TV(String model, String manufacturer, int size, boolean isSmart) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.isSmart = isSmart;
    }

    public void turnOnTV(){
        System.out.println("The " + getManufacturer() + " model " + getModel()+" TV is ON");
        if (isSmart){
            System.out.println("Choose WiFi network");
        } else {
            System.out.println("Choose programm");
        }
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public boolean isSmart() {
        return isSmart;
    }
}
