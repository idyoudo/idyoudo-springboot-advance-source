package com.idyoudo.springboot.javaevent;

/**
 * 建立一个主类，实质是美国总统特朗普签署了总统令
 */
public class AmericanTramp {

    public static void main(String[] args) {

        /**
         * 创建事件源对象
         */
        GoogleEventSource googleEventSource  = new GoogleEventSource();

        /**
         * 注册监听器
         */
        googleEventSource.addEventListener(new HwEventListener());

        /**
         * 假设”美国总统特朗普签署了总统令“，触发google召开新闻发布会
         */
        googleEventSource.GoogleOpenPressConference();
    }
}
