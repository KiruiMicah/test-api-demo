package com.micronisa.testapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
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
        return  "Apis deployed successfully on kubenetes -REDHAT OPENSHIFT";
    }
    @GetMapping("/test")
    public ApiResponse Test(){

        ApiResponse response= new ApiResponse();

        response.setMessage("Success");
        response.setStatuscode(String.valueOf(200));
        response.setStatus(HttpStatus.OK.name());
        return response;
    }
}
