package com.pluralsight;

public class SemiTruck extends Vehicle {
    protected String model;
    protected String truckType;
    protected String cargoType;

    public SemiTruck(String name, int numberOfPassage,
                     int cargoCapacity, int fuelCapacity,
                     String model, String truckType, String cargoType)
    {   //Inheritance from Vehicles(Generalized blue print?)
        super(name, numberOfPassage, cargoCapacity, fuelCapacity);

        this.model = model;
        this.truckType = truckType;
        this.cargoType = truckType;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }


}
