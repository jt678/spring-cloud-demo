package com.jt.jcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
//注册到eureka上
@EnableEurekaClient
//开启zuul代理，是zuulsever注解升级版
@EnableZuulProxy
public class JCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudZuulApplication.class, args);
    }

}
