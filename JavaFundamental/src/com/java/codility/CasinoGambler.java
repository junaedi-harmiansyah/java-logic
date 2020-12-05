package com.java.codility;

public class CasinoGambler {

	public static void main(String[] args) {
		CasinoGambler casinoGambler = new CasinoGambler();
		System.out.println(casinoGambler.minimumPlays(6, 1));
	}

	public static int minimumPlays(int chips, int allInPlays) {

		if (allInPlays == 0) {
			return chips - 1;
		}

		int plays = 0;

		// loop while we have chips or while we have all in plays to make
		while (chips > 1 && allInPlays > 0) {
			if (chips % 2 == 0) {
				allInPlays--;
				chips /= 2;
				plays++;
			} else {
				chips--;
				plays++;
			}
		}

		// Sum the rest of the chips
		if (chips > 1) {
			plays += chips - 1;
		}
		return plays;
	}
}
