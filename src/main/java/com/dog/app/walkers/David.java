package com.dog.app.walkers;

import com.dog.app.dogs.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class David implements DogWalker {
    @Autowired
    private List<Dog> dogs;

    @Override
    public String getName() {
        return "David";
    }

    @Override
    public List<Dog> getDogs() {
        return dogs;
    }
}
