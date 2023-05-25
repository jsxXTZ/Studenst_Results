package com.management.system.student_results.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    public Student(){

    }
    public Student(String name, String familyName, String dob, String email){
        this.name = name;
        this.familyName = familyName;
        this.dob = dob;
        this.email = email;
    }

    @Id
    private String name;
    private String familyName;
    private String dob;
    private String email;

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
