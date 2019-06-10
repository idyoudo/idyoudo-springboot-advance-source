package com.idyoudo.springboot.application.spring;

import com.idyoudo.advance.sfl.driver.Driver;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

public class SpringApplication {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        List<String> drivers = SpringFactoriesLoader.loadFactoryNames(Driver.class,classLoader);

        for(String driver : drivers){
            System.out.println(driver);
        }

    }
}
