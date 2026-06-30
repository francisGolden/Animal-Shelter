package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shelter<Animal> myShelter = new Shelter<>(new ArrayList<>());
        myShelter.addAnimal(new Dog("jack", 3, false));

        myShelter.addAnimal(new Cat("kitty", 5, false));

        myShelter.addAnimal(new Cat("kittie2", 2, false));

        myShelter.addAnimal(new Bird("birdie", 2, false));

        System.out.println(myShelter.retrieveAnimals("all"));
        System.out.println("------");
        System.out.println(myShelter.filterBySpecies("cat"));

        myShelter.adoptAnimal("birdie");

        System.out.println("ALL: ");
        System.out.println(myShelter.retrieveAnimals("all"));

        System.out.println("-------");
        System.out.println("AVAILABLE: ");
        System.out.println(myShelter.retrieveAnimals("available"));
    }
}