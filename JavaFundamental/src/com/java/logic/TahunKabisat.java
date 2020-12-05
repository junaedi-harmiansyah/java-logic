package com.java.logic;

import java.util.Scanner;

public class TahunKabisat {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("masukan tahun:");
		Integer inputTahun = a.nextInt();
		TahunKabisat input = new TahunKabisat();
		input.kabisat(inputTahun);
	}

	void kabisat(Integer tahun) {

		if (tahun % 4 == 0 & tahun % 100 != 0 | tahun % 400 == 0) {
			System.out.println("kabisat");
		} else {
			System.out.println("bkn kabisat");
		}

	}

}
