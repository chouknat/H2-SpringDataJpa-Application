package com.h2springdatajpa.service.imp;

import com.h2springdatajpa.aop.LogExecutionTime;
import com.h2springdatajpa.dao.PersonRepository;
import com.h2springdatajpa.model.Person;
import com.h2springdatajpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by a576097 on 10/06/2017.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @LogExecutionTime
    @Override
    public List<Person> getPersonByFirstName(String firstName) throws InterruptedException {
        Thread.sleep(10);
        return personRepository.findPersonByFirstName(firstName);
    }
}
