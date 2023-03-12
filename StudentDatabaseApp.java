package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
       // ask how many new students n to add
        System.out.println("Enter the number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            s
            students[n] = new Student();
            students[n].enroll();    // starts s1 to enroll in courses
            students[n].payTuition();
            System.out.println(students[n].toString());    
        }
    }
}
