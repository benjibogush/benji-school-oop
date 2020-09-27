package school.definitions;

import school.business.PERSON;

import java.util.ArrayList;
import java.util.List;

import static school.utilities.Utilities.addPerson;

public class MidHiStudent extends Student {
    private static ArrayList<Student> midHiStudentList = new ArrayList<>();


    public MidHiStudent(String name, int age, int grade) {
        super(name, age, grade);
    }

    public MidHiStudent() { }

    public static List<Student> getMidHiStudentList(){
        return midHiStudentList;
    }

    public static PERSON studentM1 = addPerson("MiniBee", 12, 8 );

    public static PERSON studentM2 = addPerson("BigBee", 14, 8 );
}
