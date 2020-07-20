package com.enigma.spring.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class PajakBadanUsahaMakroServiceImpl implements PajakService {

	public void generatePajak(String angka) {
		System.out.println("---------------Pajak Badan Usaha Makro----------------");
		System.out.println("---------------total pendapatan : "+angka+"----------------");
		int nilai = Integer.parseInt(angka);
		int pajak = nilai*10/100;
		System.out.println(pajak);
	}
	
}
