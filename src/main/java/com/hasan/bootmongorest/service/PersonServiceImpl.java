package com.hasan.bootmongorest.service;

import com.hasan.bootmongorest.collection.Person;
import com.hasan.bootmongorest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getPersonStartWith(String name) {
        return personRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}
