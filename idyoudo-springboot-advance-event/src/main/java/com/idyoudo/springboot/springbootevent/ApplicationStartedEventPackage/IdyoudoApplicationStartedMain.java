package com.idyoudo.springboot.springbootevent.ApplicationStartedEventPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.idyoudo.springboot.springbootevent.ApplicationStartedEventPackage"})
public class IdyoudoApplicationStartedMain {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(IdyoudoApplicationStartedMain.class);
        app.addListeners(new IdyoudoApplicationStartedEventListener());
        app.run(args);
    }
}
