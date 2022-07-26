package com.jt.jcloudconsumerfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserService
 *
 * @Author: jt
 * @Date: 2022/7/22 10:27
 */
//指定服务提供者的名称（可能有多个实例）
@FeignClient("PROVIDER-USER-JT")
public interface UserService {
    //调用提供者的具体接口
    @GetMapping("user/sayHello")
    public String sayHello();

    @GetMapping("/user/sayHi")
    public String sayHi();

    @GetMapping("/user/sayHaha")
    public String sayHaha();
}
