package com.idyoudo.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://localhost:8081/container
@SpringBootApplication
public class ContainerWebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ContainerWebApplication.class) ;
    }
}
