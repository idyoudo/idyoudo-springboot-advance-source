package com.idyoudo.springboot.javaevent;

import java.util.EventObject;

/**
 * 事件类，封装了事件源，描述了事件的相关信息
 *
 * 谷歌中断与华为合作事件
 *
 */
public class GoogleInterruptedHwCoopEvent extends EventObject {
    private Object eventSource;//事件源


    public GoogleInterruptedHwCoopEvent(Object source) {
        super(source);
        this.eventSource = source;
    }

}
