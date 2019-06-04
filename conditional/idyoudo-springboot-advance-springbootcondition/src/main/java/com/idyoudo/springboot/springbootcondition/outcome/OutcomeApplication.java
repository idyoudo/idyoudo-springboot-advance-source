package com.idyoudo.springboot.springbootcondition.outcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.idyoudo.springboot.springbootcondition.outcome"})
public class OutcomeApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(OutcomeApplication.class, args);

        String os = context.getEnvironment().getProperty("os.name") ;
        System.out.println("os : " + os);

        ConditionOutcome outCome = new ConditionOutcome("Mac OS X".equals(os), "computer.os=" + os);

        System.out.println("outCome.isMatch:" + outCome.isMatch());
        System.out.println("outCome.getMessage:" + outCome.getMessage());
    }

}