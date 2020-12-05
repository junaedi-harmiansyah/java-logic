package com.java.codility;

import java.util.HashSet;
import java.util.Set;

public class ArmySoldier {
	public static void main(String[] args) {
		ArmySoldier armySoldier= new ArmySoldier();
		int[]A = {4,4,3,3,1,0};
		System.out.println(armySoldier.solution(A));
	}
	
	public int solution(int[] ranks) {
        // write your code in Java SE 8
        int sum = 0;
        Set<Integer> soldierRank =  new HashSet<Integer>();
        
        for (int i = 0; i< ranks.length; i++) {
            soldierRank.add(ranks[i]);
        }
        
        for(int k = 0; k < ranks.length; k++){
            if(soldierRank.contains(ranks[k]+1)){
                sum++;
            }
        }
        
        return sum;
    }

}
