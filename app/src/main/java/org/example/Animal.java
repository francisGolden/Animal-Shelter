package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Animal {
    private String name;
    private int age;
    private boolean adopted;
    private String species;
    private final AnimalId animalId;

    public Animal(String name, int age, boolean adopted, String species){
        this.name = name;
        this.age = age;
        this.adopted = adopted;
        this.species = species;
        this.animalId = new AnimalId(species+"@"+name);
    }

    public Animal(String species){
        this.name = "carolina";
        this.age = 2;
        this.adopted = false;
        this.species = species;
        this.animalId = new AnimalId(species+"@"+name);
    }

    public void adopt(){
        if (adopted) {
            System.out.println(name + " has already been adopted");
            return;
        }
        adopted = true;
    }
}
