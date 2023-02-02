package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName:MyLB
 * @Auther: haojie Zhang
 * @Description: ServiceInstance
 * @Date: 2022/11/17 21:13
 * @Version: v1.0
 */
@Component
public class MyLB implements LoadBalancer{
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstanceList) {
        return null;
    }
}
