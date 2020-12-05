package com.java.logic;

import java.util.Scanner;

public class PolaSimbolBintang {

	public int getAngka (){
		System.out.print("Masukkan angka : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i==j || i==(n-1)-j)
					System.out.print("*");
				else if (i==n/2 || j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolaSimbolBintang p = new PolaSimbolBintang();
		int n = p.getAngka();
		p.cetak(n);
	}

}
