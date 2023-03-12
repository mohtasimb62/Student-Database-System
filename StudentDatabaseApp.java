package studentdatabaseapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.enroll();    // starts s1 to enroll in courses
        s1.payTuition();
        System.out.println(s1.toString());    
        // ask how many students n to add
        // create n number of new students
    }
}
