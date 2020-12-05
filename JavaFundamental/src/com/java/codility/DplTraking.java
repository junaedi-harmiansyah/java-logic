package com.java.codility;

public class DplTraking {

	public static void main(String[] args) {

		// JUMLAH TRACK
		int n = 8;
		// U = NAIK, D= TURUN
		char[] hike = { 'U', 'D', 'D', 'D', 'U', 'D', 'U', 'U' };

		int count = 0;
		int altitude = 0;

		for (char c : hike) {
			// Step up
			if (c == 'U') {
				if (altitude == -1) {
					count++;
				}
				altitude++;
			}
			// Step down
			else {
				altitude--;
			}
		}
		System.out.println(count);

	}
}
