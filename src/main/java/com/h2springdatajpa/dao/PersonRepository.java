package com.h2springdatajpa.dao;

import com.h2springdatajpa.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chouknat on 18/12/2016.
 */
@Service
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

    List<Person> findPersonByFirstName(String name);
}
