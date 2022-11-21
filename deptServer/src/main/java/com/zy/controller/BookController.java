package com.zy.controller;

import com.zy.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @学习小结
 */
@RestController
public class BookController {
    @Resource
    DeptService DeptService;

    @GetMapping("/dept/server")
    public String  Message(){
        return DeptService.getServer();
    }
}
