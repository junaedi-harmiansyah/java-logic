package com.java.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UjianGrab {

	public static void main(String[] args) {
		UjianGrab a = new UjianGrab();
		int[] a1 = { 5, 4, 4, 5, 0, 12 };
		a.solution(a1);

	}

	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		Arrays.sort(A);
		Boolean ok = false;
		int hasil = 0;
		for (int i1 : A) {
			set.add(i1);

		}
		for (Integer integer : set) {
			for (int k = 0; k < A.length; k++) {
				if (integer== A[k]) {
					ok = true;
					hasil ++;
				}else {
					ok=false;
				}
			}
			if (ok) {
				hasil ++;
			}
		}

		System.out.println(hasil);
		return hasil;
	}
}
