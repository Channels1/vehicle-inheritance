package com.pluralsight;

public class Car extends Vehicle {
    private String model;
    private String vehicleType;
    private boolean isElectricPowered;
    private boolean isGasPowered;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isElectricPowered() {
        return isElectricPowered;
    }

    public void setElectricPowered(boolean electricPowered) {
        isElectricPowered = electricPowered;
    }

    public boolean isGasPowered() {
        return isGasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        isGasPowered = gasPowered;
    }

    public Car (String name, int  numberOfPassage, int cargoCapacity,
                int fuelCapacity,
                String model, String vehicleType,
                boolean isGasPowered, boolean isElectricPowered) {
            super(name, numberOfPassage, cargoCapacity, fuelCapacity);

            this.model = model;
            this.vehicleType = vehicleType;
            this.isElectricPowered = true;
            this.isGasPowered = true;


    }

}
