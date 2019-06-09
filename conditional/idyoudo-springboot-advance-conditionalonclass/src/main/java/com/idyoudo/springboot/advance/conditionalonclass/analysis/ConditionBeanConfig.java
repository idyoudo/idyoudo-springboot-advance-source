package com.idyoudo.springboot.advance.conditionalonclass.analysis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


@Configuration
@Order(1)
@ConditionalOnClass(China.class)
public class ConditionBeanConfig {

    @Bean
    public Huawei huaweiWithValue(){
        System.out.println("huaweiWithValue docreate ... ... ");
        return new Huawei();
    }
}