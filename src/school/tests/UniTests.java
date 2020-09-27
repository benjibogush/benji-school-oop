package school.tests;

import school.business.PERSON;
import school.definitions.MidhighData;
import school.definitions.People;
import school.definitions.Student;


import static school.utilities.Utilities.calculateSalary;

public class UniTests {

    public static void main(String[] args) {

        // Get some teacher names
      String teacher1Name =  People.teacher1.getName();
      System.out.println(teacher1Name);

      String  teacher16Name = People.teacher16.getName();
      System.out.println(teacher16Name);

       int teacher5Age = People.teacher5.age = 19;
       System.out.println(People.teacher5.getName() +"'s age: " +teacher5Age);

       // UniData.remove(People.teacher9);

        System.out.println(People.teacher9.getName());

        // Set year exp for teacher 5 to 5 years
        People.teacher5.setYearExp(5); // 2000

        // Set year exp for teacher 6 to 10 years
        People.teacher6.setYearExp(10); // 3000

        // Set year exp for teacher 7 to 2 years
        People.teacher7.setYearExp(2); // 1000

        System.out.println(People.teacher5.getName() + "s salary: " +
                            calculateSalary(People.teacher5));

        System.out.println(People.teacher6.getName() + "s salary: " +
                calculateSalary(People.teacher6));

        System.out.println(People.teacher7.getName() + "s salary: " +
                calculateSalary(People.teacher7));


        // change what teacher 13 is teaching
        People.teacher13.setSubjectTeach("Selenium 4");
        // print what teacher 13 is teaching currently
        System.out.println(People.teacher13.getName() + " is teaching " +
                           People.teacher13.getSubjectTeach());

        // UniData obj
//        UniData obj = new UniData();
//        obj.teachSubject();






    }

}
