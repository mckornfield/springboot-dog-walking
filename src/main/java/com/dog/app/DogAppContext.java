package com.dog.app;

import com.dog.app.dogs.Dog;
import com.dog.app.dogs.Perdita;
import com.dog.app.dogs.Pongo;
import com.dog.app.walkers.Ben;
import com.dog.app.walkers.DogWalker;
import com.dog.app.walkers.John;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DogAppContext {

    @Bean
    public Dog perdita() {
        return new Perdita();
    }

    @Bean
    public Dog pongo() {
        return new Pongo();
    }

    @Bean
    public DogWalker john(List<Dog> dogs) {
        return new John(dogs);
    }

    @Bean
    public DogWalker ben(@Qualifier("pongo") Dog dog) {
        return new Ben(dog);
    }

    @Bean
    public DogWalkingSchedulingController schedulingController(List<DogWalker> dogWalkers) {
        return new DogWalkingSchedulingController(dogWalkers);
    }
}
