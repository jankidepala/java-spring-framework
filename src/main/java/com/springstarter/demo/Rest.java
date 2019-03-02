package com.springstarter.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Rest {

    @RequestMapping("/")
    String home() {
        return "Greetings from XX Spring Boot!";
    }
    @RequestMapping("/rix")
    String trix() {
        return "YOYO from Spring Boot!";
    }
    public static void main(String[] args)
    {
        SpringApplication.run(Rest.class, args);
    }
}
