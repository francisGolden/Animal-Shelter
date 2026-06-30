package org.example;

public class Bird extends Animal {
    public Bird(String name, int age, boolean adopted){
        super(name, age, adopted, "bird");
    }

    @Override
    public String toString(){
        return super.getName() + ", " + super.getSpecies() + ", " + super.getAge() + ", " + " adopted? " + super.isAdopted();
    }
}
