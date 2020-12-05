/**
 * 
 */
package com.java.conversi.suhu;

import java.util.Scanner;

/**
 * @author Noviana Dewi
 *
 */

public class KonversiSuhu {
	static double SuhuAwal;
	static char Awal;

	public static void main(String[] args) {
		
		Celcius fromCelcius = new Celcius();
		Celcius telo= new Celcius();
		Fahrenheit fromFahrenheit1 = new Fahrenheit();
		Reamur fromReamur = new Reamur();
		Kelvin fromKelvin = new Kelvin();

		double Fahrenheit, Kelvin, Celcius, Reamur;
		boolean valid = false;
		Scanner input = new Scanner(System.in);

		while (valid != true) {
			System.out.println("Program Konversi Suhu");
			System.out.print("Masukkan suhu awal dan nilainya (D/F/R/K) (misal : 100 C):");
			SuhuAwal = input.nextDouble();
			Awal = input.next().charAt(0);
		
			switch (Awal) {
			case 'C':
				Reamur = telo.toReamur();
				Fahrenheit = fromCelcius.toFahrenheit();
				Kelvin = fromCelcius.toKelvin();
				System.out.println("Suhu awal =" + SuhuAwal + " Celcius\nHasil:");
				System.out.println("Fahrenheit : " + Fahrenheit);
				System.out.println("Kelvin : " + Kelvin);
				System.out.println("Reamur : " + Reamur);
				valid = true;
				break;
			case 'F':
				Celcius = fromFahrenheit1.toCelcius();
				Reamur = fromFahrenheit1.toReamur();
				Kelvin = fromFahrenheit1.toKelvin();
				System.out.println("Suhu awal =" + SuhuAwal + " Fahrenheit\nHasil:");
				System.out.println("Celcius : " + Celcius);
				System.out.println("Kelvin : " + Kelvin);
				System.out.println("Reamur : " + Reamur);
				valid = true;
				break;
			case 'K':
				Celcius = fromKelvin.toCelcius();
				Reamur = fromKelvin.toReamur();
				Fahrenheit = fromKelvin.toFahrenheit();
				System.out.println("Suhu awal =" + SuhuAwal + " Kelvin\nHasil:");
				System.out.println("Celcius : " + Celcius);
				System.out.println("Fahrenheit : " + Fahrenheit);
				System.out.println("Reamur : " + Reamur);
				valid = true;
				break;
			case 'R':
				Celcius = fromReamur.toCelcius();
				Fahrenheit = fromReamur.toFahrenheit();
				Kelvin = fromReamur.toKelvin();
				System.out.println("Suhu awal =" + SuhuAwal + " Reamur\nHasil:");
				System.out.println("Celcius : " + Celcius);
				System.out.println("Fahrenheit : " + Fahrenheit);
				System.out.println("Kelvin : " + Kelvin);
				valid = true;
				break;
			default:
				System.out.println("Masukkan suhu secara benar [C,F,K,R]");
			}
		input.close();
		}
	}
}
