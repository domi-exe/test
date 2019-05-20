package com.carcenter.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.carcenter.ws.ui.model.request"})
@EnableAutoConfiguration (exclude = { DataSourceAutoConfiguration.class })
public class CarcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarcenterApplication.class, args);
	}

}
