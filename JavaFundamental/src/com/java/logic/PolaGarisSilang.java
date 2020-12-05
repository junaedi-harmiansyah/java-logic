package com.java.logic;

import java.util.Scanner;

public class PolaGarisSilang {
	
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
				if (i==j || i==(n-1)-j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolaGarisSilang p = new PolaGarisSilang();
		int n = p.getAngka();
		p.cetak(n);
	}

}
