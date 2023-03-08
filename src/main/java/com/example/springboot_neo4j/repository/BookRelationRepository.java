package com.example.springboot_neo4j.repository;

import com.example.springboot_neo4j.entity.BookRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BookRelationRepository extends Neo4jRepository<BookRelation, Long> {


}
