package com.idyoudo.springboot.application.springboot;


import com.idyoudo.advance.sfl.driver.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class SpringBootSLFApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext =  SpringApplication.run(SpringBootSLFApplication.class,args) ;

        Map<String, Driver>  drivers = applicationContext.getBeansOfType(Driver.class) ;
        for(String key : drivers.keySet()){
            System.out.println(key + " = " + drivers.get(key));
        }

    }
}
