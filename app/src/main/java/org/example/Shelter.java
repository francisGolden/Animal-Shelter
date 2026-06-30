package org.example;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Shelter<T extends Animal>{
    private ArrayList<T> animals = new ArrayList<>();

    public void addAnimal(T animal){
        animals.add(animal);
    }

    public void listAnimals(String config){
        for (T animal: animals) {
            if (config.equals("available")) {
                if (!animal.isAdopted()) System.out.println(animal);
            } else {
                System.out.println(animal);
            }
        }
    }

    public ArrayList<Animal> searchBySpecies(String species){
        ArrayList<Animal> newList = new ArrayList<>();
        for (T animal: animals){
            if (animal.getSpecies().equals(species)){
                newList.add(animal);
            }
        }
        return newList;
    }

    public void adoptAnimal(String name){
        for (T animal: animals){
            if (animal.getName().equals(name)){
                animal.adopt();
            }
        }
    }
}
