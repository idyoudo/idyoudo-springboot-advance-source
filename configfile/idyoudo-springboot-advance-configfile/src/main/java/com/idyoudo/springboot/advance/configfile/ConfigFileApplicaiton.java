package com.idyoudo.springboot.advance.configfile;

import com.idyoudo.springboot.advance.configfile.prop.Season;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@SpringBootApplication
public class ConfigFileApplicaiton {

    public static void main(String[] args) throws Exception {

       ApplicationContext applicationContext = SpringApplication.run(ConfigFileApplicaiton.class,args) ;

        Season season =  applicationContext.getBean(Season.class) ;

        System.out.println(season.toString());

        String filePath = "file:./application.properties";

        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource(filePath);

        System.out.println(resource.exists());
        System.out.println(resource.getURL());

    }

}
