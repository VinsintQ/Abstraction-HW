package oop;

public class MathTeacher extends Teacher implements TeacherRole{


    MathTeacher(String fanme ,String lname,double salary){
        super(fanme,lname,salary);
    }
    @Override
    public void Teach() {
        System.out.println(first_Name+" is Teaching MATHS");
    }
    public String toString(){
        return "name :"+first_Name+" "+last_Name;
    }
}
