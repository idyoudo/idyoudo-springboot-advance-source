package com.idyoudo.springboot.springevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;

/**
 *  注解式：doApplicationEvent方法上使用@EventListener注解，方法参数处指定监听ApplicationContainerFinishedEvent事件
 */
public class ApplicationContainerFinishedEventHandler  {

    private Logger logger = LoggerFactory.getLogger(this.getClass()) ;

    @EventListener
    public void doApplicationEvent(ApplicationContainerFinishedEvent event) {
        logger.info("服务启动成功，向zk注册服务临时节点，该服务成功上线");
    }

}
