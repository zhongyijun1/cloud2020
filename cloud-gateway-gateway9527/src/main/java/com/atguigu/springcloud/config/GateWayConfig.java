package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @ClassName:GateWayConfig
 * @Auther: haojie Zhang
 * @Description:
 * @Date: 2023/1/30 22:33
 * @Version: v1.0
 */

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_atguigu", r -> r.path("/guonei").uri("https://news.baidu.com/")).build();
        return routes.build();

    }
}
