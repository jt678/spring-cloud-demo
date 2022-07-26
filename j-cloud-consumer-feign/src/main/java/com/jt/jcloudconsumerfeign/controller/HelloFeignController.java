package com.jt.jcloudconsumerfeign.controller;

import com.jt.jcloudconsumerfeign.client.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @Author: jt
 * @Date: 2022/7/22 10:26
 */
@RestController
public class HelloFeignController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return userService.sayHello();
    }

    @GetMapping("/hi")
    public String hi(){
        return userService.sayHi();
    }

    @GetMapping("/haha")
    public String haha(){
        return userService.sayHaha();
    }
}
