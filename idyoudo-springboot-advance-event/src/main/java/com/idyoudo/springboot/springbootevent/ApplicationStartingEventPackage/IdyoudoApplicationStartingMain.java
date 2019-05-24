package com.idyoudo.springboot.springbootevent.ApplicationStartingEventPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.idyoudo.springboot.springbootevent.ApplicationStartingEventPackage"})
public class IdyoudoApplicationStartingMain {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(IdyoudoApplicationStartingMain.class);
        // 不添加你该监听器会打印banner信息
        app.addListeners(new IdyoudoApplicationStartingEventListener());
        app.run(args);
    }


}
