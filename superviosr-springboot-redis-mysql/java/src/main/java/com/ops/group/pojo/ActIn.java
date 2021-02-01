package com.ops.group.pojo;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "ACTED_IN")
public class ActIn {

    @GraphId
    private Long id;

    @Property
    private String role;

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;
}
