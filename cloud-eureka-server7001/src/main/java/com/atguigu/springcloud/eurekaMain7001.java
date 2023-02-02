package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName:eurekaMain7001
 * @Auther: haojie Zhang
 * @Description: eureker main
 * @Date: 2022/11/5 11:26
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(eurekaMain7001.class,args);
    }
}
