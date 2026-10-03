package OOPS_inheritance_day10;

//Parent class
class Employee {
 int employeeId;
 String employeeName;
 double employeeSalary;

 Employee(int employeeId, String employeeName, double employeeSalary) {
     this.employeeId = employeeId;
     this.employeeName = employeeName;
     this.employeeSalary = employeeSalary;
 }

 void displayEmployeeDetails() {
     System.out.println("Employee ID     : " + employeeId);
     System.out.println("Employee Name   : " + employeeName);
     System.out.println("Basic Salary    : " + employeeSalary);
 }
}

//Child class 1 - Manager
class Manager extends Employee {
 double bonus;
 double totalSalary;

 Manager(int employeeId, String employeeName, double employeeSalary) {
     super(employeeId, employeeName, employeeSalary);
 }

 void calculateSalary() {
     bonus = employeeSalary * 0.20;       // 20% bonus
     totalSalary = employeeSalary + bonus;
 }

 void displayDetails() {
     displayEmployeeDetails();
     System.out.println("Designation     : Manager");
     System.out.println("Bonus           : " + bonus);
     System.out.println("Total Salary    : " + totalSalary);
     System.out.println("-------------------------------");
 }
}

//Child class 2 - Developer
class Developer extends Employee {
 double allowance;
 double totalSalary;

 Developer(int employeeId, String employeeName, double employeeSalary) {
     super(employeeId, employeeName, employeeSalary);
 }

 void calculateSalary() {
     allowance = employeeSalary * 0.15;   // 15% allowance
     totalSalary = employeeSalary + allowance;
 }

 void displayDetails() {
     displayEmployeeDetails();
     System.out.println("Designation     : Developer");
     System.out.println("Allowance       : " + allowance);
     System.out.println("Total Salary    : " + totalSalary);
     System.out.println("-------------------------------");
 }
}

//Child class 3 - Intern
class Intern extends Employee {
 double stipend;
 double totalSalary;

 Intern(int employeeId, String employeeName, double employeeSalary) {
     super(employeeId, employeeName, employeeSalary);
 }

 void calculateSalary() {
     stipend = employeeSalary * 0.10;     // 10% stipend
     totalSalary = employeeSalary + stipend;
 }

 void displayDetails() {
     displayEmployeeDetails();
     System.out.println("Designation     : Intern");
     System.out.println("Stipend         : " + stipend);
     System.out.println("Total Salary    : " + totalSalary);
     System.out.println("-------------------------------");
 }
}


public class employee_salary_program_day9 {

	public static void main(String[] args) {
		 // Manager object
        Manager manager = new Manager(101, "Arun", 60000);
        manager.calculateSalary();

        // Developer object
        Developer developer = new Developer(102, "prabakaran", 50000);
        developer.calculateSalary();

        // Intern object
        Intern intern = new Intern(103, "sanjai", 20000);
        intern.calculateSalary();

        // Display employee details
        System.out.println("===== EMPLOYEE SALARY DETAILS =====");

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }


	}


