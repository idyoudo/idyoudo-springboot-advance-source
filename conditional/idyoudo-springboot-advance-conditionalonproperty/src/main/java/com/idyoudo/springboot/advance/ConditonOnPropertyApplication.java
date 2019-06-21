package com.idyoudo.springboot.advance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

@SpringBootApplication
public class ConditonOnPropertyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConditonOnPropertyApplication.class,args) ;
    }
}

@Configuration
@ConditionalOnProperty(prefix = "idyoudo.classloader",name = {"enabled"},havingValue = "true",matchIfMissing = false)
// matchIfMissing只针对name或者value有效，与是否匹配havingValue无关，且如果matchIfMissing为false，name或者value属性不存在，运行时不会报错
class CustomClassLoaderAutoConfigration{

    @Bean
    public ClassLoader customerClassloader() throws MalformedURLException {
        System.out.println(" customerClassloader ... ...");
        URL[] urls = new URL[]{new URL("https://github.com")} ;
        return new URLClassLoader(urls,null) ;
    }

}