package com.java.logic;

import java.util.Scanner;

public class kuis {
	public static void main (String [] args ){
		System.out.print("Masukkan Angka : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i%2==0 && j<2){
					System.out.print("*");
				}else if ((i%2)==1 && j>=n-2) {
					System.out.print("-");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
