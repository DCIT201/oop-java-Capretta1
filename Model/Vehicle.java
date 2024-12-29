package Model;

public abstract class Vehicle {
    private String vehicleId;
    private String companyMake;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private int year;

    public Vehicle(String vehicleId, String companyMake, String model, double baseRentalRate,
                   boolean isAvailable, int year) {
        this.vehicleId = vehicleId;
        this.companyMake = companyMake;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
        this.year = year;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCompanyMake() {
        return companyMake;
    }

    public void setCompanyMake(String companyMake) {
        this.companyMake = companyMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    public void displayInfo() {
        System.out.println("company make " + companyMake);
        System.out.println("Model " + model);
        System.out.println("Year: " + year);
        System.out.println("Rental Rate: " + baseRentalRate);
    }
}
