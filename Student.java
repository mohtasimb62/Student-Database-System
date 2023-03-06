package studentdatabaseapp;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor: name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter students last name: ");
        this.lastName = in.nextLine();
        
        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter student grade level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }
    // generate an id
    private void setStudentID() {
        // Grade level + id 
        id++; 
        this.studentID = gradeYear + "" + id;
    }
    // enroll in courses
    public void enroll() {
        // loop until 0
        do {
            System.out.print("Enter course to enroll (Q/q to stop): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            } else { break; }
        } while (1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
}
    // view balance

    // pay tuition

    // show status
