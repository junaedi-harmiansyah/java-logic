package com.java.codility;

import java.util.HashSet;
import java.util.Set;

public class PermutationMissingElement {
	public static void main(String[] args) {
		PermutationMissingElement element = new PermutationMissingElement();
		int[] A = { 2, 3, 1, 5 };
		element.solution(A);
	}

	public int solution(int[] A) {
		int max = A.length + 1;
		int result = 0;
		Set completeSet = new HashSet();
		for (int i = 0; i < A.length; i++) {
			completeSet.add(A[i]);
		}
		for (int i = 1; i < max + 1; i++) {
			if (!completeSet.contains(i)) {
				result = (i);
			}
		}
		return result;
	}
}
