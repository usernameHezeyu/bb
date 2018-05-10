package com.zh.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 服务提供方
 * @author zhanghang
 * @date 2018/2/23
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

	@RequestMapping("/home")
	public String home() throws InterruptedException {
		//睡5s触发hystrix默认熔断机制
//		TimeUnit.SECONDS.sleep(5);
		return "Hello world";
	}
}
