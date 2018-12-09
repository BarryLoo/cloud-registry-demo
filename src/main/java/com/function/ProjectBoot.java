package com.function;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaServer
@EnableHystrix
@SpringCloudApplication
public class ProjectBoot {
	public static void main(String[] args) {
		SpringApplication.run(ProjectBoot.class);
	}
}
