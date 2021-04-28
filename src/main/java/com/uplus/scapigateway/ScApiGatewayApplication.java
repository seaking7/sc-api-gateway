package com.uplus.scapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScApiGatewayApplication.class, args);
	}

	@Bean
	public HttpTraceRepository httpTraceRepository(){
		return new InMemoryHttpTraceRepository();
	}

}
