package com.company;
/* 1. Create a Pet Class with the following instance variables:
        - name (PRIVATE)
        - age (PRIVATE)
        -location (PRIVATE)
        - type (PRIVATE)
        - two constructors(empty, all attributes)
        - Code to be able to access the following (Get Methods):
        - name, age, type
        - Code to be able to change (Set Methods):
        - name, age, location
*/
public class Pet {
    // instance variables
    private String name;
    private int age;
    private String location;
    private String type;

    //two constructors (empty, all attributes)
    Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    // the reason why this works is because they have different signatures
    Pet(String name, String location, String type, int age) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.age = age;
    }

    //getters and setters (must be public to be accessed outside this class)
    // get methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return name;
    }

    // set methods - use void because we're not returning anything, just setting things
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
