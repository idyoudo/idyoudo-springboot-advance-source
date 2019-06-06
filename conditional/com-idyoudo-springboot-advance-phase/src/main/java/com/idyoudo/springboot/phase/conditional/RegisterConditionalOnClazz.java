package com.idyoudo.springboot.phase.conditional;

import com.idyoudo.springboot.phase.condition.OnClazzRegisterCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnClazzRegisterCondition.class)
public @interface RegisterConditionalOnClazz {

    public Class dependClass();

}
