package com.idyoudo.springboot.springbootcondition.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.idyoudo.springboot.springbootcondition.example"})
public class SpringBootCondtionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCondtionApplication.class, args);
    }

}