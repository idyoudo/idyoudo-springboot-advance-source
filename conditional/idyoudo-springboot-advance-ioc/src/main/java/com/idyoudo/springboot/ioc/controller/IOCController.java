package com.idyoudo.springboot.ioc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class IOCController {
    @RequestMapping(name="/ioc", method= {RequestMethod.POST,RequestMethod.GET})
    public String container() throws IOException {

        return "i am springboot web container,only on ioc container";
    }
}
