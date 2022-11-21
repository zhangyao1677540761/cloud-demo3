package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @学习小结
 */
@EnableHystrix//开启熔断支持
@SpringBootApplication
@EnableDiscoveryClient   //开启服务发现客户端,别的注册中心也支持
//@EnableEurekaClient 只支持eureka
public class DeptServerStart{
    public static void main(String[] args) {
        SpringApplication.run(DeptServerStart.class, args);
    }



}

