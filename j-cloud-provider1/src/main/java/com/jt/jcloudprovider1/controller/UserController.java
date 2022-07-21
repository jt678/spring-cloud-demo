package com.jt.jcloudprovider1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 *
 * @Author: jt
 * @Date: 2022/7/21 14:58
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @GetMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "hello,I'm provider 1!";
    }

    @GetMapping("/sayHi")
    @ResponseBody
    public String sayHi(){
        return "hi,I'm provider 1!";
    }

    @GetMapping("/sayHaha")
    @ResponseBody
    public String sayHaha(){
        return "haha,I'm provider 1!";
    }

}
