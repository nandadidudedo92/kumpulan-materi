package com.example.kaknanda;

public class TryCatch3 {
	public static void main(String[] args) {
		try {
			int[] setOfNumber = { 2, 5, 6, 3 };
			System.out.println(setOfNumber[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("no "+e.getMessage()+" tidak ada");
		}
	}
}
