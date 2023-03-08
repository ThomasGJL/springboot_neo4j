package com.example.springboot_neo4j.repository;

import com.example.springboot_neo4j.entity.BookTag;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BookTagRepository extends Neo4jRepository<BookTag, Long> {
}
