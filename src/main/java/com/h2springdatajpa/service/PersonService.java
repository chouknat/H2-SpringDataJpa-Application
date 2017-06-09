package com.h2springdatajpa.service;

import com.h2springdatajpa.model.Person;

import java.util.List;

/**
 * Created by a576097 on 10/06/2017.
 */
public interface PersonService {

    List<Person> getPersonByFirstName(String firstName) throws InterruptedException;

}
