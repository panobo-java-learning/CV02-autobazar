import com.engeto.autobazar.VehicleOffer;
import com.engeto.autobazar.Vehicle;
import com.engeto.autobazar.VehicleType;

public class Main {

    private VehicleOffer vehiclesDB;
    public static void main(String[] args) {

        VehicleOffer vehiclesDB = new VehicleOffer();
        vehiclesDB.add(new Vehicle("Ford Mustang", VehicleType.CAR, 120000, false, 12.5));
        vehiclesDB.add(new Vehicle("Ford C-max", VehicleType.CAR,110000, true, 8.5));
        vehiclesDB.add(new Vehicle("Ford Mondeo", VehicleType.CAR,130000, true, 7));
        vehiclesDB.add(new Vehicle("Skoda Octavia", VehicleType.CAR,170000, true, 6.5));
        vehiclesDB.add(new Vehicle("Skoda Superb", VehicleType.CAR,220000, true, 10.0));
        vehiclesDB.add(new Vehicle("Tatra 815", VehicleType.TRUCK,2200000, true, 10.0));
        vehiclesDB.add(new Vehicle("Ford Transit", VehicleType.VAN,350000, true, 10.0));

        System.out.println("Available cars (%d cars available): ".formatted(vehiclesDB.numberOfVehicles()));
        vehiclesDB.printVehicleList();

        System.out.println("Removing index 3...");
        vehiclesDB.remove(3);

        System.out.println("Available cars (%d cars available): ".formatted(vehiclesDB.numberOfVehicles()));
        vehiclesDB.printVehicleList();

    }
}
