package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.domain", "com.example.service", "com.example.restservice", "com.example.listener" })
public class MyApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MyApplication.class, args);
        Object bean = ctx.getBean("bookService");
        System.err.println(bean);
        bean = ctx.getBean("bookRepository");
        System.err.println(bean);

    }
}
