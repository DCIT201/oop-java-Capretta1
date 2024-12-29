package Service;

import Model.Customer;
import Model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalService {
   private List<Vehicle> availableVehicles;
   private List<Vehicle> rentedVehicles;
   private List<Customer> customers;

    public RentalService() {
        this.availableVehicles = new ArrayList<>();
        this.rentedVehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {

        availableVehicles.add(vehicle);
    }

    public void addCustomers(Customer customer){
        customers.add(customer);
    }

    public void rentedVehicles(Vehicle vehicle){
        rentedVehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles(){
        return availableVehicles;
    }

    public List<Vehicle> getRentedVehicles(Vehicle vehicle){

        return rentedVehicles;
    }

    //rent a vehicle
    public void rentVehicle(Vehicle vehicle){
        if (availableVehicles.contains(vehicle)){
            availableVehicles.remove(vehicle);
            rentedVehicles.add(vehicle);
            for (Vehicle rv : rentedVehicles){
                rv.displayInfo();
                System.out.println();
            }
        }
    }

    //display Available Vehicles
    public void displayAvailableVehicles(){
        System.out.println("Available Vehicles");
        for (Vehicle av : availableVehicles){
            boolean vh = av.isAvailable();
            if (vh){
                av.displayInfo();
                System.out.println();
            }


        }


    }

    //display rented vehicles
    public void displayRentedVehicles(){
        System.out.println("Rented Vehicles");
        for (Vehicle rv : rentedVehicles){
            rv.displayInfo();
            System.out.println();
        }

    }

    // Taking Customer details
    public void customerDetails(){
        Scanner in = new Scanner(System.in);
        Customer cs = new Customer();
        Customer customer = new Customer();
        String customerID = String.valueOf(Math.round(Float.parseFloat(String.valueOf(Math.random() * 100000))));
        customer.setCustomerId(customerID);
        System.out.println("Enter your full Name");
        String fullName = in.nextLine();
        customer.setFullName(fullName);
        System.out.println("Enter your voter's ID");
        String votersID = in.nextLine();
        customer.setVotersID(votersID);
        System.out.println("Enter your drivers License");
        String driversLicense = in.nextLine();
        customer.setDriversLicense(driversLicense);
        customer.displayInfo();
        in.close();
        }

    //Display Rented Vehicles
        public void rented(){
            System.out.println("Rented Vehicles");
            for (Vehicle av : availableVehicles){
                boolean vh = av.isAvailable();
                if (!vh){
                    av.displayInfo();
                }

                }
                }

                }









