package com.example.jdbc;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @EmbeddedId
    private PersonId personId;

    private String phone_number;
    private String city_of_living;

    public Person() {
    }

    public Person(PersonId personId, String phone_number, String city_of_living) {
        this.personId = personId;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }
}
