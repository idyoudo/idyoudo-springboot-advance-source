package com.idyoudo.springboot.springevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * 自定义容器启动成功事件，该事件的作用和ContextRefreshedEvent一样，区别是：一个是容器级事件，一个是业务级事件
 */
public class ApplicationContainerFinishedEvent extends ApplicationContextEvent {

    public ApplicationContainerFinishedEvent(ApplicationContext source) {
        super(source);
    }

}
