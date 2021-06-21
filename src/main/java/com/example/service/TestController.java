package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("max")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "The Min Test.";
    }
}
