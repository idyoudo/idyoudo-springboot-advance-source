package com.idyoudo.springboot.springbootevent.ApplicationStartingEventPackage;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class IdyoudoApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println( "ApplicationStartingEvent 事件测试 。。。");

        SpringApplication app = event.getSpringApplication();
        // 不显示banner信息
        app.setBannerMode(Banner.Mode.OFF);
    }
}
