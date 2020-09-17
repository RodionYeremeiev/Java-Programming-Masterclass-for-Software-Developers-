package com.gmail.ryitlearning;

public class Couch {
    private String color;
    private String material;
    private String size;
    private boolean isTransformer;

    public Couch(String color, String material, String size, boolean isTransformer) {
        this.color = color;
        this.material = material;
        this.size = size;
        this.isTransformer = isTransformer;
    }

    public void transform(){
        if (isTransformer){
            System.out.println("The couch ");
        }
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public boolean isTransformer() {
        return isTransformer;
    }
}
