package com.zy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @学习小结
 */
@Slf4j
@RestController
public class OrderController {

    @GetMapping("getOrder")
    public String getOrder() {
        log.info("getOrder.execute");
        Date date = new Date();
        // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        log.info("getOrder.resp 记录当前时间：普通时间： {}", time);
        return "admin order cliect hello";
    }
}