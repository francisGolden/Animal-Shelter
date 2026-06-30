package org.example;

import lombok.Data;

public class Dog extends Animal {
    public Dog(String name, int age, boolean adopted) {
        super(name, age, adopted, "dog");
    }
}
