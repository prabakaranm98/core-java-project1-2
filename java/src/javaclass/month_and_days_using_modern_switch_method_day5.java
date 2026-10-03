package javaclass;

import java.util.Scanner;

public class month_and_days_using_modern_switch_method_day5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        int days = switch (month) {
                 
        
        case 1, 3, 5, 7, 8, 10, 12 -> {
            System.out.println("This month has 31 days");
            yield 31;
        }

        case 4, 6, 9, 11 -> {
            System.out.println("This month has 30 days");
            yield 30;
        }

        case 2 -> {
            System.out.println("February has 28 days");
            yield 28;
        }

        default -> {
            System.out.println("Invalid month");
            yield 0;
        }
        };  
        

        if (days == 0) {
            System.out.println("Invalid month number");
        } else {
            System.out.println("Number of days = " + days);
        }

        sc.close();
    }


	}

	
