package oop;

public class Teacher extends FullTimeInstructor {

    public Teacher(String first_Name, String last_Name,double salary) {
        super(first_Name, last_Name);
        this.salary = salary ;
    }

}
