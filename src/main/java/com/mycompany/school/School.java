/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.school;

/**
 *
 * @author Ares
 */
public class School {

    public static void main(String[] args){
            
        String[] lessons = new String[]{"Istoria", "Mathimatika", "Fysikh", "Pliroforiki", "Ximia"};
        
        Teacher teacher1 = new Teacher("Petros","Xarisidis","26389457327","Istoria");
        Teacher teacher2 = new Teacher("Mixalis","Ioannidis","14089938671","Mathimatika");
        Teacher teacher3 = new Teacher("Ioannis", "Papadopoulos", "10020303375", "Fysikh");
        Teacher teacher4 = new Teacher("Nikolaos", "Kontokostas", "04119283529", "Pliroforiki");
        Teacher teacher5 = new Teacher("Dimitrios", "Kalogiannis", "29089402299", "Ximia");

        Classroom classroom1 = new Classroom("E1", "Ergastirio 1");
        Classroom classroom2 = new Classroom("E2", "Ergastirio 2");
        Classroom classroom3 = new Classroom("E3", "Ergastirio 3");
        Classroom classroom4 = new Classroom("TH1", "Theoria 1");
        Classroom classroom5 = new Classroom("TH2", "Theoria 2");
        
        Lesson lesson1 = new Lesson("I1","Istoria","TH1");
        Lesson lesson2 = new Lesson("M1", "Mathimatika", "TH2");
        Lesson lesson3 = new Lesson("F1", "Fysikh", "E1");
        Lesson lesson4 = new Lesson("P1", "Pliroforiki", "E2");
        Lesson lesson5 = new Lesson("X1", "Ximia", "E3");
        
        Student student1 = new Student("Dimitris", "Papadopoulos", "6901", lessons);
        Student student2 = new Student("Eleni", "Antoniou", "6902", lessons);
        Student student3 = new Student("Nikos", "Georgiou", "6903", lessons);
        Student student4 = new Student("Sophia", "Ioannou", "6904", lessons);
        Student student5 = new Student("Yiannis", "Papandreou", "6905", lessons);
        Student student6 = new Student("Maria", "Karagiannis", "6906", lessons);
        Student student7 = new Student("Alexandros", "Christodoulou", "6907", lessons);
        Student student8 = new Student("Katerina", "Nikolaou", "6908", lessons);
        Student student9 = new Student("Andreas", "Papanikolaou", "6909", lessons);
        Student student10 = new Student("Despina", "Papadakis", "6910", lessons);
        Student student11 = new Student("Panagiotis", "Demopoulos", "6911", lessons);
        Student student12 = new Student("Ioanna", "Katsaros", "6912", lessons);
        Student student13 = new Student("Costas", "Angelopoulos", "6913", lessons);
        Student student14 = new Student("Athina", "Kostas", "6914", lessons);
        Student student15 = new Student("Giorgos", "Vlachos", "6915", lessons);
        Student student16 = new Student("Anastasia", "Papas", "6916", lessons);
        Student student17 = new Student("Spyros", "Dimitriou", "6917", lessons);
        Student student18 = new Student("Eleftheria", "Petridis", "6918", lessons);
        Student student19 = new Student("Petros", "Vasilopoulos", "6919", lessons);
        Student student20 = new Student("Vasiliki", "Paraskevopoulos", "6920", lessons);

        
        teacher1.print();
        System.out.println("\n");
        classroom1.print();
        System.out.println("\n");
        lesson1.print();
        System.out.println("\n");
        student1.print();
    }
}
