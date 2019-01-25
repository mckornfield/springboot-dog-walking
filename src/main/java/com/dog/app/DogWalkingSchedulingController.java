package com.dog.app;

import com.dog.app.dogs.Dog;
import com.dog.app.walkers.DogWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/walk")
public class DogWalkingSchedulingController {

    @Autowired
    private List<DogWalker> dogWalkers;

    DogWalkingSchedulingController(List<DogWalker> dogWalkers) {
        this.dogWalkers = dogWalkers;
    }

    @GetMapping("/walkers")
    public List<DogWalker> getDogWalkers() {
        return dogWalkers;
    }

    @GetMapping("/walkers/{name}")
    public DogWalker getDogWalker(@PathVariable String name) {
        return dogWalkers.stream()
            .filter(walker -> Objects.equals(name, walker.getName()))
            .findFirst()
            .orElseThrow(NotFoundException::new);
    }

    @GetMapping("/walkers/{name}/dogs")
    public List<Dog> getWalkersDogs(@PathVariable String name) {
        DogWalker dogWalker = dogWalkers.stream()
            .filter(walker -> Objects.equals(name, walker.getName()))
            .findFirst()
            .orElseThrow(NotFoundException::new);
        return dogWalker.getDogs();
    }

}
