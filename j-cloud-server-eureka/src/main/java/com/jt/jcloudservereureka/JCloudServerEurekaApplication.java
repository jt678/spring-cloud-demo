package com.jt.jcloudservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明是一个sever
@EnableEurekaServer
@SpringBootApplication
public class JCloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudServerEurekaApplication.class, args);
        System.out.println("---服务监控访问地址" + "http://localhost:9898");
    }

}
