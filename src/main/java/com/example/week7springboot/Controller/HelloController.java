package com.example.week7springboot.Controller;

import com.example.week7springboot.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import com.example.week7springboot.dto.UserDTO;

@RestController
public class HelloController {

<<<<<<< Updated upstream
    // POST method to receive JSON body and respond with greeting
=======
    // POST method to handle JSON body
>>>>>>> Stashed changes
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
