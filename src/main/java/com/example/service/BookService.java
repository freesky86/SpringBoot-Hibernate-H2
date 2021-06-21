package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.domain.Book;
import com.example.domain.BookRepository;

/**
 * refer to https://www.baeldung.com/spring-boot-hibernate
 * 
 * @author freesky
 */
@Service
@ComponentScan("com.example.domain")
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findByExample(Book book) {
        Example<Book> example = Example.of(book);
        return bookRepository.findAll(example);
    }

    public List<Book> list() {
        return bookRepository.findAll();
    }
}
