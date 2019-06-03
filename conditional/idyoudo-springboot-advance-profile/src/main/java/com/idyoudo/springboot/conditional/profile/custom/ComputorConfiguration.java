package com.idyoudo.springboot.conditional.profile.custom;

import com.idyoudo.springboot.conditional.profile.bean.Computor;
import com.idyoudo.springboot.conditional.profile.bean.LinuxComputor;
import com.idyoudo.springboot.conditional.profile.bean.MacComputor;
import com.idyoudo.springboot.conditional.profile.bean.WindowComputor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 条件配置类
 */
@Configuration
public class ComputorConfiguration {

    /**
     * 只有满足WindowsCondition条件之后创建一个bean。
     *
     * @return
     */
    @Bean
    @Conditional(WindowsCondition.class)
    public Computor windowComputor() {
        return new WindowComputor();
    }


    /**
     * 只有满足mac条件之后创建一个bean。
     *
     * @return
     */
    @Bean
    @Conditional(MacCondition.class)
    public Computor macComputor() {
        return new MacComputor();
    }


    @Bean
    @Conditional(LinuxCondition.class)
    public Computor linuxComputor() {
        return new LinuxComputor();
    }
}