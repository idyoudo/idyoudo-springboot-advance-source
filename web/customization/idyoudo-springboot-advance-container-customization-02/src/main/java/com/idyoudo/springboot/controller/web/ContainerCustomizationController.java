package com.idyoudo.springboot.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ContainerCustomizationController {

    @RequestMapping(name="/container", method= {RequestMethod.POST,RequestMethod.GET})
    public String container() throws IOException {

        return "i am springboot web container,default embedded tomcat.";
    }
}