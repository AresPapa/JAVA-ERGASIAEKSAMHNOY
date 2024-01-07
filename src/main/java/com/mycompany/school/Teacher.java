/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Ares
 */
public class Teacher {
    private String fname;
    private String lname;
    private String amka;
    private String lesson;
    
    // first name getter and setter
    public String getfName(){
        return fname;
    }
    public void setfName(String newfName){
        this.fname = newfName;
    }
    
    // last name getter and setter
    public String getlName(){
        return lname;
    }
    public void setlName(String newlName){
        this.lname = newlName;
    }
    
    // amka getter and setter
    public String getAmka(){
        return amka;
    }
    public void setAmka(String newAmka){
        this.amka = newAmka;
    }
    
    //lesson getter and setter
    public String getLesson(){
        return lesson;
    }
    public void setLesson(String newLesson){
        this.lesson = newLesson;
    }
    
    // constructor to create teacher object
    public Teacher(String fname, String lname, String amka, String lesson){
        this.setfName(fname);
        this.setlName(lname);
        this.setAmka(amka);
        this.setLesson(lesson);
    }
    
    // print method
    public void print(){
        System.out.println("First name: " + this.getfName()+ "\nLast name: " + this.getlName() + "\nAMKA: " + this.getAmka() + "\nLesson: " + this.getLesson());
    }
}
