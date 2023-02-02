package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName:PaymentHystrixMain8001
 * @Auther: haojie Zhang
 * @Description: PaymentHystrixMain8001
 * @Date: 2022/12/12 20:53
 * @Version: v1.0
 */
@SpringBootApplication
@EnableFeignClients // 启动 feign
@EnableHystrix // 启动 hystrix

public class PaymentHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain80.class,args);
    }
}
