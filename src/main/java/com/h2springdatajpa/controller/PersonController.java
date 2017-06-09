package com.h2springdatajpa.controller;

import com.h2springdatajpa.model.Person;
import com.h2springdatajpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by a576097 on 09/06/2017.
 */
@RestController
@RequestMapping(value = "/api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value="/find-person/{firstName}", method=RequestMethod.GET)
    @ResponseBody
    List<Person> getPersonByFirstName(@PathVariable(value="firstName") String firstName) throws InterruptedException {
        return personService.getPersonByFirstName(firstName);
    }
}
