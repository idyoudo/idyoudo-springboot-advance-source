package com.idyoudo.springboot.springevent;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

public class ApplicationMain {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(ApplicationMain.class);
        //需要把监听器加入到spring容器中
        application.addListeners(new ApplicationRegisterZKListener());

        // 启动容器
        ConfigurableApplicationContext context =  application.run(args);

        //启动完成后，发布事件
        context.publishEvent(new ApplicationContainerFinishedEvent( context ));
    }
}
