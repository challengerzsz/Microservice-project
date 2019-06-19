package com.xiyou3g.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Xiyou3gEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Xiyou3gEurekaApplication.class, args);
    }

}
