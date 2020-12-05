package com.java.logic;

import java.util.Scanner;

public class Vabionachi {
	public static void main(String args[]) {

		int a = 0, b = 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan jumlah loop= ");
		Integer input = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		
		for (int i = 0; i <= input; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
