package core_java_project_1;

import java.util.Scanner;

public class Movie_ticket_booking_system {
	
	// Theatre seats: true = booked, false = available
    static boolean[][] seats = new boolean[5][5];

    static Scanner sc = new Scanner(System.in);

    // Ticket price
    static double ticketPrice = 150;

	public static void main(String[] args) {
		
		
		 int choice;

	        do {
	            System.out.println("\n===== MOVIE TICKET BOOKING SYSTEM =====");
	            System.out.println("1. Show Available Seats");
	            System.out.println("2. Book Ticket");
	            System.out.println("3. Cancel Ticket");
	            System.out.println("4. Check Weekend Pricing");
	            System.out.println("5. Discount Coupon");
	            System.out.println("6. Movie Rating");
	            System.out.println("7. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    showSeats();
	                    break;

	                case 2:
	                    bookTicket();
	                    break;

	                case 3:
	                    cancelTicket();
	                    break;

	                case 4:
	                    weekendPricing();
	                    break;

	                case 5:
	                    applyCoupon();
	                    break;

	                case 6:
	                    movieRating();
	                    break;

	                case 7:
	                    System.out.println("Thank you for using Movie Ticket Booking System!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 7);
	    }

	    // Show seat arrangement
	    static void showSeats() {

	        System.out.println("\n===== SEAT STATUS =====");

	        for (int i = 0; i < seats.length; i++) {

	            for (int j = 0; j < seats[i].length; j++) {

	                if (seats[i][j]) {
	                    System.out.print("[B] "); // Booked
	                } else {
	                    System.out.print("[A] "); // Available
	                }
	            }

	            System.out.println();
	        }

	        System.out.println("A = Available");
	        System.out.println("B = Booked");
	    }

	    // Book ticket
	    static void bookTicket() {

	        showSeats();

	        System.out.print("\nEnter row number (1-5): ");
	        int row = sc.nextInt();

	        System.out.print("Enter seat number (1-5): ");
	        int seat = sc.nextInt();

	        // Convert to array index
	        row = row - 1;
	        seat = seat - 1;

	        if (row < 0 || row >= 5 || seat < 0 || seat >= 5) {

	            System.out.println("Invalid seat number!");

	        } else if (seats[row][seat]) {

	            System.out.println("Sorry! Seat is already booked.");

	        } else {

	            seats[row][seat] = true;

	            System.out.println("Seat booked successfully!");

	            System.out.println("Basic Ticket Price: ₹" + ticketPrice);
	        }
	    }

	    // Cancel ticket
	    static void cancelTicket() {

	        System.out.print("\nEnter row number (1-5): ");
	        int row = sc.nextInt();

	        System.out.print("Enter seat number (1-5): ");
	        int seat = sc.nextInt();

	        row = row - 1;
	        seat = seat - 1;

	        if (row < 0 || row >= 5 || seat < 0 || seat >= 5) {

	            System.out.println("Invalid seat number!");

	        } else if (!seats[row][seat]) {

	            System.out.println("This seat is not booked.");

	        } else {

	            seats[row][seat] = false;

	            System.out.println("Ticket cancelled successfully!");
	        }
	    }

	    // Weekend pricing
	    static void weekendPricing() {

	        System.out.print("\nEnter day: ");
	        String day = sc.next();

	        if (day.equalsIgnoreCase("Saturday") ||
	            day.equalsIgnoreCase("Sunday")) {

	            double weekendPrice = ticketPrice + 50;

	            System.out.println("It is a weekend.");
	            System.out.println("Weekend Ticket Price: ₹" + weekendPrice);

	        } else {

	            System.out.println("It is a weekday.");
	            System.out.println("Weekday Ticket Price: ₹" + ticketPrice);
	        }
	    }

	    // Discount coupon
	    static void applyCoupon() {

	        System.out.print("\nEnter coupon code: ");
	        String coupon = sc.next();

	        double price = ticketPrice;

	        if (coupon.equalsIgnoreCase("MOVIE10")) {

	            double discount = price * 0.10;
	            double finalPrice = price - discount;

	            System.out.println("Coupon Applied: 10% Discount");
	            System.out.println("Discount Amount: ₹" + discount);
	            System.out.println("Final Price: ₹" + finalPrice);

	        } else if (coupon.equalsIgnoreCase("MOVIE20")) {

	            double discount = price * 0.20;
	            double finalPrice = price - discount;

	            System.out.println("Coupon Applied: 20% Discount");
	            System.out.println("Discount Amount: ₹" + discount);
	            System.out.println("Final Price: ₹" + finalPrice);

	        } else {

	            System.out.println("Invalid Coupon Code!");
	        }
	    }

	    // Movie rating
	    static void movieRating() {

	        System.out.print("\nEnter movie rating (1-5): ");
	        int rating = sc.nextInt();

	        if (rating >= 1 && rating <= 5) {

	            System.out.println("You rated the movie: " + rating + "/5");

	            if (rating == 5) {
	                System.out.println("Excellent Movie!");
	            } else if (rating == 4) {
	                System.out.println("Very Good Movie!");
	            } else if (rating == 3) {
	                System.out.println("Good Movie!");
	            } else if (rating == 2) {
	                System.out.println("Average Movie!");
	            } else {
	                System.out.println("Poor Movie!");
	            }

	        } else {

	            System.out.println("Invalid rating! Enter between 1 and 5.");
	        }
	    }
	}