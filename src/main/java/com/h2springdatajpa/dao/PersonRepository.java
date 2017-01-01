package com.h2springdatajpa.dao;

import com.h2springdatajpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by choukTutos on 18/12/2016.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
