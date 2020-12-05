package com.java.codility;

public class PermChack {
	
	public static void main(String[] args) {
		PermChack chack = new PermChack();
		int[] A = {4,1,3,2};
		System.out.println(chack.solution(A));
	}
	 public int solution(int[] A) {
	        final int N = A.length;
	        long sum = N * (N+1)/2;

	        for(int i=0; i<A.length; i++) {
	        	sum -= A[i];
	        }

	        return sum == 0 ? 1 : 0;
	    }

}
