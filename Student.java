package com.mycompany.final_project;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
class Student extends Person{
    private String course;
    private int semester;

    
     public Student() {
        this.course = null;
        this.semester = 0;
    }
    
    public Student(String course, int semester) {
        this.course = course;
        this.semester = semester;
    }
    
        
    public Student(int id, String name, int age, String gender, String course, int semester) {
        super(id, name, age, gender);
        this.course = course;
        this.semester = semester;
    }
    
    

    
    

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student" + "course=" + course + ", semester=" + semester + '}';
    }

  

/*    public boolean defineCategory(Object obj) {
        if(obj.getClass() == this.getClass()){
        Student s = (Student) obj;
        return (s.getId()==this.getId());
        
    }
   
    return true;
    }
    
  */
    
}
    

