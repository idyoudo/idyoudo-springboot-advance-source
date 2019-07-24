package com.idyoudo.springboot.advance.configfile.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 季节类
 */
@Component
public class Season {

    // 季节类别: spring、summer、autumn、winter
    @Value("${com.season.seasonType}")
    private String seasonType ;

    // 温度
    @Value("${com.season.temperature}")
    private String  temperature ;

    public String getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(String seasonType) {
        this.seasonType = seasonType;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "[ "+getSeasonType() + " ] " + " temperature is  : " + " [ " + getTemperature() + " ] ";
    }
}
