package school.business;


import school.definitions.Student;

public interface university
{
    // based on the information from the board
    // you add required methods

    // Size ; how many teachers?
    static final  int MAX_SIZE = 10;

    // subject teaching
    void  teachSubject();

    // brach of the teachers
    void teachBranch();

    // remove teachers - terminate
    void  removePerson(PERSON p);

    // enroll new students
    void enroll(Student s);

}
