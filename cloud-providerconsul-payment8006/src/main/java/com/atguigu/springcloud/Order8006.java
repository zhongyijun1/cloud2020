package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName:Order8006
 * @Auther: haojie Zhang
 * @Description: 8006
 * @Date: 2022/11/16 21:33
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order8006 {
    public static void main(String[] args) {
        SpringApplication.run(Order8006.class,args);
    }
}
