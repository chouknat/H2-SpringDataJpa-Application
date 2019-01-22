package com.h2springdatajpa;

import com.h2springdatajpa.dao.PersonRepository;
import com.h2springdatajpa.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.stream.Stream;


@SpringBootApplication
@Slf4j
public class H2SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(H2SpringDataJpaApplication.class, args);
        PersonRepository personRepository = ctx.getBean(PersonRepository.class);
        Stream.of(new Person("Albert", "thomas", 30),
                new Person("Ahmed", "malik", 24),
                new Person("Brad", "pitt", 50))
                .forEach(p -> personRepository.save(p));
        personRepository.findAll().forEach(s -> log.info(s.toString()));
    }


}
