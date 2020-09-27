package school.definitions;

import school.business.PERSON;
import static school.utilities.Utilities.addPerson;
import java.util.ArrayList;

public class Teacher extends PERSON {           // RETURN AT 3:05 CENTRAL

    private static ArrayList<Teacher> teachers = new ArrayList<>();

    // getter for private list above
    public static ArrayList<Teacher> getTeacherList(){
        return teachers;
    }

    public Teacher(){}
    public Teacher(String name, int age, String branch)
    {
//        this.name = name;
//        this.age = age;
//        this.subjectTeach = brach;

        super(name, branch);
        this.age = age;

    }


//    public static PERSON t1 = new Teacher("Ahmet", 30, "Science");
//    public static PERSON t2 = new Teacher("Emre", 29, "Physics");

    public static PERSON t1 = addPerson("Ahmet",  30,"Science");
    public static PERSON t2 = addPerson("Emre", 29,"Physics");




}
