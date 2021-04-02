package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {

    private ArrayList<Student> studentsInfo;


    public StudentDao (){

        studentsInfo.add(new Student("Brownlee","Dart","Forensic Anthropology"));
        studentsInfo.add(new Student("McDonald","Riley","Psychology"));
        studentsInfo.add(new Student("McKenzie","Anne","Physical Education"));
        studentsInfo.add(new Student("Bajo","Ka'ala","Psychology"));
        studentsInfo.add(new Student("Brown", "Courtney","Pathology"));
    }

    public ArrayList<Student> getAllStudents(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentsInfo;
    }
}
