package com.pluralsight;

public class Moped extends Vehicle{
    protected String model;
    protected boolean isHaveStripes;
    protected String secondaryColor;


    public Moped(String name, int numberOfPassengers,
                 int cargoCapacity, int fuelCapacity, String model
            , boolean isHaveStripes, String secondaryColor) {
        super(name, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.model = model;
        this.isHaveStripes = true;
        this.secondaryColor = secondaryColor;


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHaveStripes() {
        if (isHaveStripes) {
            return Boolean.parseBoolean(secondaryColor);

        }else
            return false;
    }

    public void setHaveStripes(boolean haveStripes) {
        isHaveStripes = haveStripes;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

}

