package school.tests;

import school.business.PERSON;
import school.definitions.JunHiStudent;
import school.definitions.JuniorHighData;
import school.utilities.Utilities;

public class JunHiTests extends JunHiStudent {

    public JunHiTests(String name, int age, int grade) {
        super(name, age, grade);
    }

    public static void main(String[] args) {
//        JuniorHighData j = new JunHiTests();
//        j.enroll(new Student());

        PERSON p = new JuniorHighData();
        p.toString();


        System.out.println( Utilities.getStudentsWhile(getJunHiStudentList()));



    }
}
