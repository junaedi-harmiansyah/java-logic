package com.java.logic;

public class test {
	
	
	
	public String logic(Integer a) {

		for (int i = 0; i <= a; i++) {

			for (int j = 0; j <= a; j++) {

				if (j == 5 && i == 0) {
					System.out.print("*");
				} else if (j == 6 && i == 1) {
					System.out.print("*");

				} else if ((j == 7 && i == 2) || (j == 5 && i == 2)) {
					if (j == 5) {
						System.out.print("o");
					} else if (j == 7) {
						System.out.print("*");
					}

				} else if ((j == 8 && i == 3) || (j == 6 && i == 3)) {
					if (j == 6) {
						System.out.print("o");
					} else if (j == 8) {
						System.out.print("*");
					}

				} else if ((j == 9 && i == 4) || (j == 7 && i == 4) || (j == 5 && i == 4)) {
					if (j == 7) {
						System.out.print("o");
					} else if (j == 9 || j == 5) {
						System.out.print("*");
					}

				}

				else if (i == 5) {
					if (j == 2 || j == 8) {
						System.out.print("o");
					} else if (j == 0 || j == 4 || j == 6 || j == 10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				} else if ((j == 1 && i == 6) || (j == 3 && i == 6) || (j == 5 && i == 6)) {
					if (j == 1 || j == 5) {
						System.out.print("*");
					} else if (j == 3) {
						System.out.print("o");
					}
				} else if ((j == 2 && i == 7) || (j == 4 && i == 7)) {
					if (j == 4) {
						System.out.print("o");
					} else if (j == 2) {
						System.out.print("*");
					}

				} else if ((j == 3 && i == 8) || (j == 5 && i == 8)) {
					if (j == 3) {
						System.out.print("*");
					} else if (j == 5) {
						System.out.print("o");
					}
				} else if (j == 4 && i == 9) {
					System.out.print("*");
				} else if (j == 5 && i == 10) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}
		return "sukses";
	}

}
