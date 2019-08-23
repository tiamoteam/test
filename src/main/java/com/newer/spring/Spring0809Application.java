package com.newer.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.newer.spring.mapper")
@EnableCaching //允许缓存
public class Spring0809Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring0809Application.class, args);
        //qwertyui
    }

    //猪猪猪猪猪
}
