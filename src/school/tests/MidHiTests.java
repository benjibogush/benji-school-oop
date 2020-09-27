package school.tests;

import school.definitions.MidHiStudent;
import school.definitions.MidhighData;
import school.utilities.Utilities;


public class MidHiTests extends MidHiStudent {

    public MidHiTests(String name, int age, int grade) {
        super(name, age, grade);
    }

    public static void main(String[] args) {
        MidhighData obj1 = new MidhighData();


     String student1name =   studentM1.getName();
        System.out.println(student1name);

     int student1age = studentM1.age;
        System.out.println(student1name +"'s " + "age: " + student1age);


        String student2name =   studentM2.getName();
        System.out.println(student2name);

        int student2age = studentM2.age;
        System.out.println(student2name +"'s " + "age: " + student2age);

      //  obj1.enroll(new Student());

        // student send a message to the teacher
//          Utilities.sendMessage
//                  (studentM1, People.teacher6, "Can I have extra time?");

          // student cannot send message to other students
            Utilities.sendMessage1(studentM1, studentM2,
                    "Do you have the answers for the test?");
           // Utilities.getPersonForEach(getMidHiStudentList());

           // Utilities.getPersonIterator(getMidHiStudentList());

           // Utilities.getPersonLambda(getMidHiStudentList());

            Utilities.getPersonStream(getMidHiStudentList());
    }
}


// Return 2pm central