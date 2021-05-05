package com.java.sayurbox;

import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int countTask = scan.nextInt();
		int timeTask = scan.nextInt();
		
		//create object array type integer from size array based count task
		int[] nums = new int[countTask];
		
		//mapping time task in array 
		for (int i = 0; i < countTask; i++)
			nums[i] = scan.nextInt();

		int count = 0;
		
		//validation to do solve max time to handling in task
		for (int i = 0; i < countTask; i++) {
			timeTask -= nums[i];

			if (timeTask >= 0)
				count++;
		}
		
		System.out.println(count);

		scan.close();
	}
}
