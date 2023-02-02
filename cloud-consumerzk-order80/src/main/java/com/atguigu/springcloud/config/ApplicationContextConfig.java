package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:ApplicationContextConfig
 * @Auther: haojie Zhang
 * @Description: config
 * @Date: 2022/11/16 20:51
 * @Version: v1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
   // @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}
