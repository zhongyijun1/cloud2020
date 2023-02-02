package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:GateWayMain9527
 * @Auther: haojie Zhang
 * @Description: GateWayMain9527
 * @Date: 2023/1/3 21:46
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run( GateWayMain9527.class,args);
    }
}



