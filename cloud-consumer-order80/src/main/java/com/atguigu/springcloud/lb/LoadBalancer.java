package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName:LoadBalancer
 * @Auther: haojie Zhang
 * @Description: 2.LoadBalancer接口
 * @Date: 2022/11/17 21:10
 * @Version: v1.0
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);

}
