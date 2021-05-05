package com.java.sayurbox;

import java.util.Scanner;

/**
 * @author Junaedi Harmiansyah
 * Date : 5- may - 2021
 */
public class Server {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Masukan Jumlah Tugas");
		int countTask = scan.nextInt();
		System.out.println("Masukan Batas Waktu");
		int timeTask = scan.nextInt();
		
		//create object array type integer from size array based count task
		int[] nums = new int[countTask];
		System.out.println("Masukan Lama Waktu Tugas sebanyak "+countTask);
		
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
		
		System.out.println("Tugas yang bisa di handel sebanyak ="+count);

		scan.close();
	}
}