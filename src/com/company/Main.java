package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Astronaut player5 = new Astronaut("Red", true, 25);
        System.out.println("Is " + player5.getColor() + " the impostor?\n" +
                "the sus detector says it's " + player5.getIsImpostor());

        Pet myCat = new Pet("Mary", "Alamo", "Cat", 2);
        myCat.setName("Pollygirly");
        System.out.println("My cat's new name is " + "\"" +myCat.getName() + "\"" + ".");
    }
}
