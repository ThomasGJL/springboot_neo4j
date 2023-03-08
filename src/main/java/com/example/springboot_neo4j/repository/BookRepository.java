package com.example.springboot_neo4j.repository;

import com.example.springboot_neo4j.entity.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends Neo4jRepository<Book, Long> {

    @Query("MATCH p =(n:Person)-[r:FRIEND]->(m:Person) WHERE m.name=$name RETURN n")
    List<Book> findFriendByPerson(String name);
    /**
     * 根据名字查找
     * @param name
     * @return
     */
    Book findByName(String name);
}
