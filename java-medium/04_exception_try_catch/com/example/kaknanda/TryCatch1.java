package com.example.kaknanda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch1 {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("masukkan angka : ");
			int angka = scan.nextInt();
			System.out.println("angka yang anda masukkan : " + angka);
		} catch (InputMismatchException e) {
			System.out.println(" jangan masukkan string !!! " +e);
		}

	}
}
