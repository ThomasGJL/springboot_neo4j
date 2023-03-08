package com.example.springboot_neo4j.controller;

import com.example.springboot_neo4j.entity.Book;
import com.example.springboot_neo4j.entity.BookRelation;
import com.example.springboot_neo4j.entity.BookTag;
import com.example.springboot_neo4j.repository.BookRelationRepository;
import com.example.springboot_neo4j.repository.BookRepository;
import com.example.springboot_neo4j.repository.BookTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookTagRepository bookTagRepository;

    @Autowired
    private BookRelationRepository bookRelationRepository;

    @RequestMapping("/addBook")
    public Book addPerson() {

        Book book = new Book();
        book.setName("两京十五日");
        book.setAuthor("马伯庸");
        return bookRepository.save(book);

    }

    @RequestMapping("/addBookRelation")
    public void addBookRelation(){
        Book book = new Book();
        book.setName("长安十二时辰");
        book.setAuthor("马伯庸");
        book.setId(3L);

        BookTag bookTag = new BookTag();
        bookTag.setTag_name("历史");
        bookTag.setId(1L);

        Book book3 = bookRepository.save(book);
        BookTag bookTag1 = bookTagRepository.save(bookTag);

        BookRelation bookRelation= new BookRelation(book3, bookTag1, "属于");
        bookRelationRepository.save(bookRelation);

    }



}
