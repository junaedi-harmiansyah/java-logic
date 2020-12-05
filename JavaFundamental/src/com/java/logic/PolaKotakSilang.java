package com.java.logic;

import java.util.Scanner;

public class PolaKotakSilang {
	public int getAngka(){
		System.out.print("Masukkan angka : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i==0 || i==n-1 || j==0 || j==n-1) //buat pola kotak
					System.out.print("*");
				else if (i+1 == j+1 || i==(n-1)-j) //buat pola silang
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolaKotakSilang p = new PolaKotakSilang();
		int n = p.getAngka();
		p.cetak(n);
	}

}
