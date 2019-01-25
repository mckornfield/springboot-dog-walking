package com.dog.app.dogs;

import org.springframework.stereotype.Component;

@Component
public class Perdita implements Dog {
    @Override
    public String getName() {
        return "Perdita";
    }
}
