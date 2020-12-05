package com.java.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesbyMatch {

	static int pairs;

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int[] b = ar;
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
        for (Integer fre : map.values()) {
            pairs += fre >> 1;
        }
        System.out.println(pairs);

		return pairs;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		SalesbyMatch byMatch = new SalesbyMatch();
		int[] A = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3, 2, 1};
		byMatch.sockMerchant(10, A);
	}
	
}
