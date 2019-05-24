package com.idyoudo.springboot.springevent;

 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.context.ApplicationListener;

/**
 * 自定义事件监听器
 *
 * 硬编码方式：实现ApplicationListener接口，同时指定监听事件的类型
 */
public class ApplicationRegisterZKListener implements ApplicationListener<ApplicationContainerFinishedEvent> {
    private Logger logger = LoggerFactory.getLogger(this.getClass()) ;
    @Override
    public void onApplicationEvent(ApplicationContainerFinishedEvent event) {
        logger.info("服务启动成功，向zk注册服务临时节点，该服务成功上线");
    }

}
