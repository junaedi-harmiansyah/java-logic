package com.java.logic;

import java.util.Scanner;

public class PolaGarisMiring2 {
	
	public int getAngka (){
		System.out.print("Masukkan Angka : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i==(n-1)-j)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PolaGarisMiring2 p = new PolaGarisMiring2();
		int n = p.getAngka();
		p.cetak(n);
	}

}
