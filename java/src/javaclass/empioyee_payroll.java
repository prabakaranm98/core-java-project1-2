package javaclass;
import java.util.Scanner;

class Employee {

    String employeeId;
    String employeeName;
    String department;
    String designation;
    int experience;

    double basicSalary;
    double increment;
    double bonus;
    double basePay;
    double hra;
    double pf;
    double grossPay;
    double netPay;

    Employee(String employeeId, String employeeName,
             String department, String designation,
             int experience, double basicSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.experience = experience;
        this.basicSalary = basicSalary;
    }

    // 1st CONDITION
    // Increment based on Department + Experience
    void calculateIncrement() {

        if (department.equalsIgnoreCase("IT")) {

            if (experience <= 2) {
                increment = basicSalary * 5 / 100;
            }
            else if (experience <= 5) {
                increment = basicSalary * 10 / 100;
            }
            else {
                increment = basicSalary * 15 / 100;
            }
        }

        else if (department.equalsIgnoreCase("HR")) {

            if (experience <= 2) {
                increment = basicSalary * 4 / 100;
            }
            else if (experience <= 5) {
                increment = basicSalary * 8 / 100;
            }
            else {
                increment = basicSalary * 12 / 100;
            }
        }

        else if (department.equalsIgnoreCase("Finance")) {

            if (experience <= 2) {
                increment = basicSalary * 3 / 100;
            }
            else if (experience <= 5) {
                increment = basicSalary * 7 / 100;
            }
            else {
                increment = basicSalary * 10 / 100;
            }
        }

        else {
            increment = basicSalary * 3 / 100;
        }
    }


    // 2nd CONDITION
    // Bonus based on Designation + Department
    void calculateBonus() {

        if (department.equalsIgnoreCase("IT")
                && designation.equalsIgnoreCase("Java Developer")) {

            bonus = basicSalary * 10 / 100;
        }

        else if (department.equalsIgnoreCase("IT")
                && designation.equalsIgnoreCase("Senior Developer")) {

            bonus = basicSalary * 15 / 100;
        }

        else if (department.equalsIgnoreCase("HR")
                && designation.equalsIgnoreCase("HR Manager")) {

            bonus = basicSalary * 10 / 100;
        }

        else if (department.equalsIgnoreCase("Finance")
                && designation.equalsIgnoreCase("Finance Manager")) {

            bonus = basicSalary * 12 / 100;
        }

        else {
            bonus = basicSalary * 5 / 100;
        }
    }


    // Salary calculation
    void calculateSalary() {

        calculateIncrement();
        calculateBonus();

        // Base Pay after increment
        basePay = basicSalary + increment;

        // HRA = 20% of Base Pay
        hra = basePay * 20 / 100;

        // PF = 12% of Base Pay
        pf = basePay * 12 / 100;

        // Gross Pay
        grossPay = basePay + hra + bonus;

        // Net Pay
        netPay = grossPay - pf;
    }


    // Display details
    void displayDetails() {

        System.out.println("\n======================================");
        System.out.println("         EMPLOYEE DETAILS");
        System.out.println("======================================");

        System.out.println("Employee ID         : " + employeeId);
        System.out.println("Employee Name       : " + employeeName);
        System.out.println("Department          : " + department);
        System.out.println("Designation         : " + designation);
        System.out.println("Experience          : " + experience + " years");

        System.out.println("\n---------- SALARY DETAILS ----------");

        System.out.println("Basic Salary        : ₹" + basicSalary);
        System.out.println("Increment           : ₹" + increment);
        System.out.println("Bonus               : ₹" + bonus);
        System.out.println("Base Pay            : ₹" + basePay);
        System.out.println("HRA                 : ₹" + hra);
        System.out.println("PF                  : ₹" + pf);
        System.out.println("Gross Pay           : ₹" + grossPay);
        System.out.println("Net Pay             : ₹" + netPay);

        System.out.println("======================================");
        System.out.println("         TOTAL OUTCOME");
        System.out.println("======================================");
        System.out.println("Total Earnings      : ₹" + grossPay);
        System.out.println("Total Deduction     : ₹" + pf);
        System.out.println("Final Net Pay       : ₹" + netPay);
        System.out.println("======================================");
    }
}


public class empioyee_payroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();


        Employee emp = new Employee(
                id,
                name,
                department,
                designation,
                experience,
                salary
        );


        emp.calculateSalary();

        emp.displayDetails();

        sc.close();
    }
}
