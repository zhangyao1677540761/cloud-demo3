package com.zy.controller;

import com.zy.service.UseService;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @学习小结
 */
@RestController
public class UseController {
    @Autowired
    UseService useService;

    @GetMapping("/use/server")
    public String  Message() throws InterruptedException {
     //   TimeUnit.SECONDS.sleep(RandomUtils.nextInt(5)+1);
        return useService.getServer();
    }

}