package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Book;

/*
 * refer to https://www.baeldung.com/spring-boot-hibernate
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> findAll() {
        return bookService.list();
    }

    @GetMapping("findBook")
    public List<Book> findByExample() {
        Book book = new Book();
        book.setId(1L);
        book.setName("The Tartar Steppe");
        return bookService.findByExample(book);
    }

    @GetMapping("/pp")
    public String pp() {
        return "pp test";
    }

}
