package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @学习小结
 */
//@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients//开启feign支持
//加上@EnableCircuitBreaker注解之后，就可以使用断路器功能
@SpringCloudApplication
//提供@SpringBootApplication,自动注册,断路器的功能
public class UseServerStart{
    public static void main(String[] args) {
        SpringApplication.run(UseServerStart.class, args);
    }
//    /**
//     *此配置是为了服务监控而配置，与服务容错本身无关，springcloud升级后的坑
//     *ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"，
//     *只要在自己的项目里配置上下面的servlet就可以了
//     */
//    @Bean
//    public ServletRegistrationBean getServlet() {
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/hystrix.stream");
//        registrationBean.setName("HystrixMetricsStreamServlet");
//        return registrationBean;
//    }
}