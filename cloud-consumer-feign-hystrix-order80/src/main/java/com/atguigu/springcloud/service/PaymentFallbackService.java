package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName:PaymentFallbackService
 * @Auther: haojie Zhang
 * @Description: PaymentFallbackService
 * @Date: 2023/1/2 21:09
 * @Version: v1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfor(Integer id) {
        return "_______________PayFabllback ok ku_________";
    }

    @Override
    public String paymentInfor_timeout(Integer id) {
        return "_______________PayFabllback time ku_________";
    }
}
