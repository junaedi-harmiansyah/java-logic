package com.java.sayurbox;

import java.util.Scanner;

/**
 * @author Junaedi Harmiansyah
 * Date : 5-may-2021
 */
public class almostperfect {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt())
			{
			int value = scan.nextInt();
			int sum = isCek(value);
			System.out.print(value);
			
			if (sum == value)
				System.out.println(" perfect");
			else if (Math.abs(sum - value) <= 2)
				System.out.println(" almost perfect");
			else
				System.out.println(" not perfect");
			}

		scan.close();
	}

	public static int isCek(int value) {
		int sum = 0;
		double x = Math.sqrt(value);
		int xx = (int)x;
		if (xx == x)
			sum += xx;
		for (int i = 2; i < x; i++)
			if (value % i == 0)
				sum += i + (value / i);
		
		return sum + 1;
	}
}
