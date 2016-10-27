package com.techolution.test;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techolution.test.api.Calculator;
import com.techolution.test.util.FileUtil;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {
	
	@Autowired
	private FileUtil fileUtil;
	
	@Autowired
	private Calculator calculator;
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Input readFile = fileUtil.readFile(arg0[0]);
		Long maximize = calculator.maximize(readFile.getEntries(), readFile.getMaxTime());
		System.out.println(maximize);
	}
}
