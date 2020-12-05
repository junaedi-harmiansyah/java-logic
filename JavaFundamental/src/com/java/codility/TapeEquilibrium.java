package com.java.codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium equilibrium = new TapeEquilibrium();
		int[] a = { 3, 1, 2, 4, 3 };
		equilibrium.solution(a);
	}

	public int solution(int[] A) {
		int minVal = 0;
		int arrayLength = A.length;

		if (arrayLength == 2) {
			return Math.abs(A[1] - A[0]);
		}

		for (int split = 1; split < arrayLength - 1; split++) {
			A[split] = Math.abs(A[split] + A[split - 1]);
		}

		int total = Math.abs(A[arrayLength - 2] + A[arrayLength - 1]);
		minVal = total;

		for (int split = 0; split < arrayLength - 1; split++) {
			int rSum = Math.abs(A[split] - total);
			if (Math.abs(A[split] - rSum) < minVal) {
				minVal = Math.abs(A[split] - rSum);
			}
		}
		System.out.println(minVal);
		return minVal;
	}

}
