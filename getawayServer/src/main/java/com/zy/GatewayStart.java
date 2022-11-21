package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @学习小结
 */


@SpringBootApplication
@EnableEurekaClient// 启动 eureka 客户端
public class GatewayStart{
    public static void main(String[] args) {
        SpringApplication.run(GatewayStart.class, args);
    }

}
