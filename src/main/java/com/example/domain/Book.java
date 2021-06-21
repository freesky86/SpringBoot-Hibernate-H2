package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * refer to https://www.baeldung.com/spring-boot-hibernate
 * 
 * when Spring Boot start, Book table will be created automatically as there is a @Entity annotation. 
 * Then it will run import.sql under src/main/resources folder to insert data.
 * 
 * @author freesky
 */
@Entity
// @Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Book() {
        id = 0L;
        name = "";
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
