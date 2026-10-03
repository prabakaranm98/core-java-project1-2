package java_day7;

import java.util.Scanner;

public class return_index_position_day7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.print("Enter the number to search: ");
	        int search = sc.nextInt();

	        int index = -1;

	        for (int i = 0; i < numbers.length; i++) {

	            if (numbers[i] == search) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Number found at index: " + index);
	        } else {
	            System.out.println("Number not found");
	        }

	        sc.close();
	    }
	}