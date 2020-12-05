package com.java.logic;

public class Finitetimes {

	static int count = 0;

	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}

	public static void main(String[] args) {
		p();
	}
}
