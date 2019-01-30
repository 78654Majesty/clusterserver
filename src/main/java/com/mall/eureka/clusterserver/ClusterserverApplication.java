package com.mall.eureka.clusterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClusterserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClusterserverApplication.class, args);
    }

}

