package org.example;

import lombok.Getter;

@Getter
public final class AnimalId {
    private final String id;
    public AnimalId(String id){
        this.id = id;
    }
}
