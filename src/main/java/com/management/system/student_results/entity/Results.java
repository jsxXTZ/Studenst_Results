package com.management.system.student_results.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Results {


    public Results(){

    }

    public Results(String courseName, String studentName, String score){
        this.courseName = courseName;
        this.studentName = studentName;
        this.score = score;
    }

    @Id
    private String courseName;

    private String studentName;

    private String score;

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getScore() {
        return score;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Results{" +
                "courseName='" + courseName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
