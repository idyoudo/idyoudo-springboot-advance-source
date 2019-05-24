package com.idyoudo.springboot.springbootevent.ApplicationFailedEventPackage;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.idyoudo.springboot.springbootevent.ApplicationFailedEventPackage"})
public class IdyoudoApplicationFailedMain implements InitializingBean {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(IdyoudoApplicationFailedMain.class);

        app.addListeners(new IdyoudoApplicationFailedEventListener());

        app.run(args);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        throw new IdyoudoException("idyoudo异常，服务中断");
    }
}
