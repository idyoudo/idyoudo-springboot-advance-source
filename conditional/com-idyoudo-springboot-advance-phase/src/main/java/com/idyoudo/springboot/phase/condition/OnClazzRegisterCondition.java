package com.idyoudo.springboot.phase.condition;

import com.idyoudo.springboot.phase.conditional.RegisterConditionalOnClazz;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnClazzRegisterCondition extends SpringBootCondition implements ConfigurationCondition {
    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map attribute = metadata.getAnnotationAttributes(RegisterConditionalOnClazz.class.getName()) ;
        Class clazz = (Class)attribute.get("dependClass");

        boolean matchResult =  false;
        try{
            Object findClassBean = context.getBeanFactory().getBean(clazz) ;
            matchResult = findClassBean!=null;
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            matchResult = false;
        }
//        System.out.println("matchResult:" + matchResult);
        return new ConditionOutcome(matchResult, clazz.getName() );
    }

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN;
    }

}
