package com.idyoudo.springboot.advance.conditionalonclass.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.sql.DataSource;

@Configuration
@Order(1)
public class ConditionBeanConfig {

    @Bean
    @ConditionalOnClass(China.class)
    public Huawei huaweiWithValue(){
        System.out.println("huaweiWithValue docreate ... ... ");
        return new Huawei();
    }

    @Bean
    @ConditionalOnClass(name="com.idyoudo.springboot.advance.conditionalonclass.config.China")
    public Huawei huaweiWithName(){
        System.out.println("huaweiWithName docreate ... ... ");
        return new Huawei();
    }

    @Bean
    @ConditionalOnClass(DataSource.class)
    public Huawei huaweiWithDatasource(){
        System.out.println("huaweiWithDatasource docreate ... ... ");
        return new Huawei();
    }


    @Bean
    @ConditionalOnClass(name="org.springframework.web.servlet.DispatcherServlet")
    public Huawei huaweiWithServletName(){
        System.out.println("huaweiWithServletName docreate ... ... ");
        return new Huawei();
    }

    @Bean
    @ConditionalOnClass(value = China.class,name="org.springframework.web.servlet.DispatcherServlet")
    public Huawei huaweiWithTwoProps(){
        System.out.println("huaweiWithTwoProps docreate ... ... ");
        return new Huawei();
    }


}