package oop;

import java.util.ArrayList;

public class ClassRoom {

    public String class_Name ;
    public String Grade;
    private ArrayList<Student> studentslist = new ArrayList<>();
   private ArrayList<Teacher> teacherslist = new ArrayList<>();
   ClassRoom(String class_Name,String Grade){
       this.class_Name = class_Name ;
       this.Grade =Grade ;
   }
   @Override
   public String toString(){
       return class_Name ;
   }
   public void addStudent(Student student){
      if( student.Grade.equals(this.Grade)){
          studentslist.add(student);
          System.out.println("student added ");

      }else {System.out.println("cant add Student from another grade");}

   }
   public void addTeacher(Teacher teacher){
       teacherslist.add(teacher);
       System.out.println("teacher added");
   }

    public ArrayList<Student> getStudentslist() {
        return studentslist;
    }

    public ArrayList<Teacher> getTeacherslist() {
        return teacherslist;
    }
}
