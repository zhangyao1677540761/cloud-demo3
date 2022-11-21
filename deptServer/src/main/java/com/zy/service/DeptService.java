package com.zy.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @学习小结
 */
@Service
public class DeptService {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String ServerName;

    @HystrixCommand(fallbackMethod = "fallback1",
//            threadPoolProperties = {
//                    @HystrixProperty(name = "coreSize", value = "10"),  //舱壁模式,线程池有10个
//                    @HystrixProperty(name = "maxQueueSize", value = "20")   //队列等待10个
//            },
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启熔断器
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期ms
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),//失败率多少开启
            }
    )
    public String getServer() {
        return ServerName + "端口" + port;
    }

    public String fallback1() {
        return "UseService服务降级方法";
    }
}
