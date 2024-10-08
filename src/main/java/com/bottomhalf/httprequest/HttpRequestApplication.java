package com.bottomhalf.httprequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HttpRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpRequestApplication.class, args);
	}

}
