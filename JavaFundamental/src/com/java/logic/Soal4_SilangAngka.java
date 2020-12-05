package com.java.logic;

import java.util.Scanner;

/**
 * 
 * @author Noviana Dewi
 *
 * op : pola * dengan angka ganjil genap
 * 
 */

public class Soal4_SilangAngka {
	
	public int getAngka (){
		System.out.println("Masukkan angka : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (j==n/2 || i==j)
					System.out.print(i*1 + (i+1));
				else if (i==n/2 || i== (n-1)-j)
					System.out.print(j*2);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		Soal4_SilangAngka s = new Soal4_SilangAngka();
		int n = s.getAngka();
		s.cetak(n);
	}
}
