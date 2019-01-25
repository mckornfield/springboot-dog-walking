package com.dog.app.walkers;

import com.dog.app.dogs.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Jeff implements DogWalker {
    @Autowired
    @Qualifier(value = "pongo")
    private Dog dog;


    @Override
    public String getName() {
        return "Jeff";
    }

    @Override
    public List<Dog> getDogs() {
        return Collections.singletonList(dog);
    }
}
