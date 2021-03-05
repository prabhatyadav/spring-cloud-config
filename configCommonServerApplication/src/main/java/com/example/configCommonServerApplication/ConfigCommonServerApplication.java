package com.example.configCommonServerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCommonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCommonServerApplication.class, args);
	}

}
