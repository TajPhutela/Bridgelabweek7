package com.example.week7springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation marks this class as a REST Controller
@RestController
public class HelloController {

    // Handle GET request at "/hello" endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
