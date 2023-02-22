package com.atguigu.springcloud;

/**
 * @ClassName:OrderNacosMain83
 * @Auther: haojie Zhang
 * @Description: OrderNacosMain83
 * @Date: 2023/2/22 21:44
 * @Version: v1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacosMain83.class,args);
    }
}
