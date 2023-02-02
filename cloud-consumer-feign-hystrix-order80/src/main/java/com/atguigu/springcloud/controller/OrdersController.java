package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName:PaymentController
 * @Auther: haojie Zhang
 * @Description: PaymentController
 * @Date: 2022/12/12 20:58
 * @Version: v1.0
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrdersController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfor(@PathVariable("id")Integer id){
        String result = paymentHystrixService.paymentInfor(id);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")  //3秒钟以内就是正常的业务逻辑
    })*/
    @HystrixCommand
    public String paymentInfor_timeout(@PathVariable("id")Integer id) {
        int age = 10/0;
        String result = paymentHystrixService.paymentInfor_timeout(id);
        return result;
    }

    //兜底方法
    public String paymentInfo_TimeOutHandler(Integer id){
        return "81   系统繁忙, 请稍候再试  ,id：  "+id+"\t"+"81哭了哇呜";
    }

    //兜底方法 全局
    public String payment_Global_FallbackMethod(){
        return " Global 系统繁忙, 请稍候再试  ,id： 81哭了哇呜";
    }
}

