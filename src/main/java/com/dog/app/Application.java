package com.dog.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = {"com.dog.app"},
    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*DogAppContext"))
@SpringBootApplication

// The above is interchangeable with the below, just comment out the below annotations and comment in the top
// You will notice different dog walkers are in the DogAppContext.class than the package scanning pieces

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@Import(DogAppContext.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}