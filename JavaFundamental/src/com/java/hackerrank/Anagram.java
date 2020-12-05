package com.java.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String a, String b) {
        char[] aa=a.toLowerCase().toCharArray();
        char[] bb=b.toLowerCase().toCharArray();
        
        Arrays.sort(aa);
        Arrays.sort(bb);
        return Arrays.equals(aa, bb);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
