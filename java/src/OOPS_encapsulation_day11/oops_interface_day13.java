package OOPS_encapsulation_day11;

import java.util.Scanner;

//Interface
interface Cab {

 // Method for booking ride
 void bookRide(String customerName);

 // Method for calculating fare
 double calculateFare(double distance);
}

//Mini Cab
class MiniCab implements Cab {

 @Override
 public void bookRide(String customerName) {
     System.out.println("Mini Cab booked successfully for " + customerName);
 }

 @Override
 public double calculateFare(double distance) {
     double ratePerKm = 12;
     return distance * ratePerKm;
 }
}

//Auto Cab
class AutoCab implements Cab {

 @Override
 public void bookRide(String customerName) {
     System.out.println("Auto Cab booked successfully for " + customerName);
 }

 @Override
 public double calculateFare(double distance) {
     double ratePerKm = 10;
     return distance * ratePerKm;
 }
}

//Sedan Cab
class SedanCab implements Cab {

 @Override
 public void bookRide(String customerName) {
     System.out.println("Sedan Cab booked successfully for " + customerName);
 }

 @Override
 public double calculateFare(double distance) {
     double ratePerKm = 18;
     return distance * ratePerKm;
 }
}


public class oops_interface_day13 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        // Getting customer details
	        System.out.print("Enter Customer Name: ");
	        String customerName = sc.nextLine();

	        System.out.print("Enter Distance in KM: ");
	        double distance = sc.nextDouble();

	        System.out.println("\nChoose Cab Type:");
	        System.out.println("1. Mini Cab");
	        System.out.println("2. Auto Cab");
	        System.out.println("3. Sedan Cab");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        Cab cab;

	        // Selecting cab
	        switch (choice) {

	            case 1:
	                cab = new MiniCab();
	                break;

	            case 2:
	                cab = new AutoCab();
	                break;

	            case 3:
	                cab = new SedanCab();
	                break;

	            default:
	                System.out.println("Invalid Cab Choice");
	                sc.close();
	                return;
	        }

	        // Book ride
	        cab.bookRide(customerName);

	        // Calculate fare
	        double fare = cab.calculateFare(distance);

	        // Display details
	        System.out.println("\n----- Cab Booking Details -----");
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Distance      : " + distance + " KM");
	        System.out.println("Total Fare    : ₹" + fare);

	        sc.close();
	    }
	}