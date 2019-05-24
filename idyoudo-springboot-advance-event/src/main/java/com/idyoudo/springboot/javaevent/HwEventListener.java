package com.idyoudo.springboot.javaevent;

import java.util.EventListener;

/**
 * 事件监听器，实现EventListener接口，该接口是一个标识接口，
 * 为此自定义接口Done，实现具体的监听操作
 */
public class HwEventListener implements EventListener,Done {

    @Override
    public void done(GoogleInterruptedHwCoopEvent event) {
        System.out.println("华为海思宣布启动备胎计划,一片欢呼" ) ;
    }

}
