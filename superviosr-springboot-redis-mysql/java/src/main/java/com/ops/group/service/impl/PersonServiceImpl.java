package com.ops.group.service.impl;

import com.ops.group.mapper.PersonRepository;
import com.ops.group.pojo.Person;
import com.ops.group.pojo.PersonMovie;
import com.ops.group.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public List<PersonMovie> getPersonMoviesbyName(String name) {
        return personRepository.getPersonMoviesbyName(name);
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return personRepository.getPersonByName(name);
    }
}
