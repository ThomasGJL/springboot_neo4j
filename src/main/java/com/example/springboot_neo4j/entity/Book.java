package com.example.springboot_neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@NodeEntity(label = "Book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;

    @Property
    private String author;


}
