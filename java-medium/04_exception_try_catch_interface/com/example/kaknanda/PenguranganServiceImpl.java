package com.example.kaknanda;

import java.util.Scanner;

import com.example.kaknanda.services.PenguranganService;

public class PenguranganServiceImpl implements PenguranganService {

	@Override
	public int kurang(Scanner scan) {
		System.out.println("masukkan angka 1 : ");
		int angka1 = scan.nextInt();
		System.out.println("masukkan angka 2 : ");
		int angka2 = scan.nextInt();
		int hasil = angka1 - angka2;
		return hasil;
	}

}
