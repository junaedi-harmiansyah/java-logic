package com.java.logic;

import java.util.Scanner;

public class Soal6 {

	public int getAngka (){
		System.out.println("Masukkan angka : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i>=(n-1)-j)
					System.out.print(j*2);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		Soal6 s = new Soal6();
		int n = s.getAngka();
		s.cetak(n);
	}
}
