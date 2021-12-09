package com.mycompany.final_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
class Teacher extends Person implements PayRoll{
    
    
    private String speciality;
    private String degree;
    

    public Teacher(int id, String name, int age, String gender, String speciality, String degree) {
        super(id, name, age, gender);
        this.speciality = speciality;
        this.degree = degree;
    }

   
    public Teacher() {
        this.speciality = null;
        this.degree = null;
    }
    
    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Teacher{" + "speciality=" + speciality + ", degree=" + degree + '}';
    }

    public double computePayRoll() {
       int saldegree = 0;
       
       if (this.degree == "PhD"){
           saldegree = 112;
       }
       
       else if(this.degree == "Master"){
        saldegree = 112;
       }
       
      else if (this.degree == "Bachelor"){
           saldegree = 42;
       }
       
       return (36 * saldegree * 2) * 0.76;
       
       
    }
    
   
    
    
   /* public boolean defineCategory(Object obj) {
        if(obj.getClass() == this.getClass()){
        Student s = (Student) obj;
        return (s.getId()==this.getId());
        
    }
    return true;
    }
    */
    
}
