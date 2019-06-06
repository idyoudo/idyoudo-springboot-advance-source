package com.idyoudo.springboot.phase.conditional;

import com.idyoudo.springboot.phase.condition.OnClazzParseCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnClazzParseCondition.class)
public @interface ParseConditionalOnClazz {

    public Class dependClass();

}
