package com.example.week7springboot.Controller;

import com.example.week7springboot.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // POST method to receive JSON body and respond with greeting
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
