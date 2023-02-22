package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.service.IMessagerProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;


/**
 * @ClassName:MessageProviderImpl
 * @Auther: haojie Zhang
 * @Description:
 * @Date: 2023/2/20 21:27
 * @Version: v1.0
 */
@EnableBinding(Source.class)//消息的推送管道
public class MessageProviderImpl implements IMessagerProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***********serial:"+serial);
        return null;
    }
}
