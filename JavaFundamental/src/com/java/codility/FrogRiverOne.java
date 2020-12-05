package com.java.codility;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne riverOne = new FrogRiverOne();
		int X = 5;
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		riverOne.solution(X, A);
	}

	public int solution(int X, int[] A) {
		int steps = X;
		boolean[] bitmap = new boolean[steps + 1];
		for (int i = 0; i < A.length; i++) {
			if (!bitmap[A[i]]) {
				bitmap[A[i]] = true;
				steps--;
				if (steps == 0)
					return i;
			}

		}
		return -1;
		
	}

}
