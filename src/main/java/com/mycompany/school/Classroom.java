/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Ares
 */
public class Classroom {
    private String classid;
    private String desc;

    // class id getter and setter
    public String getClassid() {
        return classid;
    }
    public void setClassid(String newClassid) {
        this.classid = newClassid;
    }

    // description getter and setter
    public String getDesc() {
        return desc;
    }
    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }
    // constructor to create classroom object
    public Classroom(String classid, String desc){
        this.setClassid(classid);
        this.setDesc(desc);
    }
    
    //print method
    public void print(){
        System.out.println("Class ID: " + this.getClassid() + "\n Class description: " + this.getDesc());
    }
}
