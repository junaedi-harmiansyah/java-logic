package com.java.codility;

public class RotateArray {

	public static void main(String[] args) {
		int[] A = new int[] { 3, 8, 9, 7, 6};
		int K = 3;
		RotateArray rotateArray = new RotateArray();
		rotateArray.solution(A, K);
		
	}
	public int[] solution(int[] A, int K) {
		
		System.out.println("Original array: ");    
        for (int i = 0; i < A.length; i++) {     
            System.out.print(A[i] + " ");     
        }    
        for(int i=0; i<K; i++){
            int in, end;
            end = A[A.length-1];
            for(in = A.length-1; in>0;in--){
                A[in] =A[in-1];
            }
            A[0] = end;
        }
        
        System.out.println();    
            
        
        for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		return A;
    }

}
