package com.java.logic;

import java.util.Scanner;

public class BelahKetupat {
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
			for (int j = 1; j <= i - 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = number; i >= 1; i--) {
			for (int j = i; j <= number; j++) {
				System.out.print(' ');
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
