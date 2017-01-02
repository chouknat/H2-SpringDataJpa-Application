package com.h2springdatajpa.dao;

import com.h2springdatajpa.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by choukTutos on 18/12/2016.
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
