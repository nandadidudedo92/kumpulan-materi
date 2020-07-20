package com.example.kaknanda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Masukkan username : ");
		String username = bufferedReader.readLine();
		System.out.println("username anda adalah : " +username);
		System.out.println("Masukkan password : ");
		String password = bufferedReader.readLine();
		System.out.println("password anda adalah :" +password);
		
		
	}
}
