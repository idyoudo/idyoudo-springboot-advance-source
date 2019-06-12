package com.idyoudo.springboot.advance.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdyoudoLoggerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(IdyoudoLoggerApplication.class);
        app.run(args);
    }
}
