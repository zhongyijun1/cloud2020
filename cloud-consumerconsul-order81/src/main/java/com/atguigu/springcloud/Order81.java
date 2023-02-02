package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:Order81
 * @Auther: haojie Zhang
 * @Description: 81
 * @Date: 2022/11/16 21:53
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order81 {
    public static void main(String[] args) {
        SpringApplication.run(Order81.class,args);
    }
}
