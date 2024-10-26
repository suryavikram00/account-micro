package com.feign.account_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.api.open.crud.api")
public class AccountMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroApplication.class, args);
	}

}
