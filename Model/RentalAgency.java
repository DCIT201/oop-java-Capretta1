package Model;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet;

    public RentalAgency(List<Vehicle> vehicleFleet) {
        this.vehicleFleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {

        vehicleFleet.add(vehicle);
    }
    public List<Vehicle> getVehicleFleet() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailable()){
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }
}
