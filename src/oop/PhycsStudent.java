package oop;

public class PhycsStudent extends Student implements StudentRole {

    PhycsStudent(String fname,String lname ,String Grade){
        super(fname,lname,Grade);

    }
    @Override
    public void learn() {
        System.out.println(first_Name+"is Learning Physics");
    }

    public String toString(){
        return "name :"+first_Name+" "+last_Name;
    }
}
