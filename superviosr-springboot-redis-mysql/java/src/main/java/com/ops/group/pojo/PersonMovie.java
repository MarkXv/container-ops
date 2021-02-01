package com.ops.group.pojo;

import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Set;

@QueryResult
public class PersonMovie {

    private Person person;

    private Set<Movie> movies;
}
