package com.atguigu.springcloud.alibab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName:OrderZkController
 * @Auther: haojie Zhang
 * @Description: controller
 * @Date: 2022/11/16 20:53
 * @Version: v1.0
 */
@RestController
@Slf4j
public class OrderZkController {
    public static final String  INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(
                INVOKE_URL+"/payment/zk",String.class
        );
        return result;
    }
}
