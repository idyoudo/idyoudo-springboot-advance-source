package com.idyoudo.springboot.advance.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@Order(10)
public class ContextNameApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        String contextDisplayName = applicationContext.getDisplayName();
        System.out.println("容器的名称为：" + contextDisplayName);
    }

}
