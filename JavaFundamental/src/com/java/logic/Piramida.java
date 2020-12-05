package com.java.logic;

import java.util.Scanner;

public class Piramida {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("masukan angka");
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= i; j--) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
