package com.java.logic;

public class ModulusTest {

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {

			for (int i = 0; i < 10; i++) {
				if (i % 2 != 0) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
