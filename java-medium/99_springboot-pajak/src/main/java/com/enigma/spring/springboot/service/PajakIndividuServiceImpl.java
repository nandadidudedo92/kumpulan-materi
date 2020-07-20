package com.enigma.spring.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class PajakIndividuServiceImpl implements PajakService {

	public int nilai;
	public void generatePajak(String angka) {
		System.out.println("---------------Pajak Badan Usaha Mikro----------------");
		nilai = Integer.parseInt(angka);
		if(nilai<=3000000) {
			System.out.println("Bebas Pajak");
		} else {
			int pajak = nilai*10/100;
			System.out.println(pajak);
		}
	}
	
}
