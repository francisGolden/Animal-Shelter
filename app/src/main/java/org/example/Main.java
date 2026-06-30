package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shelter<Animal> myShelter = new Shelter<>(new ArrayList<>());
        myShelter.addAnimal(new Dog("jack", 3, false));

        myShelter.addAnimal(new Cat("kitty", 5, false));

        myShelter.addAnimal(new Cat("kittie2", 2, false));

        myShelter.addAnimal(new Bird("birdie", 2, false));

        myShelter.listAnimals("all");
        System.out.println("------");
        System.out.println(myShelter.searchBySpecies("cat"));

        myShelter.adoptAnimal("wolfie");
        myShelter.adoptAnimal("birdie");

        System.out.println("ALL: ");
        myShelter.listAnimals("all");

        System.out.println("-------");
        System.out.println("AVAILABLE: ");
        myShelter.listAnimals("available");
    }
}