package com.idyoudo.springboot.conditional.profile.profile02;

import com.idyoudo.springboot.conditional.profile.bean.Computor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Profile02Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(Profile02Application.class) ;

        Computor computor = applicationContext.getBean(Computor.class) ;

        computor.print();
    }

}
