package com.idyoudo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// http://localhost:8080/container

@SpringBootApplication
public class ContainerWebDeployApplication  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ContainerWebDeployApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ContainerWebDeployApplication.class, args);
    }
}
