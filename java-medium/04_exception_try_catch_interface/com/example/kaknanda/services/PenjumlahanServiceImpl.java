package com.example.kaknanda.services;

import java.util.Scanner;

public class PenjumlahanServiceImpl implements PenjumlahanService {

	@Override
	public int tambah(Scanner scan) {
		
		System.out.println("masukkan angka 1 : ");
		int angka1 = scan.nextInt();
		System.out.println("masukkan angka 2 : ");
		int angka2 = scan.nextInt();
		int hasil = angka1 + angka2;
		return hasil;
	}

}
