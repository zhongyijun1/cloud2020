package com.atguigu.springcloud.alibaba.controller;

/**
 * @ClassName:ConfigClientController
 * @Auther: haojie Zhang
 * @Description: ConfigClientController
 * @Date: 2023/2/22 22:07
 * @Version: v1.0
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}

