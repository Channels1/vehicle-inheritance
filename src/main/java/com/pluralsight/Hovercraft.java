package com.pluralsight;

public class Hovercraft extends Vehicle{
    private String model;
    private String size;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Hovercraft(String name, int numberOfCapacity,
                      int cargoCapacity, int fuelCapacity,
                      String model, String size) {
        super(name, numberOfCapacity, cargoCapacity,fuelCapacity);
        this.model = model;
        this.size = size;

    }
}


