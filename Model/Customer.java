package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String customerId;
    private String fullName;
    private List<RentalTransaction> rentalHistory;
    private String driversLicense;
    private String votersID;


    public Customer() {
    }

    public Customer(String customerId, String fullName, List<RentalTransaction> rentalHistory,
                    String driversLicense, String votersID) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.rentalHistory = new ArrayList<>();
        this.driversLicense = driversLicense;
        this.votersID = votersID;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void setRentalHistory(List<RentalTransaction> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getVotersID() {
        return votersID;
    }

    public void setVotersID(String votersID) {
        this.votersID = votersID;
    }

    public void displayInfo(){
        System.out.println("Your customer ID is " + customerId);
        System.out.println("Your Name is " + fullName);
        System.out.println("Your driver's License is " + driversLicense);
        System.out.println("Your Voter,s ID is " + votersID);
    }

}
