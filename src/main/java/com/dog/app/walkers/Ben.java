package com.dog.app.walkers;

import com.dog.app.dogs.Dog;

import java.util.Collections;
import java.util.List;

public class Ben implements DogWalker {

    private final Dog dog;

    public Ben(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String getName() {
        return "Ben";
    }

    @Override
    public List<Dog> getDogs() {
        return Collections.singletonList(dog);
    }
}
