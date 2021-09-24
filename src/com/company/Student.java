package com.company;

public class Student extends Person{
    private int course = 1;

    public void SetCourse(int course){
        this.course = course;
    }
    public void tell(){
        System.out.println(super.GetName());
    }
    public Student(int height, int years, int course){
        super(height, years);
        this.course = course;
    }
}
