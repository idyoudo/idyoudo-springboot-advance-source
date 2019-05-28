package com.idyoudo.springboot.advance.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@Order(11)
public class BeanCountApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    //此时容器已经将所有定义的bean封装成BeanDefinition对象
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println("ioc容器中有"+beanDefinitionCount + "个BeanDefinition对象");
    }

}
