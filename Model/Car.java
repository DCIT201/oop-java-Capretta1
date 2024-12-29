package Model;

public class Car extends Vehicle {
    private int numSeats;

    public Car(String vehicleId, String companyMake, String model, double baseRentalRate, boolean isAvailable, int year) {
        super(vehicleId, companyMake, model, baseRentalRate, isAvailable, year);
    }

    public Car(String vehicleId, String companyMake, String model, double baseRentalRate,
               boolean isAvailable, int year, int numSeats) {
        super(vehicleId, companyMake, model, baseRentalRate, isAvailable, year);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
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
        System.out.println("Number of Seats " + numSeats);
    }
}



