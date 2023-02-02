package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName:EurekaMain7003
 * @Auther: haojie Zhang
 * @Description: eureka main
 * @Date: 2022/11/5 16:08
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class,args);
    }
}
