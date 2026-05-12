package com.pluralsight;

public class Car extends Vehicle {
    private String model;
    private String vehicleType;
    private boolean isElectricPowered;
    private boolean isGasPowered;

    public Car (String name, int  numberOfPassage, int cargoCapacity,
                int fuelCapacity,
                String model,String vehicleType,
                boolean isGasPowered, boolean isElectricPowered) {
            super(name, numberOfPassage, cargoCapacity, fuelCapacity);
            this.model = model;
            this.vehicleType = vehicleType;
            this.isElectricPowered = true;
            this.isGasPowered = true;
    }

}
