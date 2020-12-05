package com.java.codility;


import java.util.Arrays;
import java.util.Collections;

public class Insert5DigitVersiRangga {

	public static void main(String[] args) {
		Insert5DigitVersiRangga a = new Insert5DigitVersiRangga();
		System.out.println(a.solution(670));
	}

	public int solution(int N) {

		Integer result = 0;
		Boolean isMinus = false;
		Integer lengthValue = 0;
		if (N < 0) {
			isMinus = true;
			N = Math.abs(N);
		}
		String n = String.valueOf(N);
		lengthValue = n.length() + 1;
		Integer[] arrayResult = new Integer[lengthValue];

		for (int i = 0; i < lengthValue; i++) {
			arrayResult[i] = Integer.valueOf(n.substring(0, i) + "5"
					+ n.substring(i));
		}

		Arrays.sort(arrayResult);

		if (isMinus) {
			result = Collections.min(Arrays.asList(arrayResult));
			result = -result;
		} else {
			result = Collections.max(Arrays.asList(arrayResult));
		}

		return result;
	}

}