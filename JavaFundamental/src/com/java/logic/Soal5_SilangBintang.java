package com.java.logic;

import java.util.Scanner;

/**
 * 
 * @author Noviana Dewi
 * 
 * op : pola segitiga siku dengan angka bilangan ganjil
 */

public class Soal5_SilangBintang {
	public int getAngka(){
		System.out.print("Masukkan angka : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i>=j)
					System.out.print(j*1+(j+1));
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		Soal5_SilangBintang p = new Soal5_SilangBintang();
		int n= p.getAngka();
		p.cetak(n);
	}
}
