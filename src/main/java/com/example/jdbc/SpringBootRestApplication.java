package com.example.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class SpringBootRestApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApplication.class, args);
    }

}
