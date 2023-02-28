package com.engeto.autobazar;

public class Vehicle {

    private String make;
    private int price;
    private boolean isAvailable;
    private double consuption;
    private VehicleType vehicleType;

    public Vehicle(
            String make, VehicleType carType, int price,
            boolean isAvailable, double consuption
    ) {
        this.make = make;
        this.price = price;
        this.isAvailable = isAvailable;
        this.consuption = consuption;
        this.vehicleType = carType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getConsuption() {
        return consuption;
    }

    public void setConsuption(double consuption) {
        this.consuption = consuption;
    }

    @Override
    public String toString() {
        return "Vehicle{model: " + make + ", price=" + price + "}";
    }

//    public String toUserString() { return "model: %s, price=%d".formatted(make, price); }

}

