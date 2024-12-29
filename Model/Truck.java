package Model;

public class Truck extends Vehicle {
    private String loadCapacity;

    public Truck(String vehicleId, String companyMake, String model, double baseRentalRate,
                 boolean isAvailable, int year, String loadCapacity) {
        super(vehicleId, companyMake, model, baseRentalRate, isAvailable, year);
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.9; //10% discount
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity " + loadCapacity);
    }
}
