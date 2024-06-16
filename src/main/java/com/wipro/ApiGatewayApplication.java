package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder){
//
//		return builder.routes()
//				.route(p-> p.path("/book/**")
//						.filters(f-> f.rewritePath("/book/(?<segment>.*)","/${segment}")
//								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
//						.uri("lb://booking-service"))
//				.build();
//	}
}
