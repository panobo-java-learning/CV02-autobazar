import com.engeto.autobazar.VehicleOffer;
import com.engeto.autobazar.Vehicle;

public class Main {

    private VehicleOffer vehiclesDB;
    public static void main(String[] args) {

        VehicleOffer vehiclesDB = new VehicleOffer();
        vehiclesDB.add(new Vehicle("Ford Mustang", 120000, false, 12.5));
        vehiclesDB.add(new Vehicle("Ford C-max", 110000, true, 8.5));
        vehiclesDB.add(new Vehicle("Ford Mondeo", 130000, true, 7));
        vehiclesDB.add(new Vehicle("Skoda Octavia", 170000, true, 6.5));
        vehiclesDB.add(new Vehicle("Skoda Superb", 220000, true, 10.0));

        System.out.println("Available cars (%d cars available): ".formatted(vehiclesDB.numberOfVehicles()));
        vehiclesDB.printVehicleList();

        System.out.println("Removing index 3...");
        vehiclesDB.remove(3);

        System.out.println("Available cars (%d cars available): ".formatted(vehiclesDB.numberOfVehicles()));
        vehiclesDB.printVehicleList();

    }
}
