/**
 * 
 */
package com.java.conversi.suhu;

/**
 * @author Noviana Dewi
 *
 */
public class Reamur {
	double toFahrenheit() {
		// �F = �R� � 2,25 + 32
		return (KonversiSuhu.SuhuAwal * 2.25 + 32);
	}

	double toKelvin() {
		// K = �R� / 0,8 + 273,15
		return (KonversiSuhu.SuhuAwal / 0.8 + 237.15);
	}

	double toCelcius() {
		// �C = �R� / 0,8
		return (KonversiSuhu.SuhuAwal / 0.8);
	}
}
