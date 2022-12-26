package com.mingming.homework.elmproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author h
 */
@SpringBootApplication
@MapperScan("com.mingming.homework.elmproject.mapper")
@ServletComponentScan
public class ElmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElmProjectApplication.class, args);
    }

}
