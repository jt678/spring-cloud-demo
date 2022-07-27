package com.jt.jcloudconsumerfeignhystrix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
@Slf4j
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.jt.*")
//@EnableCircuitBreaker已经被包含再EnableHystrix中
@EnableHystrix
public class JCloudConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudConsumerFeignHystrixApplication.class, args);
        System.out.println("FEIGN调用启动成功");
    }

}
