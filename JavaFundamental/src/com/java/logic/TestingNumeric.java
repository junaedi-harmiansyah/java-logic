package com.java.logic;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestingNumeric {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal a= new BigDecimal(10.0);
		if (a == null || a.equals("")) {
			System.out.println("null");
		}else {
			System.out.println("not null");
		}
	}

}
