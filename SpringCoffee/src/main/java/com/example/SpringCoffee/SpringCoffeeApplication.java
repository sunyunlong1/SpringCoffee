package com.example.SpringCoffee;

import com.example.SpringCoffee.repository.CoffeeOrderRepository;
import com.example.SpringCoffee.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoffeeApplication implements ApplicationRunner {

	@Autowired
	private CoffeeRepository coffeeRepository;
	@Autowired
	private CoffeeOrderRepository coffeeOrderRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCoffeeApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}
