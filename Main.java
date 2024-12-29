import Model.*;
import Service.RentalService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creating A Scanner Object to get user Input
        Scanner in = new Scanner(System.in);

        // Creating Object class for Rental Service
        RentalService rs = new RentalService();
        Car car1 = new Car("203", "Toyota", "Supra", 324, true, 2024, 4);
        MotorCycle mc = new MotorCycle("112", "Honda", "CXR", 120, true, 2024, "CXR");
        Truck tr = new Truck("120", "F150", "Ford", 234, true, 2001, "200kg");

        rs.addVehicle(car1);
        rs.addVehicle(mc);
        rs.addVehicle(tr);


//        System.out.println();
//        System.out.println("===== Welcome To Vehicle Rental System =====");
//        System.out.println("TO PROCEED");
//        System.out.println("PLEASE PROVIDE YOUR DETAILS");
//        //calling the method customer Details from rental Service to take customer details
//        rs.customerDetails();


        System.out.println("Enter your choice to proceed now");
        System.out.println("===== Welcome To Vehicle Rental System =====");
        System.out.println("1. Rent a Vehicle");
        System.out.println("2. Display Rental Information");
        System.out.println("3. Exit");
        System.out.println();
        byte choice = in.nextByte();
        in.nextLine();

        switch (choice) {
            case 1: {
                //Rent a vehicle
                System.out.print("Enter the vehicle make: ");
                String make = in.nextLine();
                System.out.print("Enter the vehicle model: ");
                String model = in.nextLine();

                Vehicle selectedVehicle = null;

                //Checks the vehicles in available vehicles
                for (Vehicle v : rs.getAvailableVehicles()) {
                    if (v.getCompanyMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                        selectedVehicle = v;
                    }

                }


                if (selectedVehicle != null) {
                    //Add the vehicle to rented vehicles

                    rs.rentVehicle(selectedVehicle);

                    //Calculate total rental cost
                    System.out.print("Enter the rental duration in days: ");
                    int rentalDuration = in.nextInt();
                    if (selectedVehicle.equals(car1.getCompanyMake()) & selectedVehicle.equals(car1.getModel())) {
                        rentalDuration = (int) car1.calculateRentalCost(rentalDuration);
                    } else if (selectedVehicle.equals(mc.getCompanyMake()) & selectedVehicle.equals(mc.getModel())) {
                        rentalDuration = (int) mc.calculateRentalCost(rentalDuration);

                    } else {
                        rentalDuration = (int) tr.calculateRentalCost(rentalDuration);

                    }
                    System.out.println("Successfully rented.");
                    System.out.println("Total rental Cost: " + " $" + rentalDuration);

                } else {
                    System.out.println("Matching vehicle is not available for rent.");
                    System.out.println("Choose from the following vehicles");
                    rs.displayAvailableVehicles();
                }
            }



            break;


            case 2: {

                //Display Rental Information
                rs.rented();
            }
            break;


        }


//
    }
}






