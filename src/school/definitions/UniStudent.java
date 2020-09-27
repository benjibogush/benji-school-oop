package school.definitions;

import school.business.PERSON;

import java.util.ArrayList;

import static school.utilities.Utilities.addPerson;

public class UniStudent extends Student {
    // power of encapsulation: OOP= getter and setter
    private static ArrayList<Student> uniStudentList = new ArrayList<>();
    public UniStudent(String name, int age, int grade) {
       super(name, age, grade);

    }
    public static ArrayList<Student> getUniStudentList(){
        return uniStudentList;
    }

    public static PERSON studentU1 = addPerson("Bee", 18, 14 );


}
