package com._Room_CommandLineRunner_App;


//		@Bean is very imp

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static Logger LOG= LoggerFactory.getLogger(Application.class);
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args ->{
			LOG.info("Starting CLR app");
			
			ResponseEntity<List<Room>> roomsResponseEntity = restTemplate.exchange(
					"http://localhost:8080/api/rooms",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {});
			
			roomsResponseEntity.getBody().forEach(room ->{
				LOG.info(room.toString());
			});
			
			LOG.info("Finishing CLR app");
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
