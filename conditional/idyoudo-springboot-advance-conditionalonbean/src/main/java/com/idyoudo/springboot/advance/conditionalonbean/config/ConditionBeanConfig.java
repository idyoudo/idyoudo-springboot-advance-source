package com.idyoudo.springboot.advance.conditionalonbean.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionBeanConfig {
    @Bean
    public China china(){ return new China(); }
    @Bean
    public American american(){  return new American(); }

    @Bean  @ConditionalOnBean(China.class)
    public Huawei hwPhone(){
        System.out.println("hwPhone create ...");
        return new Huawei();
    }
    @Bean  @ConditionalOnBean(type={"com.idyoudo.springboot.advance.conditionalonbean.config.American"})
    public Huawei hwInAmerican(){
        System.out.println("hwInAmerican create ...");
        return new Huawei();
    }
    @Bean  @ConditionalOnBean(name = "hwPhone")
    public Huawei hwXiaoLongXinPian(){
        System.out.println("hwXiaoLongXinPian create ...");
        return new Huawei();
    }
    @Bean @ConditionalOnBean(value = {China.class},type={"com.idyoudo.springboot.advance.conditionalonbean.config.American"})
    public Huawei hw5G(){
        System.out.println("hw5G create ...");
        return new Huawei();
    }

    @Bean  @ConditionalOnBean(value = {China.class}, type={"com.idyoudo.springboot.advance.conditionalonbean.config.American"}, name={"hw5G"})
    public Huawei hw5GInAmerican(){
        System.out.println("hw5GInAmerican create ...");
        return new Huawei();
    }

    @Bean @ConditionalOnBean(value = {China.class}, type={"com.idyoudo.springboot.advance.conditionalonbean.config.American"}, name={"nohw5G"})
    public Huawei hw5GInWorld(){
        System.out.println("hw5GInWorld create ...");
        return new Huawei();
    }

    @Bean @ConditionalOnBean(type={"com.idyoudo.springboot.advance.conditionalonbean.config.American"}, name={"nohw5G"})
    public Huawei hw5GInWorld2(){
        System.out.println("nohw5G create ...");
        return new Huawei();
    }
}
class Huawei{}
class China{}
class American{}