package com.baron.demo;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * 描述该类实现的功能
 *
 * @author xuebai
 * @date 20171108 11:34:05
 * @modify 20171108 xuebai
 * @since v
 */
@EnableAdminServer
@Configuration
@EnableDiscoveryClient
@EnableAutoConfiguration
public class AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplication.class, args);
	}
}
