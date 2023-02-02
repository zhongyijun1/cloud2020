package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName:EurekerMain7002
 * @Auther: haojie Zhang
 * @Description: eureker7002 main
 * @Date: 2022/11/5 15:57
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekerMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekerMain7002.class,args);
    }

}
