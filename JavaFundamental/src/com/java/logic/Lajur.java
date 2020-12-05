package com.java.logic;

public class Lajur {

	public static void main(String[] args) {
		for (int baris = 1; baris <= 5; baris++) {
			System.out.println();
			for (int lajur = 1; lajur <= 10; lajur++) {

				int k = baris * lajur;
				System.out.println(baris + " x " + lajur + " = " + k);
			}
		}
	}

}
