package com.java.logic;

import java.util.Scanner;

public class JamPasir {
	
	public int getAngka (){
		System.out.print("masukkan angka : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public void cetak (int n){
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (i<=j && i+j<=n-1)
					System.out.print("*");
				else if (i>=j && i+j>=n-1)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JamPasir p = new JamPasir();
		int n = p.getAngka();
		p.cetak(n);
	}

}
