package com.idyoudo.springboot.springbootevent.ApplicationStartedEventPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class IdyoudoApplicationStartedEventListener implements ApplicationListener<ApplicationContextEvent> {

    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        System.out.println( "ApplicationStartedEvent 事件测试 。。。");

        ApplicationContext applicationContext = event.getApplicationContext();

        SimpleDateFormat simpleDateFormat = (SimpleDateFormat)applicationContext.getBean("simpleDateFormat");
        System.out.println(simpleDateFormat.format(Calendar.DATE));
    }
}
