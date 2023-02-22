package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessagerProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName:SendMessageController
 * @Auther: haojie Zhang
 * @Description: SendMessageController
 * @Date: 2023/2/20 21:38
 * @Version: v1.0
 */
@RestController
public class SendMessageController
{
    @Resource
    private IMessagerProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}
