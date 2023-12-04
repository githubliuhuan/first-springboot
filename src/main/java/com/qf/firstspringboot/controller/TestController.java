package com.qf.firstspringboot.controller;

import com.qf.firstspringboot.entity.User;
import com.qf.firstspringboot.properties.AliyunProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haun
 * @version 1.0.0
 * @date 2023/12/2 23:07
 */

@RestController
public class TestController {

    @Autowired
    private User user;

    @GetMapping("/test")
    public String test(){
        return "Hello SpringBoot!";

    }

    @GetMapping("/user")
    public User user(){
        return user;
    }

    @Value("${picPath}")
    private String picPath;

    @GetMapping("/picPath")
    public String picPath(){
        return picPath;
    }


    @Autowired
    private AliyunProperties properties;

    @GetMapping("/aliyun")
    public AliyunProperties aliyun(){
        return properties;
    }
}
