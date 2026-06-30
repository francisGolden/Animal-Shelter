package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Shelter<T extends Animal>{
    private List<T> animals;

    public Shelter(List<T> animals){
        this.animals = animals;
    }

    public void addAnimal(T animal){
        animals.add(animal);
    }

    public List<T> retrieveAnimals(String config){
        List<T> newList = new ArrayList<>();
        for (T animal: animals) {
            if (config.equals("available")) {
                if (!animal.isAdopted()) newList.add(animal);
            } else {
                newList.add(animal);
            }
        }
        return newList;
    }

    public List<T> filterBySpecies(String species){
        List<T> newList = new ArrayList<>();
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
                break;
            }
        }
    }
}
