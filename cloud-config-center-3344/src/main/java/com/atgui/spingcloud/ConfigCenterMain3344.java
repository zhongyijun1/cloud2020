package com.atgui.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName:ConfigCenterMain3344
 * @Auther: haojie Zhang
 * @Description:
 * @Date: 2023/2/2 21:16
 * @Version: v1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344 .class,args);
    }
}

