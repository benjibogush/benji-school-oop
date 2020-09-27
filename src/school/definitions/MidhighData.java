package school.definitions;

import school.business.PERSON;
import school.business.middle_high;

import java.util.Scanner;

public class MidhighData extends PERSON implements middle_high {





    @Override
    public void teachSubject() {

    }

    @Override
    public void teachBranch() {

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

        System.out.println(name + " " + lastName + " is enrolled in middle high");
    }


}
