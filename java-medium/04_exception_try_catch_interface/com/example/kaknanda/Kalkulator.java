package com.example.kaknanda;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.kaknanda.services.MenuManagementService;
import com.example.kaknanda.services.MenuManagementServiceImpl;
import com.example.kaknanda.services.PenguranganService;
import com.example.kaknanda.services.PenjumlahanService;
import com.example.kaknanda.services.PenjumlahanServiceImpl;

public class Kalkulator {

	MenuManagementService menuManagementService;
	PenjumlahanService penjumlahanService;
	PenguranganService penguranganService;

	public Kalkulator() {
		this.menuManagementService = new MenuManagementServiceImpl();
		this.penjumlahanService = new PenjumlahanServiceImpl();
		this.penguranganService = new PenguranganServiceImpl();

	}

	void start() {
		try {
			int hasil = 0;
			this.menuManagementService.printMenu();

			Scanner scan = new Scanner(System.in);
			System.out.println("pilih : ");

			int a = scan.nextInt();
			if (a == 1) {
				hasil = this.penjumlahanService.tambah(scan);
				System.out.println("hasilnya adalah = " + hasil);
			} else if (a == 2) {
				hasil = this.penguranganService.kurang(scan);
				System.out.println("hasilnya adalah = " + hasil);
			}
		} catch (InputMismatchException e) {
			System.out.println("Error!!! masukkan Angka, jangan huruf: " + e);
			start();
		}

	}
}
