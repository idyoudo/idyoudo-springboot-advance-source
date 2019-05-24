package com.idyoudo.springboot.javaevent;

import java.util.EventListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 事件源，该事件是Google发出的，事件源不需要实现指定接口，但是要给事件源注册监听器
 */
public class GoogleEventSource {
    /**
     * 给事件源起一个名字
     */
    private String sourceName  = "Google" ;

    private Set<EventListener> listeners = null;

    public GoogleEventSource(){
        this.sourceName = "Google";
        this.listeners = new HashSet<EventListener>();
    }

    // 给事件源注册监听器
    public void addEventListener(EventListener eventListener){
        listeners.add(eventListener) ;
    }

    //当Google发出禁止合作事件后,通知注册在该事件源上的所有监听器做出相应的反应
    protected void notifies(){
        Iterator<EventListener> iterator = this.listeners.iterator();
        while(iterator.hasNext()){
            HwEventListener hwEventListener = (HwEventListener)iterator.next();
            hwEventListener.done(new GoogleInterruptedHwCoopEvent(this));
        }
    }

    // 模拟事件被触发，假设Google开新闻发布会，触发事件
    public void GoogleOpenPressConference(){
        System.out.println(sourceName + " 召开新闻发布会，吸引了华为的注意力，触发监听（注意：此监听非彼监听！）");
        notifies();
    }

}
