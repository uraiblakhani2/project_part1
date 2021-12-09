package com.mycompany.final_project;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Department {
    
    private int id;
    private String description;
    private Teacher dean = new Teacher();
    private ArrayList<Teacher> TeacherList = new ArrayList<>();        
    private ArrayList<Student> StudentList = new ArrayList<>();        
    private ArrayList<Staff> StaffList = new ArrayList<>();      
    
     public Department() {
    }

    public ArrayList<Teacher> getTeacherList() {
        return TeacherList;
    }

    public void setTeacherList(ArrayList<Teacher> TeacherList) {
        this.TeacherList = TeacherList;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }

    public ArrayList<Staff> getStaffList() {
        return StaffList;
    }

    public void setStaffList(ArrayList<Staff> StaffList) {
        this.StaffList = StaffList;
    }
    
    public Department(int id, String description) {
        this.id = id;
        this.description = description;
    }

   
     public Department(int newId, String newDescription, Teacher newDean) {
     this.id = newId;
     this.description = newDescription;
     this.dean = newDean;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getDean() {
        return dean;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }
    
    
    
}
