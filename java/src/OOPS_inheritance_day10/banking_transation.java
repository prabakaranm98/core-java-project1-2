package OOPS_inheritance_day10;

import java.util.Scanner;

	// Parent class
	class BankAccount {

	    String accountHolderName;
	    double balance;
	    double amount;

	    // Constructor
	    BankAccount(String accountHolderName, double balance, double amount) {
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	        this.amount = amount;
	    }
	}

	// Child class
	class BankTransaction extends BankAccount {

	    int atmPin;
	    int enteredPin;

	    // Constructor
	    BankTransaction(String accountHolderName, double balance,
	                    double amount, int atmPin) {

	        super(accountHolderName, balance, amount);
	        this.atmPin = atmPin;
	    }

	    // PIN checking method
	    void checkPin() {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter ATM PIN: ");
	        enteredPin = sc.nextInt();

	        if (enteredPin == atmPin) {
	            System.out.println("PIN is correct");
	            transactionMenu();
	        } else {
	            System.out.println("Access Denied - Wrong PIN");
	        }
	    }

	    // Transaction menu
	    void transactionMenu() {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("\n----- Banking Transaction -----");
	        System.out.println("Account Holder : " + accountHolderName);
	        System.out.println("Current Balance: " + balance);

	        System.out.println("\n1. Deposit");
	        System.out.println("2. Withdraw");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.print("Enter deposit amount: ");
	            amount = sc.nextDouble();

	            balance = balance + amount;

	            System.out.println("Deposit successful");
	            System.out.println("Deposited Amount: " + amount);
	            System.out.println("Updated Balance: " + balance);

	        } else if (choice == 2) {
	            System.out.print("Enter withdrawal amount: ");
	            amount = sc.nextDouble();

	            if (amount <= balance) {
	                balance = balance - amount;

	                System.out.println("Withdrawal successful");
	                System.out.println("Withdrawn Amount: " + amount);
	                System.out.println("Remaining Balance: " + balance);
	            } else {
	                System.out.println("Insufficient Balance");
	            }

	        } else {
	            System.out.println("Invalid Choice");
	        }
	    }
	}

	// Main class
	
	public class banking_transation {

	    public static void main(String[] args) {

	        // Creating child class object
	        BankTransaction obj = new BankTransaction(
	                "Prabakaran",
	                10000,
	                0,
	                1234
	        );

	        // Calling transaction
	        obj.checkPin();
	       
	    }
	}
	   
	    

