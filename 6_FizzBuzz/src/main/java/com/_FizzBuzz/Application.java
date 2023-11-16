package com._FizzBuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/*
 *  FIZZ BUZZ Display 0-100 numbers. if number is divided by 3 then FIZZ, divided by 5 then BUZZ 
 *  for both FizzBuzz 
 *  		@Bean is very imp
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner run() {
		return args->{
			for(int i=0; i<101; i++) {
				String result = "";
				
				result +=(i%3)==0? "Fizz":"";
				result +=(i%5)==0? "Buzz":"";
				
				System.out.println(!result.isEmpty()?result:i);
				
			}
		};
	}

}
