package school.definitions;

import school.business.PERSON;
import school.business.university;
import school.utilities.Utilities;

import java.util.Scanner;

public class UniData extends PERSON implements university {
    PERSON a = new UniData();

    @Override
    public void teachSubject() {
        System.out.println("Teaching " + teach());
    }

    public static String teach() {

        return " in Computer Science";
    }

    @Override
    public void teachBranch() {
        System.out.println("CS-DataMining");
    }

    @Override
    public void removePerson(PERSON p) {

    }

    @Override
    public void enroll(Student s) {
        Scanner scanner = new Scanner(System.in);

        // ask the name of the student
        System.out.print("Enter student name: ");
        String name = scanner.next();

        // ask the last name
        System.out.print("Enter student last name: ");
        String lastName = scanner.next();

        System.out.println(name + " " + lastName + " is enrolled in university");
    }


    public static void remove(PERSON p){
        Utilities.removeAperson(p);
    }

    public String toString(){
        return "name: " + name + "\n" +
                "age: " + age  + "\n" +
                "grade: " + gradeLevel;
    }
}
