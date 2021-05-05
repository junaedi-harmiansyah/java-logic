package com.java.sayurbox;

import java.util.Scanner;

/**
 * @author Junaedi Harmiansyah
 * Date : 5-may-2021
 */
public class AlmostPerfect {

	//to do cek value from input
	//return sum value
	static int isCek(int n) {
		int sum = 0;
		double x = Math.sqrt(n);
		int xx = (int)x;
		if (xx == x)
			sum += xx;
		//filter value
		for (int i = 2; i < x; i++)
			if (n % i == 0)
				sum += i + (n / i);
		
		return sum + 1;
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Masukan Nilai");
	//loop based on input value
	while (scan.hasNextInt())
		{
		int value = scan.nextInt();
		int sum = isCek(value);
		System.out.println();
		System.out.print("Result = "+value + " ");
		
		if (sum == value)
			System.out.println("perfect");
		else if (Math.abs(sum - value) <= 2)
			System.out.println("almost perfect");
		else
			System.out.println("not perfect");
		}

	scan.close();
		}
	}