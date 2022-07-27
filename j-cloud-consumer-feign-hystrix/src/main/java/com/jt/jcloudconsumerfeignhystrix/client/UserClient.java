package com.jt.jcloudconsumerfeignhystrix.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserClient
 * 这里只是调用第三方接口，不需要实现
 * @Author: jt
 * @Date: 2022/7/26 14:25
 */
//指定要调用的服务名
@FeignClient("PROVIDER-USER-JT")
public interface UserClient {

    @GetMapping("user/sayHello")
    public String sayHello();

    @GetMapping("user/sayHi")
    public String sayHi();

    @GetMapping("user/sayHaha")
    public String sayHaha();
}
