package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @ClassName:OrderZk81
 * @Auther: haojie Zhang
 * @Description: 81
 * @Date: 2022/11/16 20:45
 * @Version: v1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk81 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZk81.class,args);
    }

}
