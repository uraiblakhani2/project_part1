package com.mycompany.final_project;

/*

GITHUB LINK:


/**
 *
 * @author Administrator
 */
public abstract class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    

    
    
     public Person() {
        this.id = 0;
        this.name = null;
        this.age = 0;
        this.gender = null;
    }
    
    
    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    /*
  public abstract boolean defineCategory(Object obj);

*/
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }

    
  
    
}










