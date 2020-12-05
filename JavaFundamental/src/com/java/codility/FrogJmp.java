package com.java.codility;

public class FrogJmp {
	public static void main(String[] args) {
		FrogJmp jmp = new FrogJmp();
		jmp.solution(10, 85, 30);
	}

	public int solution(int X, int Y, int D) {
		int kekuaranganJarak = Y - X;
		int minimalLompat = kekuaranganJarak / D;
		if (kekuaranganJarak % D != 0) {
			minimalLompat++;
		}
		return minimalLompat;
	}
}
