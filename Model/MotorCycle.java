package Model;

public class MotorCycle extends Vehicle{
    private String bikeType;

    public MotorCycle(String vehicleId, String companyMake, String model, double baseRentalRate, boolean isAvailable, int year, String bikeType) {
        super(vehicleId, companyMake, model, baseRentalRate, isAvailable, year);
        this.bikeType = bikeType;
    }


    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }


    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.2; //20% additional cost
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bike Type " + bikeType);
    }
}
