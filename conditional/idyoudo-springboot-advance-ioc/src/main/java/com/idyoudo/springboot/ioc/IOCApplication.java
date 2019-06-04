package com.idyoudo.springboot.ioc;

import com.idyoudo.springboot.ioc.controller.IOCController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class IOCApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext  applicationContext =  SpringApplication.run(IOCApplication.class, args);

        ConfigurableListableBeanFactory configurableListableBeanFactory = applicationContext.getBeanFactory();

        SimpleDateFormat simpleDateFormat = configurableListableBeanFactory.getBean(SimpleDateFormat.class) ;
        IOCController iocController = configurableListableBeanFactory.getBean(IOCController.class) ;

        // 从当前容器中获取普通的java bean：simpleDateFormat和获取控制器IOCController

        System.out.println("simpleDateFormat:" + simpleDateFormat.getClass().getName());
        System.out.println("iocController:" + iocController.getClass().getName());

        // 获取父容器，调用toString()方法，报空指针异常
        BeanFactory parentBeanFactory = configurableListableBeanFactory.getParentBeanFactory();

        System.out.println("parentBeanFactory:" + parentBeanFactory.toString());


    }

}