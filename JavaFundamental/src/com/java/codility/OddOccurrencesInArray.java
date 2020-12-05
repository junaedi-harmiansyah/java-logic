package com.java.codility;

public class OddOccurrencesInArray {
	public static void main(String[] args) {
		OddOccurrencesInArray array = new OddOccurrencesInArray();
		int[] A = { 9, 3, 9, 3, 9, 7, 9, 6, 7, 9, 7 };
		array.solution(A);
	}

	public int solution(int[] A) {
		int num = 0;

		for (int i = 0; i < A.length; i++) {
			int isChek = 0;
			int cekNumber = A[i];

			for (int n = 0; n < A.length; n++) {
				if (cekNumber == A[n]) {
					isChek++;
				}
			}

			if (isChek < 2) {
				num = cekNumber;
			}
		}
		System.out.println(num);
		return num;
	}
}
