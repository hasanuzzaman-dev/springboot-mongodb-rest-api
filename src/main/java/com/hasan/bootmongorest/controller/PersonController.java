package com.hasan.bootmongorest.controller;

import com.hasan.bootmongorest.collection.Person;
import com.hasan.bootmongorest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/add-person")
    public Person addPerson(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping("/start-with")
    public List<Person> getPersonStartWith(@RequestParam("name") String name){
        return personService.getPersonStartWith(name);
    }
}
