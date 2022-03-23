package com.company;

public class Astronaut {
    /*
    2. Create a Custom Class (anything you want - car, phone, holiday, etc.).
    Requirements:

    Minimum 3 private instance variables
    An empty constructor
    A constructor that uses only 2 of your 3 variables
    A constructor that uses all 3 of your instance variables
    Get methods for all 3 of your instance variables
        and Set methods for all 3 of your instance variables
    A method that returns a Boolean
    A method that returns a String (For example, if I created a Santa Custom Class,
        my code would look something like the attached Santa.java file.)
     */

    // private instances
    private String color;
    private boolean isImpostor;
    private int xp;

    // empty constructor
    Astronaut() {
    }
    // constructor w/ 2/3 variables
    Astronaut(String color, boolean isImpostor) {
        this.color = color;
        this.isImpostor = isImpostor;
    }
    // constructor w/ 3/3 variables
    Astronaut(String color, boolean isImpostor, int xp) {
        this.color = color;
        this.isImpostor = isImpostor;
        this.xp = xp;
    }


    // get methods
    public String getColor(){
        return color;
    }
    public boolean getIsImpostor() {
        return isImpostor;
    }
    public int getXp() {
        return xp;
    }

    // method that returns a boolean method
    public boolean isSus(){
        return true;
    }

    //method that returns a String
    public String whoTheImpostor(){
        return "Who's the impostor?\n" +
                "Looking sus, who can we trust?";
    }
}
