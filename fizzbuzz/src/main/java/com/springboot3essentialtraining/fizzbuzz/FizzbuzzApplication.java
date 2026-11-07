package com.springboot3essentialtraining.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			for(int i = 1; i <= 100; i++){
				String result = "";

				if (i % 3 == 0){
					result = result + "Fizz";
				}

				if (i % 5 == 0){
					result = result + "Buzz";
				}

				if (result.isEmpty()){
					System.out.println(i);
				} else {
					System.out.println(result);
				}
			}
		};
	};
}