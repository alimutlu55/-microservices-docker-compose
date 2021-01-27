package com.microService.movieServerClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MovieServerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServerClientApplication.class, args);
	}

}
