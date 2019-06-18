package com.idyoudo.springboot.advance;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class IdyoudoRunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdyoudoRunnerApplication.class,args) ;
    }
}

@Component
class IdyoudoApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List argLists = Arrays.asList(args.getSourceArgs()) ;
        System.out.println(" [SpringApplication - ApplicationRunner ]  input arguments :  " + argLists);
    }
}

@Component
class IdyoudoCommandRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List argLists = Arrays.asList(args) ;
        System.out.println(" [SpringApplication - CommandLineRunner ] input arguments :  " + argLists);
    }
}

