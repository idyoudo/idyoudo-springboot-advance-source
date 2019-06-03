package com.idyoudo.springboot.conditional.profile.bean;

public class MacComputor implements Computor {

    @Override
    public void print() {
        System.out.println("当前操作系统是Mac！");
    }
    
}