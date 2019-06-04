package com.project.security.carcenterresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableJpaRepositories("com.project.security.carcenterresourceserver.database.repositories")
@EnableResourceServer
@SpringBootApplication(scanBasePackages={
		"com.project.security.carcenterresourceserver", "com.project.security.carcenterresourceserver.database.user",
		"com.project.security.carcenterresourceserver.database.car", "com.project.security.carcenterresourceserver.database.repositories"})
public class CarCenterResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarCenterResourceServerApplication.class, args);
	}

}
