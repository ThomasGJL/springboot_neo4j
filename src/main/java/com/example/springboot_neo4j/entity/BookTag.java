package com.example.springboot_neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@NodeEntity(label = "BookTag")
public class BookTag {

    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String tag_name;

}
