package com.smile.springjpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "com.smile.springjpacrud.entities")
public class SpringjpacrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjpacrudApplication.class, args);
    }

}
