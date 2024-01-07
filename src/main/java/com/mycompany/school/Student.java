/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.Arrays;

/**
 *
 * @author Ares
 */
public class Student {
    private String fname;
    private String lname;
    private String am; 
    private String[] lesson = new String[5];
    //@todo create getters and setters for array

    // first name getter and setter
    public String getFname() {
        return fname;
    }
    public void setFname(String newfName) {
        this.fname = newfName;
    }

    // last name getter and setter
    public String getLname() {
        return lname;
    }
    public void setLname(String newlName) {
        this.lname = newlName;
    }

    // am getter and setter
    public String getAm() {
        return am;
    }

    public void setAm(String newAm) {
        this.am = newAm;
    }

    //lesson getter and setter
    public String[] getLesson() {
        return lesson;
    }

    public void setLesson(String[] lesson) {
        this.lesson = lesson;
    }
    
    // constructor for student object
    public Student(String fname, String lname, String am, String[] lesson){
        this.setFname(fname);
        this.setLname(lname);
        this.setAm(am);
        this.setLesson(lesson);
    }
    // print method
    public void print(){
        System.out.println("First name: " + this.getFname() + "\nLast name: " + this.getLname() + "\nAM: " + this.getAm() + "\nLesson: " + Arrays.toString(this.getLesson()));
    }
    
}
