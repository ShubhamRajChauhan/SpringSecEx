package com.shubham.SpringSecEx;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int marks;


    //private static List<Student> studentList = new ArrayList<>();

    public Student() {
        // default constructor for Spring JSON conversion
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void add(Student student, List<Student> students) {
        students.add(student);
    }


}
