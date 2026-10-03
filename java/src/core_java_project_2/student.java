package core_java_project_2;

import java.io.Serializable;

public class student implements Serializable {

    private static final long serialVersionUID = 1L;

    // Private fields for encapsulation
    private int id;
    private String name;
    private String email;
    private double marks;
    private int attendance;
    private student_status status;
    private course course;

    public student(int id, String name, String email,
                   double marks, int attendance,
                   student_status status, course course) {

        setId(id);
        setName(name);
        setEmail(email);
        setMarks(marks);
        setAttendance(attendance);
        setStatus(status);
        setCourse(course);
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Student ID must be positive.");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        this.email = email;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        if (attendance < 0 || attendance > 100) {
            throw new IllegalArgumentException(
                    "Attendance must be between 0 and 100.");
        }
        this.attendance = attendance;
    }

    public student_status getStatus() {
        return status;
    }

    public void setStatus(student_status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null.");
        }
        this.status = status;
    }

    public course getCourse() {
        return course;
    }

    public void setCourse(course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }
        this.course = course;
    }

    // Grade calculation

    public String calculateGrade() {

        if (marks >= 90) {
            return "O";
        } else if (marks >= 80) {
            return "A+";
        } else if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 35) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    // Display student details

    public void displayDetails() {

        System.out.println("----------------------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
        System.out.println("Marks        : " + marks);
        System.out.println("Attendance   : " + attendance + "%");
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("Status       : " + status);
        System.out.println("Course       : " + course);
        System.out.println("----------------------------------------");
    }
}