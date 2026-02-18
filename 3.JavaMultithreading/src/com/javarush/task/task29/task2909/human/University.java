package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }




    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        Student studentWithAverageGrade = null;
        double student_grade;
        first:
        for(Student student : students){
            student_grade = student.getAverageGrade();
            if(student_grade == averageGrade){
                studentWithAverageGrade = student;
                break first;
            }
        }
        return studentWithAverageGrade;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double maxAverageGrade = 0.0;
        Student studentMaxAveraGrade = null;
        for(Student student : students) {
            if (student.getAverageGrade() > maxAverageGrade) {
                maxAverageGrade = student.getAverageGrade();
                studentMaxAveraGrade = student;
            }
        }
        return studentMaxAveraGrade;
    }

    public Student getStudentWithMinAverageGrade(){
        double minAverageGrade = students.get(0).getAverageGrade();

        for(Student student : students) {
            double currentGrade = student.getAverageGrade();
            if (currentGrade < minAverageGrade) {
                minAverageGrade = currentGrade;
            }
        }
        return getStudentWithAverageGrade(minAverageGrade);
    }

    public void expel(Student student){
        students.remove(student);
    }
}