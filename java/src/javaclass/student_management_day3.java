package javaclass;

import java.util.Scanner;

class Student {

    String studentName;
    String studentId;

    int mark1;
    int mark2;
    int mark3;
    int mark4;
    int mark5;

    int total;
    double average;
	private String grade;

    // Constructor
    Student(String studentName, String studentId,  String grade,
            int mark1, int mark2, int mark3, int mark4, int mark5) {

        this.studentName = studentName;
        this.studentId = studentId;
        this.grade = grade;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
    }

    // Calculate total and average
    void calculateResult() {

        total = mark1 + mark2 + mark3 + mark4 + mark5;

        average = total / 5.0;

        if (average > 90) {
            grade = "O Grade";
        }
        else if (average > 75 && average < 90) {
            grade = "A Grade";
        }
        else if (average > 50 && average < 75) {
            grade = "B Grade";
        }
        else if (average > 35) {
            grade = "Pass";
        }
        else {
            grade = "Fail";
        }
    }
    

    // Display student details
    void displayDetails() {

    	System.out.println("\n====================================");
        System.out.println("        STUDENT DETAILS");
        System.out.println("====================================");

        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);

        System.out.println("\n---------- MARK DETAILS ----------");

        System.out.println("Mark 1       : " + mark1);
        System.out.println("Mark 2       : " + mark2);
        System.out.println("Mark 3       : " + mark3);
        System.out.println("Mark 4       : " + mark4);
        System.out.println("Mark 5       : " + mark5);

        System.out.println("\nTotal        : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);

        System.out.println("====================================");
    }
}


public class student_management_day3 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("====================================");
	        System.out.println("      STUDENT MANAGEMENT SYSTEM");
	        System.out.println("====================================");

	        System.out.print("Enter Student Name:");
	        String name = sc.nextLine();

	        System.out.print("Enter Student ID: ");
	        String id = sc.nextLine();
	        
	        System.out.print("Enter grade :");
	        String grade = sc.nextLine();

	        System.out.print("Enter Mark 1:");
	        int mark1 = sc.nextInt();

	        System.out.print("Enter Mark 2: ");
	        int mark2 = sc.nextInt();

	        System.out.print("Enter Mark 3: ");
	        int mark3 = sc.nextInt();

	        System.out.print("Enter Mark 4: ");
	        int mark4 = sc.nextInt();

	        System.out.print("Enter Mark 5: ");
	        int mark5 = sc.nextInt();

	        // Create Student object
	        Student student = new Student(
	                name, id, grade,
	                mark1, mark2, mark3, mark4, mark5
	        );

	        // Calculate result
	        student.calculateResult();

	        // Display complete details
	        student.displayDetails();

	       sc.close();
	}

}
