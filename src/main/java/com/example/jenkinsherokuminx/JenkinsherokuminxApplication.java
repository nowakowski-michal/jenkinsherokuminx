package com.example.jenkinsherokuminx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsherokuminxApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsherokuminxApplication.class, args);
    }

    @GetMapping
    public String get(){
        return "Hello Jenkins mn";
    }
}
