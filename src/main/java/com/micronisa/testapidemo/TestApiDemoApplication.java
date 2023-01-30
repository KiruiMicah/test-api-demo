package com.micronisa.testapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class TestApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApiDemoApplication.class, args);
    }


    @GetMapping("/")
    public  String goHome(){
        return  "Api deployed sucessfully!";
    }
}
