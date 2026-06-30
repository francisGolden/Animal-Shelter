package org.example;

import lombok.Data;

@Data
public class Dog extends Animal {
    public Dog(String name, int age, boolean adopted){
        super(name, age, adopted, "dog");
    }

    @Override
    public String toString(){
        return super.getName() + ", " + super.getSpecies() + ", " + super.getAge() + ", " + " adopted? " + super.isAdopted();
    }
}
