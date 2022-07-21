package com.jt.jcloudprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//声明这是一个eureka客户端（生产者或者是消费者，此处是生产者）
@EnableEurekaClient
public class JCloudProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(JCloudProvider1Application.class, args);
    }

}
