package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:MySelfRule
 * @Auther: haojie Zhang
 * @Description: MySelfRule
 * @Date: 2022/11/17 20:35
 * @Version: v1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}

