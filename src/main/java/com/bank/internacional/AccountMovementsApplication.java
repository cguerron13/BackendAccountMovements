package com.bank.internacional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.bank.internacional.model")
@EnableJpaRepositories("com.bank.internacional.repository")
public class AccountMovementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMovementsApplication.class, args);
	}

}
