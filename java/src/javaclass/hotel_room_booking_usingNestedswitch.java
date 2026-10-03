package javaclass;
import java.util.Scanner;

public class hotel_room_booking_usingNestedswitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.println("===== HOTEL ROOM BOOKING =====");
	        System.out.println("1. AC Room");
	        System.out.println("2. Non-AC Room");

	        System.out.print("Enter room type: ");
	        int roomType = sc.nextInt();

	        switch (roomType) {

	            case 1:
	                System.out.println("\nYou selected AC Room");
	                System.out.println("1. 1 Day");
	                System.out.println("2. 2 Days");
	                System.out.println("3. 3 Days");

	                System.out.print("Enter number of days: ");
	                int acDays = sc.nextInt();

	                double acBill = 0;

	                switch (acDays) {

	                    case 1:
	                        acBill = 2000;
	                        break;

	                    case 2:
	                        acBill = 4000;
	                        break;

	                    case 3:
	                        acBill = 6000;
	                        break;

	                    default:
	                        System.out.println("Invalid number of days");
	                        return;
	                }

	                System.out.println("AC Room booked successfully");
	                System.out.println("Bill Amount = ₹" + acBill);
	                break;

	            case 2:
	                System.out.println("\nYou selected Non-AC Room");
	                System.out.println("1. 1 Day");
	                System.out.println("2. 2 Days");
	                System.out.println("3. 3 Days");

	                System.out.print("Enter number of days: ");
	                int nonAcDays = sc.nextInt();

	                double nonAcBill = 0;

	                switch (nonAcDays) {

	                    case 1:
	                        nonAcBill = 1200;
	                        break;

	                    case 2:
	                        nonAcBill = 2400;
	                        break;

	                    case 3:
	                        nonAcBill = 3600;
	                        break;

	                    default:
	                        System.out.println("Invalid number of days");
	                        return;
	                }

	                System.out.println("Non-AC Room booked successfully");
	                System.out.println("Bill Amount = ₹" + nonAcBill);
	                break;

	            default:
	                System.out.println("Invalid room type");
	        }

	        sc.close();
	    }
	}