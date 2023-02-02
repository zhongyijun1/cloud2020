package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName:PaymentHystrixService
 * @Auther: haojie Zhang
 * @Description:
 * @Date: 2022/12/12 22:15
 * @Version: v1.0
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfor(@PathVariable("id")Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfor_timeout(@PathVariable("id")Integer id);

}
