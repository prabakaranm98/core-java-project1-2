package javaclass;

import java.util.Scanner;

public class Demiliter_day3 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Prabakaran,28,Salem");
	        String input = sc.nextLine();

	       String[] data = input.split(",//n");

	        System.out.println("Name: " + data[0]);
	        System.out.println("Age: " + data[1]);
	        System.out.println("City: " + data[2]);

	        sc.close();
		

	}

}
