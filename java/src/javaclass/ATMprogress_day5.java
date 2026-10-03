package javaclass;

import java.util.Scanner;

public class ATMprogress_day5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Deposit");
        System.out.println("2. Balance Checking");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Amount deposited successfully");
                    System.out.println("Updated balance = " + balance);
                } else {
                    System.out.println("Invalid deposit amount");
                }
                break;

            case 2:
                System.out.println("Your current balance = " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw > 0 && withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining balance = " + balance);
                } else if (withdraw > balance) {
                    System.out.println("Insufficient balance");
                } else {
                    System.out.println("Invalid withdrawal amount");
                }
                break;

            case 4:
                System.out.println("Thank you for using the ATM");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}