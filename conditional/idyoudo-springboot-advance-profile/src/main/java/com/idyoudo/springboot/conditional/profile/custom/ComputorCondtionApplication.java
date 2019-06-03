package com.idyoudo.springboot.conditional.profile.custom;

import com.idyoudo.springboot.conditional.profile.bean.Computor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.idyoudo.springboot.conditional.profile.custom","com.idyoudo.springboot.conditional.profile.bean"})
public class ComputorCondtionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ComputorCondtionApplication.class, args);
        System.out.println(System.getProperty("os.name"));
        Computor bean = run.getBean(Computor.class);
        bean.print();
    }
}