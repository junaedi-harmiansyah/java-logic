package com.java.logic;

public class BilanganFactor {
	
	public static void main(String[] args) {
	
		
		for (int i = 1; i < 10; i++) {
			int hit = 0;
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					hit = hit + 1;
				}
			}
			System.out.println("Faktor "+i+" adalah : "+hit);
		}
	}

}
