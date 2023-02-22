package com.atguigu.springcloud.alibaba.config;

/**
 * @ClassName:ApplicationContextConfig
 * @Auther: haojie Zhang
 * @Description: ApplicationContextConfig
 * @Date: 2023/2/22 21:45
 * @Version: v1.0
 */
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}

 