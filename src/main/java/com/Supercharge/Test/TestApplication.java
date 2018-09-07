package com.Supercharge.Test;

import com.Supercharge.Test.dao.basicDaoImplementation.DataSingleton;
import com.Supercharge.Test.service.basicImplementation.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		Bank bank = new Bank(DataSingleton.getInstance());
		
	}
}
