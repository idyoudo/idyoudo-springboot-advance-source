package com.idyoudo.springboot.springbootevent.ApplicationFailedEventPackage;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class IdyoudoApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        System.out.println( "ApplicationFailedEvent 事件测试 。。。");
        // 获取异常对象
        Throwable throwable = event.getException().getCause();

        if(throwable!=null && throwable instanceof IdyoudoException){
            exceptionHandle((IdyoudoException)throwable);
        }else{
            System.out.println("执行异常，未知类型，请检查");
        }
    }

    /*处理异常*/
    protected void exceptionHandle(IdyoudoException idyoudoException ) {
        System.out.println("捕获IdyoudoException类型异常，重要程度【高】，发送业务人员，立即排查");
    }
}
