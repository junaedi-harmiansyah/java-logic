package com.java.logic;

public class BilanganPrima {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			int hit = 0;
			for (int f = 1; f <= i; f++) {
				if (i % f == 0) {
					hit = hit + 1;
				}
			}
			if (hit == 2) {
				System.out.println(i);
			}
		}
	}

}
