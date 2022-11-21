package com.zy.config;//package com.zy.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
///**
// * @学习小结
// */
//@Configuration
//public class GatewayConfig {
//    @Bean //配置文件的路由映射规矩
//    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
//
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//                    //前面的优先级高
//        routes.route("provider8001",r -> r.path("/between30to40").uri("http://localhost:8001"))
//                .route("order9001",r -> r.path("/**").uri("http://localhost:9001"))
//               .build();
//
//            return routes.build();
//    }
//}
