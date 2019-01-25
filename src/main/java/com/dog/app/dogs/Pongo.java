package com.dog.app.dogs;

import org.springframework.stereotype.Component;

@Component
public class Pongo implements Dog {
    @Override
    public String getName() {
        return "Pongo";
    }
}
