package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:FeignConfig
 * @Auther: haojie Zhang
 * @Description:
 * @Date: 2022/12/5 10:23
 * @Version: v1.0
 */

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
