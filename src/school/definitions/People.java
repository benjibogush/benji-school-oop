package school.definitions;

import school.business.PERSON;
import school.utilities.Utilities;

public class People extends PERSON {

    // Founders
    public   static PERSON teacher1 = new PERSON("John Bernard", "CS-Algorithms");
    public  static   PERSON teacher2 = new PERSON("Tom Toon", "Data Structures");
    public  static   PERSON teacher3 = new PERSON("Tim Happy", "Selenium 3");
    public  static   PERSON teacher4 = new PERSON("Bee hab", "Selenium 4");

    // Business says to have no more than 10 people
    //New Hires
    public static PERSON teacher5;
    public static PERSON teacher6;
    public static PERSON teacher7;
    public static PERSON teacher8;
    public static PERSON teacher9;
    public static PERSON teacher12;
    public static PERSON teacher13;
    public static PERSON teacher14;
    public static PERSON teacher15;
    public static PERSON teacher16;
  //  public static PERSON teacher17; // 11th person
                                    // should not be added to the system

    static
    {
        try {
            teacher5 = Utilities.addPerson("Gulshat", 20, "Java");
            teacher6 = Utilities.addPerson("Ahmet", 21, "Selenium");
            teacher7 = Utilities.addPerson("Ismail", 22, "Business");
            teacher8 = Utilities.addPerson("Vusala", 23, "Math");
            teacher9 = Utilities.addPerson("X", 24, "SQL");

            teacher12 = Utilities.addPerson("Gulshat1", 25, "Java");
            teacher13 = Utilities.addPerson("Ahmet1", 26, "Selenium");
            teacher14 = Utilities.addPerson("Ismail1", 27,  "Business");
            teacher15 = Utilities.addPerson("Ismail2", 28, "Business");
            teacher16 = Utilities.addPerson("Vusala1", 29, "Math");
           // teacher17 = Utilities.addPerson("Xzz1", "SQL"); // 11th
            // should not add 11th person

        } catch (Exception e) {
            e.printStackTrace();// html 500 400 200
            // divert, or send the user to another system/service
        }
    }



}

