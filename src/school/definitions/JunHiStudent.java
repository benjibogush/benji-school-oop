package school.definitions;

import school.business.PERSON;

import java.util.ArrayList;

import static school.utilities.Utilities.addPerson;

public class JunHiStudent extends Student {

    private static ArrayList<Student> junHiStudentList = new ArrayList<>();

    public JunHiStudent(){} // default constructor
    public JunHiStudent(String name, int age, int grade) {
        super(name, age, grade);

    }

    // getter for private list above
    public static ArrayList<Student> getJunHiStudentList(){
        return junHiStudentList;
    }

    public static Student studentJ1 = addPerson("SAEA", 15, 11 );
    public static Student studentJ2 = addPerson("AEAS", 14, 10 );



}
