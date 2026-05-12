package com.pluralsight;

public class Vehicle {
    protected String name;
    protected int numberOfPassengers;
    protected int cargoCapacity;
    protected int fuelCapacity;

    public Vehicle(String name, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.name = name;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
