package com.java.codility;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	public static void main(String[] args) {
		Integer[] a = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };
	//	Arrays.sort(a);
		Integer[] b = a;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int j = 0; j < b.length; j++) {
			Integer count = map.get(b[j]);
			if (count == null) {
				map.put(b[j], 1);
			} else {
				map.put(b[j], count + 1);
			}
		}
		int pairs = 0;
		for (Integer frequency : map.values()) {
			pairs += frequency >> 1;
		}
		System.out.println(pairs);
	}
}
