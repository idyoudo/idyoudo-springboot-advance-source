package com.idyoudo.springboot.springbootcondition.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Calendar;

@Configuration
@Order(0)
public class SpringBootCondtionConfigration_Method {

    @Bean
    @ConditionalOnMissingBean(Calendar.class)
    public Calendar calendar() {
        return Calendar.getInstance();
    }

}
