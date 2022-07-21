package com.jt.jcloudconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;

/**
 * HelloController
 *
 * @Author: jt
 * @Date: 2022/7/21 15:17
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(){

        //指明服务地址----->http://{服务提供者应用名称}/{具体的接口路径}
        String url = "http://provider-user-jt/user/sayHello";
        //获取返回对象
        String returnObj = restTemplate.getForObject(url, String.class);
        //获取返回实体
//        restTemplate.getForEntity(url,Demo.class);
        return returnObj;
    }
    @GetMapping("/hi")
    public String hi(){
        //指明服务地址----->http://{服务提供者应用名称}/{具体的接口路径}
        String url = "http://provider-user-jt/user/sayHi";
        //获取返回对象
        String returnObj = restTemplate.getForObject(url, String.class);
        return returnObj;
    }

    @GetMapping("/haha")
    public String haha(){
        //指明服务地址----->http://{服务提供者应用名称}/{具体的接口路径}
        String url = "http://provider-user-jt/user/sayHaha";
        //获取返回对象
        String returnObj = restTemplate.getForObject(url, String.class);
        return returnObj;
    }
}
