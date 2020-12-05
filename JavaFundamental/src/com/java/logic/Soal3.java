package com.java.logic;

import java.util.Scanner;

/**
 * 
 * @author Noviana Dewi
 * 
 * op : tanda x untuk pola \ angka ganjil, untuk pola / angka genap
 *
 */

public class Soal3 {
	public int getAngka(){
		System.out.print("Masukkan angka : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if (i==j)
					System.out.print(i*1 + (i+1));
				else if (i== (n-1)-j)
					System.out.print(j*2);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		Soal3 p = new Soal3();
		int n= p.getAngka();
		p.cetak(n);
	}
}
