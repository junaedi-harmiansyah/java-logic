package com.java.conversi;

import java.util.Scanner;

public class KonversiAngkaTerbilang {
	
	static String [] huruf = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukkan angka : ");
		System.out.println(new KonversiAngkaTerbilang().angkaTerbilang(sc.nextLong()));
		sc.close();
	}


	public static String angkaTerbilang(Long angka) {
		// TODO Auto-generated method stub
		
		if (angka < 12)
			return huruf [angka.intValue()];
		if (angka >= 12 && angka <= 19)
			return huruf [angka.intValue() %10] + " Belas";
		if (angka >= 20 && angka <= 99)
			return huruf [angka.intValue() /10] + "puluh " + huruf [angka.intValue() %10];
		if (angka >= 100 && angka <= 199)
			return "Seratus " + angkaTerbilang(angka % 100);
		if (angka >= 200 && angka <= 999)
			return angkaTerbilang(angka / 100) + "ratus " + angkaTerbilang(angka % 100);
		if (angka >= 1000 && angka <= 1999)
			return "Seribu " + angkaTerbilang(angka % 1000);
		if (angka >= 2000 && angka <= 999999)
			return angkaTerbilang(angka / 1000) +"ribu "+ angkaTerbilang(angka %1000);
		if (angka >= 1000000 && angka <= 999999999)
			return angkaTerbilang(angka / 1000000) +" Juta "+ angkaTerbilang(angka %1000000);
		if (angka >= 1000000000 && angka <= 999999999999L)
			return angkaTerbilang(angka / 1000000000) +" Milyar "+ angkaTerbilang(angka %1000000000);
		return "";
	}
		
}
