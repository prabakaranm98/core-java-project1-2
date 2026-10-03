package core_java_project_2;

import java.util.Scanner;
public class student_management_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        studentservice service = new studentservice();
        studentfilesservice fileService = new studentfilesservice();

        // Load existing students when program starts
        service.setStudents(fileService.loadStudents());

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Student ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Marks");
            System.out.println("6. Update Attendance");
            System.out.println("7. Calculate Grade");
            System.out.println("8. Remove Student");
            System.out.println("9. Display Topper");
            System.out.println("10. Save Students");
            System.out.println("11. Exit");

            System.out.print("\nEnter your choice: ");

            try {

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:

                        try {

                            System.out.print("Enter Student ID: ");
                            int id = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Student Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Email: ");
                            String email = sc.nextLine();

                            System.out.print("Enter Marks: ");
                            double marks =
                                    Double.parseDouble(sc.nextLine());

                            System.out.print("Enter Attendance: ");
                            int attendance =
                                    Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Course ID: ");
                            int courseId =
                                    Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Course Name: ");
                            String courseName = sc.nextLine();

                            System.out.println(
                                    "1. ACTIVE");
                            System.out.println(
                                    "2. INACTIVE");
                            System.out.println(
                                    "3. COMPLETED");

                            System.out.print("Select Status: ");
                            int statusChoice =
                                    Integer.parseInt(sc.nextLine());

                            student_status status;

                            switch (statusChoice) {

                                case 1:
                                    status = student_status.ACTIVE;
                                    break;

                                case 2:
                                    status = student_status.INACTIVE;
                                    break;

                                case 3:
                                    status = student_status.COMPLETED;
                                    break;

                                default:
                                    throw new IllegalArgumentException(
                                            "Invalid status.");
                            }

                            course course =
                                    new course(courseId, courseName);

                            student student =
                                    new student(
                                            id,
                                            name,
                                            email,
                                            marks,
                                            attendance,
                                            status,
                                            course
                                    );

                            service.addStudent(student);

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 2:

                        service.displayAllStudents();

                        break;

                    case 3:

                        try {

                            System.out.print("Enter Student ID: ");
                            int id =
                                    Integer.parseInt(sc.nextLine());

                            student student =
                                    service.searchById(id);

                            student.displayDetails();

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 4:

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        service.searchByName(name);

                        break;

                    case 5:

                        try {

                            System.out.print("Enter Student ID: ");
                            int id =
                                    Integer.parseInt(sc.nextLine());

                            System.out.print("Enter New Marks: ");
                            double marks =
                                    Double.parseDouble(sc.nextLine());

                            service.updateMarks(id, marks);

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 6:

                        try {

                            System.out.print("Enter Student ID: ");
                            int id =
                                    Integer.parseInt(sc.nextLine());

                            System.out.print(
                                    "Enter New Attendance: ");

                            int attendance =
                                    Integer.parseInt(sc.nextLine());

                            service.updateAttendance(
                                    id, attendance);

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 7:

                        try {

                            System.out.print("Enter Student ID: ");
                            int id =
                                    Integer.parseInt(sc.nextLine());

                            student student =
                                    service.searchById(id);

                            System.out.println(
                                    "Student Name: "
                                            + student.getName());

                            System.out.println(
                                    "Marks: "
                                            + student.getMarks());

                            System.out.println(
                                    "Grade: "
                                            + student.calculateGrade());

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 8:

                        try {

                            System.out.print("Enter Student ID: ");
                            int id =
                                    Integer.parseInt(sc.nextLine());

                            service.removeStudent(id);

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 9:

                        service.displayTopper();

                        break;

                    case 10:

                        fileService.saveStudents(
                                service.getStudents());

                        break;

                    case 11:

                        // Save automatically before closing
                        fileService.saveStudents(
                                service.getStudents());

                        System.out.println(
                                "Thank you! Program closed.");

                        break;

                    default:

                        System.out.println(
                                "Invalid choice!");
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number.");
                choice = 0;
            }

        } while (choice != 11);

        sc.close();
    }
}