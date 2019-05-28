package com.idyoudo.springboot.advance.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdyoudoApplicationInitializerMain {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(IdyoudoApplicationInitializerMain.class);
        // 编程式注入initializer对象，注入两个ApplicationContextInitializer对象，但order顺序不一样
        app.addInitializers(new BeanCountApplicationContextInitializer());
        app.addInitializers(new ContextNameApplicationContextInitializer());
        app.run(args);
    }
}
