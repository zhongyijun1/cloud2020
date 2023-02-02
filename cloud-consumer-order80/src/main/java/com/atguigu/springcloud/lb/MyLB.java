package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName:MyLB
 * @Auther: haojie Zhang
 * @Description: ServiceInstance
 * @Date: 2022/11/17 21:13
 * @Version: v1.0
 */
@Component
public class MyLB implements LoadBalancer{
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current; int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647  ? 0 : current + 1;
            System.out.println("**************next:"+ next);
            System.out.println("**************current:"+ current);

        } while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("**************第几次访问，next:"+ next);
        return  next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
