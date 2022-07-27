package com.jt.jcloudconsumerfeignhystrix.controller;

import com.jt.jcloudconsumerfeignhystrix.client.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @Author: jt
 * @Date: 2022/7/26 14:22
 */
@RestController
public class HelloFeignHystrixController {
    @Autowired
    private UserClient userClient;

    @GetMapping("/hello")
    //调用失败时调用默认返回，demo中现在我们的客户端调用接口实际上不存在，所以这个接口会默认返回下方定义的固定值
    @HystrixCommand(fallbackMethod = "helloFailback")
    public String hello(){
        return userClient.sayHello();
    }

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFailback")
    public String hi(){
        return userClient.sayHi();
    }

    @GetMapping("/haha")
    @HystrixCommand(fallbackMethod = "hahaFailback")
    public String haha(){
        return userClient.sayHaha();
    }

    /**
     *
     *  对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法，熔断后别的服务就不会再调用这个方法
     * @return 失败调用时，返回默认值:
     */
    public String helloFailback(){
        return "这是Hystrix错误返回====hello已经熔断";
    }
    public String hiFailback(){
        return "这是Hystrix错误返回====hi已经熔断";
    }
    public String hahaFailback(){
        return "这是Hystrix错误返回====haha已经熔断";
    }
}
