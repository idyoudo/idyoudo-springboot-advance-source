package com.idyoudo.springboot.advance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class IdyoudoFailureAnlyzerApplication {

    @Resource
    private SimpleDateFormat dateFormat = null;

    public static void main(String[] args) {

        SpringApplication.run(IdyoudoFailureAnlyzerApplication.class,args) ;
    }
}