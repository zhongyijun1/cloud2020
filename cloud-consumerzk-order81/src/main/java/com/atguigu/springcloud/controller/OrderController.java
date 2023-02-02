package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName:OrderController
 * @Auther: haojie Zhang
 * @Description: controller
 * @Date: 2022/11/16 21:08
 * @Version: v1.0
 */
@RestController
@Slf4j
public class OrderController {
    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;
    }


}
