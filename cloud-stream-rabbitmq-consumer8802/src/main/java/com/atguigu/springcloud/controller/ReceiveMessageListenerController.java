package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ClassName:ReceiveMessageListenerController
 * @Auther: haojie Zhang
 * @Description: ReceiveMessageListenerController
 * @Date: 2023/2/20 22:10
 * @Version: v1.0
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input (Message<String> message){
        System.out.println("消费者1号，-------》接收到的消息："+message.getPayload()
                +"\t port:"+ serverPort );
    }
}
