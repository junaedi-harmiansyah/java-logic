package com.java.hackerrank;

public class StringPembalik {

	public static void main(String[] args) {
		String str = "telo";
		int l = str.length();
		String reverse = "";
		for (int i = l - 1; i >= 0; i--) 
			reverse =reverse + str.charAt(i);
		System.out.println(reverse);
	}

}
