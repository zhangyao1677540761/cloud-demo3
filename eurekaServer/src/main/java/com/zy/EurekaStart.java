package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableEurekaServer   //开启eureka服务
public class EurekaStart{
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class,args);
    }
}