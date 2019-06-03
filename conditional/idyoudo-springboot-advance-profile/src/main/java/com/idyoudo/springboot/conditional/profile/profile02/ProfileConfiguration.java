package com.idyoudo.springboot.conditional.profile.profile02;

import com.idyoudo.springboot.conditional.profile.bean.Computor;
import com.idyoudo.springboot.conditional.profile.bean.LinuxComputor;
import com.idyoudo.springboot.conditional.profile.bean.MacComputor;
import com.idyoudo.springboot.conditional.profile.bean.WindowComputor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfiguration {

    @Bean
    @Profile("window")
    public Computor windowComputor(){
        return new WindowComputor();
    }

    @Bean
    @Profile("mac")
    public Computor macComputor(){
        return new MacComputor();
    }

    @Bean
    @Profile("linux")
    public Computor linuxComputor(){
        return new LinuxComputor();
    }

}
