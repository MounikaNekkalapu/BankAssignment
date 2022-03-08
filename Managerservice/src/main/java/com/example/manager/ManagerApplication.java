package com.example.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(
exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients

public class ManagerApplication {
	
	public static void main(String[] args) {
	      SpringApplication.run(ManagerApplication.class, args);
	}
}
