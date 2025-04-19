package com.example.week7springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Marks this as a REST Controller
@RestController
public class HelloController {

    // GET endpoint to receive a name as query parameter
    @GetMapping("/hello/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}