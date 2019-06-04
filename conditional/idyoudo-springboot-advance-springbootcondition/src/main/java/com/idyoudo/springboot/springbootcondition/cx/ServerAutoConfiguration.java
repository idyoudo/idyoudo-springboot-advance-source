package com.idyoudo.springboot.springbootcondition.cx;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerAutoConfiguration {

    @Configuration
    @ConditionalOnBean(Teacher.class)
    public static class StudentAutoConfiguration {
        @Bean
        public Student student() {
            System.out.println("student create....");
            return new Student();
        }
    }

    @Configuration
    public static class TeacherAutoConfiguration {
        @Bean
        public Teacher teacher() {
            System.out.println("teacher create.....");
            return new Teacher();
        }
    }
}

class Teacher{}
class Student{}


