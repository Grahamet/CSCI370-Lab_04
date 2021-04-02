package com.example.asynctask;


import java.util.ArrayList;

public class StudentDao {

    private ArrayList<Student> students = new ArrayList<Student>();;



    public StudentDao(){
        students.add(new Student("Brownlee","Dart","Forensic Anthropology"));
        students.add(new Student("McDonald","Riley","Psychology"));
        students.add(new Student("McKenzie","Anne","Physical Education"));
        students.add(new Student("Bajo","Ka'ala","Psychology"));
        students.add(new Student("Brown", "Courtney","Pathology"));
    }

    public ArrayList<Student> getAllStudents(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return students;
    }
}
