package com.example.springboot_neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@RelationshipEntity(type ="BelongTo")
public class BookRelation {

    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String relation;

    @StartNode
    private Book book;

    @EndNode
    private BookTag bookTag;

    public BookRelation(Book book, BookTag bookTag, String relation) {
        this.book = book;
        this.bookTag = bookTag;
        this.relation = relation;
    }

}
