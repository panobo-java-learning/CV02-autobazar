package com.engeto.autobazar;

import java.util.ArrayList;
import java.util.List;

public class VehicleOffer {

    private List<Vehicle> vehicleList;

    public VehicleOffer() {
        this.vehicleList = new ArrayList<>();
    }

    /*
    * Return list of all vehicles.
    * @return List<Vehicle> - list of all vehicles
    */
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void printVehicleList() {
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println("[%02d] %s".formatted(i, toUserString(vehicleList.get(i))));
        }
    }

    private String toUserString(Vehicle vehicle) {
        return "model: %s (price: %d Kc)".formatted(vehicle.getMake(), vehicle.getPrice());
    }

    public void add(Vehicle newVehicle) {
        this.vehicleList.add(newVehicle);
    }

    public void remove(int vehicleToRemoveIndex) {
        this.vehicleList.remove(vehicleToRemoveIndex);
    }

    /*
    * Return amount of all vehicles in shop.
    * @return int - the size of the vehicle list
    */
    public int numberOfVehicles() {
        return this.vehicleList.size();
    }

}
