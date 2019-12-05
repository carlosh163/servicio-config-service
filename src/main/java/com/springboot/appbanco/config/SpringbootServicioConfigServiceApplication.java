package com.springboot.appbanco.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootServicioConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioConfigServiceApplication.class, args);
	}

}
