package studentdatabaseapp;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // constructor: name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter students last name: ");
        this.lastName = in.nextLine();
        
        System.out.println("Enter students grade year: ");
        this.gradeYear = in.nextLine();
    }
    // generate an id

    // enroll in courses

    // view balance

    // pay tuition

    // show status
}