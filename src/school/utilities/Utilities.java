package school.utilities;

import school.business.PERSON;
import school.definitions.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static school.business.university.MAX_SIZE;
import static school.definitions.JunHiStudent.getJunHiStudentList;
import static school.definitions.MidHiStudent.getMidHiStudentList;

import static school.definitions.Teacher.getTeacherList;
import static school.definitions.UniStudent.getUniStudentList;

public class Utilities extends PERSON {

  //  static ArrayList<PERSON> studentArrayList = new ArrayList<>();

    /**
     * This method adds new hires or new staff members
     * @param name
     * @param age
     * @param teach
     * @return new PERSON object
     */
    public static PERSON addPerson(String name, int age, String teach) {
        Teacher newPerson = new Teacher();

        // add if student vs teacher

        if (count > MAX_SIZE+1) // if count and max size equals, no more person can be added
        {
            System.out.println("You cannot add more persons!");
        } else {
            ++count;
            newPerson = new Teacher(name, age, teach);
            getTeacherList().add(newPerson); // bug, fix it later
        }

        return newPerson;
    }

    /**
     * This method adds new students to correct grade levels
     * Students are added to arraylists based on grade level.
     * @param name
     * @param age
     * @param grade
     * @return new Student object
     */
    public static Student addPerson(String name, int age, int grade) {
        Student newStudent = new Student();

        if (count == MAX_SIZE) {
            System.out.println("Cannot add more students: " + count);
        } else {
            // grades equal or less 8: Mid Hi
            if (grade <= 8)
            {
                ++count;
                newStudent = new MidHiStudent(name, age, grade);
                // add a container
                //midHiStudentList.add(newStudent);
                getMidHiStudentList().add(newStudent);
            }

            // grades equal or more than 9 and less than 12: Jun Hi
            else if (grade >= 9 && grade < 12)
            {
                ++count;
                newStudent = new JunHiStudent(name, age, grade);
                // junHiStudentList.add(newStudent);
                getJunHiStudentList().add(newStudent);
            }
            // grades eqaul or more than 12 or up Uni
            else
            {
                ++count;
                newStudent = new UniStudent(name, age, grade);
                // studentArrayList.add(newStudent);
                //uniStudentList.add(newStudent);
                getUniStudentList().add(newStudent);
            }
        }
        return newStudent;
    }

    /**
     * Remove persons ,terminate contract
     * @param p
     * @return "Deleted" for validation.
     */
    public static String removeAperson(PERSON p)
    {
        // p = new PERSON("Deleted", "Deleted");

        p.setName("Deleted");
        p.setSubjectTeach("Deleted");

        return p.getName();
    }


    /**
     *  get Salary calculation for persons
      * @param p
     * @return
     */
    public static double calculateSalary(PERSON p) {
        if(p instanceof Teacher){
            if (p.yearExp >= 10) {
                p.salary = 3 * 1000.00;
            } else if (p.yearExp >= 5 && p.yearExp < 10) {
                p.salary = 2 * 1000.00;
            } else {
                p.salary = 1000.00; // base salary
            }
        }
        //  salary = p.salary;
        return p.salary;
    }

    /**
     * This method accepts PERSON reference type object
     * Print out the person info using toString built in PERSON class.
     * @param person
     * @param <T> could be Teacher or Student type
     * @return is ignored, you can change this method into void type.
     */
    public static <T> PERSON getPersonForEach(List<T> person)
    {
        // generic for each that works for student or teacher types
        for (T t : person)
        {
            // Method 1
            System.out.println(t.toString());
        }
        // Iterator interface
        // lambda, streams
        return new Teacher();
    }

    /**
     * This method accepts a person obj
     * Prints using iterator
     * @param <T>
     * @param person
     */
    public static <T> void getPersonIterator(List<T> person)
    {
        // generic for each that works for student or teacher types

        Iterator<T> iterator = person.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }


    public static void getPersonIterator(SUPERKEY[] person)
    {
        // generic for each that works for student or teacher types
        Stream<SUPERKEY> stream = Stream.of(person);
       // stream.forEach(System.out::println);

        // or
        stream.forEach(e -> System.out.print("\n"+e.getKey() +" "+ e.getValue()));

    }

    public static <T> void getPersonLambda(List<T> person)
    {
        // generic for each that works for student or teacher types
        person.forEach(e -> System.out.println(e));
       //shorter way to write the code above
       // person.forEach(System.out::println);

    }

    public static <T> void getPersonStream(List<T> person)
    {
        Stream<T> streamBad = (Stream<T>) Stream.of(person);

        // generic for each that works for student or teacher types
        try (Stream<List<T>> stream = Stream.of(person);) {

            stream.forEach(System.out::println);
          //  stream.forEach(e -> System.out.println(e)); Another way to solve


        }catch (Exception e){
            e.printStackTrace();
        }

    }





    public static String getStudentsWhile(List<Student> student)
    {
        // work with a counter
        int count =0;
        while (student.size() > count)
        {
            System.out.println(student.get(count).toString());
            count++;
        }

        return "";
    }

    public static String getTeachersWhile(List<Teacher> teachers)
    {
        // work with a counter
        int count =0;
        while (teachers.size() > count)
        {
            System.out.println(teachers.get(count).toString());
            count++;
        }

        return "";
    }



    public  static void sendMessage(PERSON sender, PERSON recepient, String message){
        System.out.println(sender.getName() + " is emailing a  request to " +
                recepient.getName()+"\nRequest: " + message);
    }

    public  static void sendMessage1(PERSON sender, PERSON recepient, String message){

        if (recepient instanceof Student){
            System.out.println("You cannot send message to your peers!");

        }
        else {
            System.out.println(sender.getName() + " is emailing a  request to " +
                    recepient.getName()+"\nRequest: " + message);
        }

    }
}
