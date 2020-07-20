package com.enigma.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.enigma.spring.springboot.pajak.PajakAnalytics;
import com.enigma.spring.springboot.service.PajakService;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner{
	
	@Autowired
	ApplicationContext appContext;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");

		PajakAnalytics pajakAnalytics = (PajakAnalytics) appContext.getBean(args[0]);
		PajakService pajakService = (PajakService) appContext.getBean(args[1]);
		pajakAnalytics.setPajakAnalytics(pajakService);
		pajakAnalytics.generatePajak(args[2]);
		
	}
}
