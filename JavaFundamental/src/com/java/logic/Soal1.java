package com.java.logic;

import java.util.Scanner;

/**
 * 
 * @author Noviana Dewi
 *
 * op : pola garis miring (/) dengan angka ganjil
 *
 */

public class Soal1 {

	public int getAngka (){
		System.out.print("Masukkan angka : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if (i==j)
					System.out.print(i*1 + (i+1));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		Soal1 p = new Soal1();
		int n = p.getAngka();
		p.cetak(n);
	}
}
