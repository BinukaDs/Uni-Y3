package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Helloooo";
    }

    @GetMapping("/status")
    public String status() {
        return "Spring Boot is working!";
    }

    @GetMapping("/goodbye")
    public String bye() {
        return "goodbye from IIT!";
    }
}
