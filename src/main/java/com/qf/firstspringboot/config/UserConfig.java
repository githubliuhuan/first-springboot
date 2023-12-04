package com.qf.firstspringboot.config;

import com.qf.firstspringboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author haun
 * @version 1.0.0
 * @date 2023/12/2 23:45
 */
@Configuration
public class UserConfig {

    @Bean(name="user")
    public User user(){
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        return user;
    }



}
