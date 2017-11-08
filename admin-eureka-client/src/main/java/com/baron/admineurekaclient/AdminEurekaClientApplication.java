package com.baron.admineurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述该类实现的功能
 *
 * @author xuebai
 * @date 20171108 11:45:00
 * @modify 20171108 xuebai
 * @since v
 */
@SpringBootApplication
@EnableEurekaClient
public class AdminEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminEurekaClientApplication.class, args);
	}
}
