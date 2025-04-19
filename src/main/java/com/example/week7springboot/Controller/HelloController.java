package com.example.week7springboot.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // PUT method using path variable and query parameter
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
