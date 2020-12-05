package com.java.codility;

public class MissingInteger {

	public static void main(String[] args) {
		MissingInteger integer = new MissingInteger();
		int[] A = {1,3,6,4,1,2};
		System.out.println(integer.solution(A));
	}

	public int solution(int[] A) {
		int A_N = A.length;
		boolean[] B = new boolean[A_N + 1];
		int B_N = B.length;

		// iterate through A and update B accordingly
		for (int i = 0; i < A_N; i++) {
			// if a value is greater than 0 (since we only care about positive values)
			// AND if value is within B's range
			if (A[i] > 0 && A[i] < B_N) {
				// update B to show that A contains that number
				B[A[i]] = true;
			}
		}
		// iterate through Boolean array B
		for (int i = 1; i < B_N; i++) {
			// return the first value in B that is false
			if (B[i] == false) {
				return i;
			}
		}

		// if all of the values inside B are true(except 0), then we return the next
		// biggest integer
		return B_N;
	}
}
