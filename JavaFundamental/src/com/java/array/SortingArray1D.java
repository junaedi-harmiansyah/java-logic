package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray1D {
	
	public static void main(String[] args) {
		
		int jmlh_data;
		
		Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah data : ");
        jmlh_data = sc.nextInt();
        int data [] = new int[jmlh_data];
        
        for (int i=0; i<jmlh_data; i++){
            System.out.printf("masukkan data ke-%d: ",(i+1));
            data[i] = sc.nextInt();         
        }
        
        sc.close();
        Arrays.sort(data);
 
        System.out.println("Sorting Array");
        for (int m: data){
            System.out.print(m+" ");
        }
     
	}

}
