package oop;

public class Demo {

    public static void main(String[] args) {
        School ThePrince = new School("ThePrince");
        ClassRoom S41 = new ClassRoom("S41","First");
        ClassRoom S42 = new ClassRoom("S42","Second");
        ThePrince.addClassRooms(S41);
        ThePrince.addClassRooms(S42);
        System.out.println("School : "+ThePrince.getCampus_Name());
        System.out.println("ClassRooms : "+ThePrince.getClassRooms().toString());
        PhycsStudent N1 = new PhycsStudent("hasan","ali","First");
        S41.addStudent(N1);
        S42.addStudent(N1);
        N1.learn();
        MathTeacher A1 = new MathTeacher("Bob","Karl",600);
        S41.addTeacher(A1);
        System.out.println("Students : "+S41.getStudentslist().toString());
        System.out.println("Teacher : "+S41.getTeacherslist().toString());
        A1.Teach();

    }
}
