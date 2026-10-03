package javaclass;

import java.util.Scanner;

public class EBbill_6months_day6 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        for (int month = 1; month <= 6; month++) {

	            System.out.print("Enter units consumed for Month " + month + ": ");
	            int units = sc.nextInt();

	            double bill;

	            if (units <= 100) {
	                bill = units * 1.50;
	            } 
	            else if (units <= 200) {
	                bill = (100 * 1.50) + ((units - 100) * 2.50);
	            } 
	            else if (units <= 500) {
	                bill = (100 * 1.50) + (100 * 2.50)
	                        + ((units - 200) * 4.00);
	            } 
	            else {
	                bill = (100 * 1.50) + (100 * 2.50)
	                        + (300 * 4.00)
	                        + ((units - 500) * 6.00);
	            }

	            System.out.println("Month " + month + " EB Bill = ₹" + bill);
	            System.out.println("----------------------------");
	        }

	        sc.close();
	    }
	

	}


