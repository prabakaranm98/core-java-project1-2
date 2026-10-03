package javaclass;

import java.util.Scanner;

public class number_gussing_program_day6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int secretNumber = 25;
	        int guess = 0;
	        int attempts = 0;
	        int maxAttempts = 5;

	        System.out.println("Number Guessing Game");
	        System.out.println("Guess a number between 1 and 50");
	        System.out.println("You have only " + maxAttempts + " attempts.");

	        while (attempts < maxAttempts) {

	            System.out.print("Enter your guess: ");
	            guess = sc.nextInt();

	            attempts++;

	            if (guess == secretNumber) {
	                System.out.println("Congratulations! You guessed the correct number.");
	                System.out.println("You took " + attempts + " attempt(s).");
	                break;
	            } 
	            else if (guess < secretNumber) {
	                System.out.println("Too low! Try a higher number.");
	            } 
	            else {
	                System.out.println("Too high! Try a lower number.");
	            }

	            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
	        }

	        if (attempts == maxAttempts && guess != secretNumber) {
	            System.out.println("Game Over!");
	            System.out.println("The correct number was: " + secretNumber);
	        }

	        sc.close();
	    }
	}