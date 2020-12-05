/**
 * 
 */
package com.java.logic;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Noviana Dewi
 *
 */
public class Aritmatika {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);

		int A, B;
		System.out.println("Menu Pilihan :");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");

		String data_pilihan = JOptionPane.showInputDialog("Masukkan Pilihan Anda (1-4) :");
		int pilihan = Integer.parseInt(data_pilihan);

		System.out.println("Masukkan angka pertama :");
		A = id.nextInt();
		System.out.println("Masukkan angka kedua :");
		B = id.nextInt();
		id.close();
		switch (pilihan) {
		case 1: {
			int jumlah = A + B;
			System.out.println("Penjumlahan " + A + " + " + B + " = " + jumlah);
			break;
		}
		case 2: {
			int kurang = A - B;
			System.out.println("Penjumlahan " + A + " - " + B + " = " + kurang);
			break;
		}
		case 3: {
			int kali = A * B;
			System.out.println("Penjumlahan " + A + " * " + B + " = " + kali);
			break;
		}
		case 4: {
			int bagi = A / B;
			System.out.println("Penjumlahan " + A + " : " + B + " = " + bagi);
			break;
		}
		default:
			System.out.println("Pilihan Anda Salah");
			break;
		}
	}
}
