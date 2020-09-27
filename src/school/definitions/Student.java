package school.definitions;

import school.business.PERSON;

public class Student extends PERSON {

    // adding new students

        // reference type          sub type
    public static PERSON s1 = new Student("bee hab", 15, 10);
    public static PERSON s2 = new Student("Ahmet", 14, 9);
    public static PERSON s3 = new Student("Fatih", 26, 14);
    // Student s1 = new PERSON();
    public Student() { }
    public Student(String s_name, int s_age, int s_gradeLevel) {
//        name = s_name;
//        age = s_age;
//        gradeLevel = s_gradeLevel;
        super(s_name, s_age, s_gradeLevel);
    }

}
