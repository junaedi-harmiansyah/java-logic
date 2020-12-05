package com.java.logic;

import java.util.Scanner;

public class DasiKupu {
	
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
				if (i<=j && i+j<=n-1)
					System.out.print(i);
				else if (i<=j && i+j>=n-1)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DasiKupu p = new DasiKupu();
		int n = p.getAngka();
		p.cetak(n);
	}

}
