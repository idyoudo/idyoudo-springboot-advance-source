package com.idyoudo.springboot.springbootcondition.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.text.SimpleDateFormat;

@Configuration
@Order(0)
@ConditionalOnJava(JavaVersion.EIGHT)
public class SpringBootCondtionConfigration_Class {

    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat();
    }

}
