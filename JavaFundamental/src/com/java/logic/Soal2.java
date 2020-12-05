package com.java.logic;

import java.util.Scanner;

/**
 * 
 * @author Noviana Dewi
 * 
 * op : pola garis miring (\) dengan angka genap
 * 
 */

public class Soal2 {
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
				if (i== (n-1)-j)
					System.out.print(j*2);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		Soal2 p = new Soal2();
		int n = p.getAngka();
		p.cetak(n);
	}

}
