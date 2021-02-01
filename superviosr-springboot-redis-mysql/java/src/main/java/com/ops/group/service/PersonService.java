package com.ops.group.service;

import com.ops.group.pojo.Person;
import com.ops.group.pojo.PersonMovie;

import java.util.List;

public interface PersonService {
    List<PersonMovie> getPersonMoviesbyName(String name);

    List<Person> getPersonByName(String name);
}
