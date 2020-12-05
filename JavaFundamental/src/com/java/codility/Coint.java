package com.java.codility;

public class Coint {
	public static void main(String[] args) {
		Coint coins = new Coint();
		int[] A = { 1, 0, 0, 1, 0, 0};
		System.out.println(coins.solution(A));
	}

	public int solution(int[] A) {
		int n = A.length;
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			// pengecekan nilai yang sama di indek i dan indx setelahnya
			if (A[i] == A[i + 1])
				result = result + 1;
		}
		int r = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (i > 0) {
				// pengecekan nilai yang tidak sama di indek i dan indx
				// sebelumnya
				if (A[i - 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			if (i < n - 1) {
				// pengecekan nilai yang tidak sama di indek i dan indx
				// setelahnya
				if (A[i + 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			// menetukan nilak maksimal yang akan di ambil
			r = Math.max(r, count);
		}
		// hasil penjumlahan antara nilai yangsama dan selisih array yang
		// nilainya tidak sama
		return result + r;

	}
}