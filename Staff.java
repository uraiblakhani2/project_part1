/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.final_project;

/**
 *
 * @author uraib lakhani
 */
public class Staff extends Person implements PayRoll{
    private String duty;
    private int workload;

    public Staff() {
    }

  
    public Staff(String duty, int workload, int id, String name, int age, String gender) {
        super(id, name, age, gender);
        this.duty = duty;
        if (workload > 36){
            this.workload = 36;
        }
    else{
        this.workload = workload;
    }
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        if (workload > 36){
            this.workload = 36;
        }
    else{
        this.workload = workload;
    }
    }

    @Override
    public String toString() {
        return "Staff{" + "duty=" + duty + ", workload=" + workload + '}';
    }

    @Override
    public double computePayRoll() {
     return (this.workload * 32 * 2) * 0.85;
        
    }
    
    
  
/*public boolean defineCategory(Object obj) {
        if(obj.getClass() == this.getClass()){
        Student s = (Student) obj;
        return (s.getId()==this.getId());
        
    }
    return true;
    }

    */

   
}
