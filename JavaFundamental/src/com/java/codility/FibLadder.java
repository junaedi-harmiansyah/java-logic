package com.java.codility;

public class FibLadder {
	public static void main(String[] args) {
		FibLadder fibLadder = new FibLadder();

		int[] A = { 4, 4, 5, 5, 1 };
		int[] B = { 3, 2, 4, 3, 1 };
		System.out.println(fibLadder.solution(A, B));

	}

	public int[] solution(int[] A, int[] B) {
		int L = A.length;

		int max = 0;
		for (int i = 0; i < L; i++) {
			max = Math.max(A[i], max);
		}

		int[] fibonacci = new int[max + 1];

		fibonacci[0] = 1;
		fibonacci[1] = 1;

		for (int i = 2; i <= max; i++) {
			fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % (1 << 30);
		}

		int[] results = new int[L];

		for (int i = 0; i < L; i++) {
			results[i] = fibonacci[A[i]] % (1 << B[i]);
		}
		System.out.println(results);
		return results;
	}
}
