package com.imooc.luckymoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//项目启动注解
//@EnableConfigurationProperties({ LimitConfig.class })
@SpringBootApplication
public class LuckymoneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckymoneyApplication.class, args);
    }

}
