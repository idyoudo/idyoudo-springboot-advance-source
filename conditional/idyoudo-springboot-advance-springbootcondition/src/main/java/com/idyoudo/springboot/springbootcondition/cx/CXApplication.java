package com.idyoudo.springboot.springbootcondition.cx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.idyoudo.springboot.springbootcondition.cx"})
public class CXApplication {

    public static void main(String[] args) {
        SpringApplication.run(CXApplication.class, args);
    }

}