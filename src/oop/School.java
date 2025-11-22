package oop;

import java.util.ArrayList;

public class School {
    private   String campus_Name;
    private ArrayList<ClassRoom> classRooms = new ArrayList<>();

    School(String campus_Name){
        this.campus_Name = campus_Name ;
    }

    public String getCampus_Name() {
        return campus_Name;
    }

    public void setCampus_Name(String campus_Name) {
        this.campus_Name = campus_Name;
    }

    public ArrayList<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void addClassRooms(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }
}
