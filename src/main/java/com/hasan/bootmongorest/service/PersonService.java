package com.hasan.bootmongorest.service;

import com.hasan.bootmongorest.collection.Person;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonService {
    Person save(Person person);

    List<Person> getPersonStartWith(String name);

    void deletePerson(String id);
}
