package com.idyoudo.springboot.application.springboot.autoconfiguration;

import com.idyoudo.advance.sfl.driver.Driver;
import com.idyoudo.advance.sfl.driver.db2.Db2Driver;
import com.idyoudo.advance.sfl.driver.mysql.DeprecatedMysqlDriver;
import com.idyoudo.advance.sfl.driver.mysql.MysqlDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverAutoConfiguration {

    @Bean
    public Driver mysqlDriver(){
        return new MysqlDriver();
    }

    @Bean
    public Driver deprecatedMysqlDriver(){
        return new DeprecatedMysqlDriver();
    }

    @Bean
    public Driver db2Driver(){
        return new Db2Driver();
    }
}
