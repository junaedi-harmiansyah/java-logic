package com.java.logic;

import java.util.Scanner;

public class SilangGanjil {
	

	
	public static void main (String [] args){
		for (int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if (i==j)
					System.out.print(i*1 + (i+1));
				else if (i== (10-1)-j)
					System.out.print(j*1 + (j+1));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
