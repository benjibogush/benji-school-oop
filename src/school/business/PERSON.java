package school.business;

import school.definitions.Student;
import school.definitions.Teacher;

// POJO
public class PERSON  // concrete class
{
    // instance var
    public String name;
    public String subjectTeach;
    String branch; // major subject
    public int gradeLevel; // uni, jun, midhi
    //====================================
   public int age;
   public int id;

   public  int yearExp; // to calculate salary
   public  double salary;
   public static int count=0; // to count yearExp

   public PERSON(){    } // default constructor

    // for teachers
   public PERSON( String name, String subjectTeach)
   {
       this.name = name;
       this.subjectTeach = subjectTeach;
   }

   // for students
    public PERSON(String s_name, int s_age, int s_gradeLevel) {
        this.name = s_name;
        this.age = s_age;
        this.gradeLevel = s_gradeLevel;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PERSON.count = count;
    }

    public int getYearExp() {
        return yearExp;
    }

    public  void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    public String toString(){
    return "\nSTART PRINT\nname: " + name + "\n" +
            "age: " + age  + "\n" +
            "grade: " + gradeLevel+"\nEND PRINT";
    }

    public String toString(PERSON p){

       if( p instanceof Teacher){
           return "\nSTART PRINT\nname: " + name + "\n" +
                   "age: " + age  + "\n" +
                   "subject: " + p.getSubjectTeach()+"\nEND PRINT";
       }
       else{
           return "\nSTART PRINT\nname: " + name + "\n" +
                   "age: " + age  + "\n" +
                   "grade: " + gradeLevel+"\nEND PRINT";
       }


    }




}
