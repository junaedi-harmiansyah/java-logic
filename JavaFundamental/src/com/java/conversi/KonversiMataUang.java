/**
 * 
 */
package com.java.conversi;

import java.util.Scanner;

/**
 * @author Noviana Dewi
 *
 */

public class KonversiMataUang {
	
	public int getAngka (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan nilai rupiah : ");
		int rupiah = sc.nextInt();
		sc.close();
		
		return rupiah;
	}
	
	public void cetak (int rupiah){
		float dollar = (float) (rupiah * 0.0001);
		float euro = (float) (rupiah * 0.00004);
		System.out.println();
		System.out.println("Hasil Konversi ke USD : " +dollar);
		System.out.println("Hasil Konversi ke EU : " +euro);
	}
	
	public static void main (String [] args){
		KonversiMataUang k = new KonversiMataUang();
		int rupiah = k.getAngka();
		k.cetak(rupiah);
	}
}
