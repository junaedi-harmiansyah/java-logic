package com.java.logic;

public class MainClass extends test {

	public static void main(String[] args) {
		test a = new test();

		String abc = a.logic(10);
		if (abc.equalsIgnoreCase("sukses")) {
			System.out.println("mantul bro");
		}
	}

}
