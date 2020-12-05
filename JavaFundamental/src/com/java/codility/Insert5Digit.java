package com.java.codility;

public class Insert5Digit {

	public static void main(String[] args) {
		Insert5Digit digit = new Insert5Digit();
		System.out.println(digit.solution(782));
	}

	public int solution(int N) {
		{
			if (N == 0) {
				return 5 * 10;
			}
			int negative = N / Math.abs(N);
			N = Math.abs(N);
			int n = N;
			int maxVal = Integer.MIN_VALUE;
			int counter = 0;
			int position = 1;

			while (n > 0) {
				counter++;
				n = n / 10;
			}

			for (int i = 0; i <= counter; i++) {
				int newVal = ((N / position) * (position * 10)) + (5 * position) + (N % position);

				if (newVal * negative > maxVal) {
					maxVal = newVal * negative;
				}

				position = position * 10;
			}

			return maxVal;
		}
	}
}
