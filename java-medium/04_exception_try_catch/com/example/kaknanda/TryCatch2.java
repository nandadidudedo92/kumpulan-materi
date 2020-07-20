package com.example.kaknanda;

import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args) {

		int angka1 = tryCatch1();
		
		System.out.println("angka yang anda masukkan: "+ angka1);
		

	}

	static int tryCatch1() {
		int angka1 = 0;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("masukkan angka : ");
			angka1 = scan.nextInt();
		} catch (Exception  e) {
			System.out.println("Jangan Masukkan String!!!!"+ e);			
		}
		return angka1;
	}

}
