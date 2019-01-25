package com.dog.app.walkers;

import com.dog.app.dogs.Dog;

import java.util.List;

public class John implements DogWalker {

    private final List<Dog> dogs;

    public John(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String getName() {
        return "John";
    }

    @Override
    public List<Dog> getDogs() {
        return dogs;
    }
}
