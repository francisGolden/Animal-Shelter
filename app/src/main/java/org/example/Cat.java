package org.example;

import lombok.Data;

@Data
public class Cat extends Animal {
    public Cat(String name, int age, boolean adopted){
        super(name, age, adopted, "cat");
    }
    public Cat(int animalId){
        super("micio", 1, false, "cat");
    }

    @Override
    public String toString(){
        return super.getName() + ", " + super.getSpecies() + ", " + super.getAge() + ", " + " adopted? " + super.isAdopted();
    }
}
