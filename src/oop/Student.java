package oop;

public  class Student extends Person{
    public String Grade;
    Student(String first_Name, String last_Name,String Grade) {

        super(first_Name, last_Name);
        this.Grade=Grade;

    }


}
