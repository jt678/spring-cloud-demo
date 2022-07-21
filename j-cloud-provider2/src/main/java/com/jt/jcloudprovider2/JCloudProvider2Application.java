package com.jt.jcloudprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(JCloudProvider2Application.class, args);
        System.out.println("=====================provider2启动成功！！=====================");
    }

}
