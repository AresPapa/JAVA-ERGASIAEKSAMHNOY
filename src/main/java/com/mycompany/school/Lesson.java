/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Ares
 */
public class Lesson {
    private String lessonid;
    private String desc;
    private String classid;
    
    // lesson id getter and setter
    public String getLessonid(){
        return lessonid;
    }
    public void setLessonid(String newLessonid){
        this.lessonid = newLessonid;
    }
    
    // description getter and setter
    public String getDesc() {
        return desc;
    }
    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }
    
    // classroom getter and setter
    public String getClassid(){
        return classid;
    }
    public void setClassid(String newClassid){
        this.classid = newClassid;
    }
    
    //constructor to create lesson object
    public Lesson(String lessonid, String desc, String classid){
        this.setLessonid(lessonid);
        this.setDesc(desc);
        this.setClassid(classid);
    }
    
    // print method 
    public void print(){
        System.out.println("Lesson ID: " + this.getLessonid() + "\nLesson description : " + this.getDesc() + "\nClass id: " + this.getClassid());
    }
}
