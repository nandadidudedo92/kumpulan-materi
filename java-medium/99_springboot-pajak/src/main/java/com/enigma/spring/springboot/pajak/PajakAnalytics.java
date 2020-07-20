package com.enigma.spring.springboot.pajak;

import org.springframework.stereotype.Component;

import com.enigma.spring.springboot.service.PajakService;

@Component
public class PajakAnalytics {

	private PajakService pajakService;
	
	public void setPajakAnalytics(PajakService pajakService) {
		this.pajakService = pajakService;
	}
	
	public void generatePajak(String angka) {
		pajakService.generatePajak(angka);
		
	}
	
}
