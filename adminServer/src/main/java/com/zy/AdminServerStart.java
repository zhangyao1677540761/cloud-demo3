package com.zy;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerStart{
    public static void main(String[] args) {
        SpringApplication.run(AdminServerStart.class,args);
    }
}
