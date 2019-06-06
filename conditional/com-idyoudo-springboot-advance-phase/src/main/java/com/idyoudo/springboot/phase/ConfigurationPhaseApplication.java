package com.idyoudo.springboot.phase;

import com.idyoudo.springboot.phase.conditional.ParseConditionalOnClazz;
import com.idyoudo.springboot.phase.conditional.RegisterConditionalOnClazz;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

public class ConfigurationPhaseApplication {

    public static void main(String[] args) {

        loadConditionalBean(BeanA.class) ;
        loadConditionalBean(BeanA.class,BeanB.class) ;
        loadConditionalBean(BeanB.class) ;
        loadConditionalBean(BeanB.class,BeanA.class) ;
    }

    private static void loadConditionalBean(Class... registryClasses) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(registryClasses);
        context.refresh();

        System.out.println("loadConditionalBean(" + Arrays.asList(registryClasses) +" )");
        System.out.println(" has beanA : " +  context.containsBean("beanA") );
        System.out.println(" has beanB : " +  context.containsBean("beanB") );
//        context.close();
        System.out.println("-----------------------------------------------------");
    }

}

@Configuration
@Qualifier("beanA")
class BeanA { }

@Configuration
@Qualifier("beanB")
@RegisterConditionalOnClazz(dependClass=BeanA.class)
class BeanB { }