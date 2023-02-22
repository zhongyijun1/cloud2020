package com.atguigu.springcloud.alibaba;

/**
 * @ClassName:NacosConfigClientMain3377
 * @Auther: haojie Zhang
 * @Description: NacosConfigClientMain3377
 * @Date: 2023/2/22 22:06
 * @Version: v1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377
{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}

