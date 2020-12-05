package com.java.codility;

public class Garden {
	public static void main(String[] args) {
		Garden garden = new Garden();
		int[] A = { 5, 3, 7 };
		System.out.println(garden.solution(A));
	}

	public int solution(int[] A) {
		if (isCekArray(A)) {
			// bila pohon sudah sesuai akan di balikan 0, sehingga tidak ada
			// kemungkinan di potong
			return 0;
		}

		int arrayCount = 0;
		for (int i = 0; i < A.length; i++) {
			// copy array selain indek i untuk proses cek array
			int[] a = copyArrayElement(A, i);
			if (isCekArray(a)) {
				// jumlah pohon yang di tebang
				arrayCount++;
			}
		}

		if (arrayCount == 0) {
			// karena pohon tidak ada yang bisa tampak indak, karena berurutan
			// grow
			return -1;
		} else {
			// pohon yang di tebang di array
			return arrayCount;
		}
	}

	private int[] copyArrayElement(int[] array, int indexByRemove) {
		int arrayLength = array.length;
		int[] newArray = new int[arrayLength - 1];
		int temp = 0;
		for (int j = 0; j < arrayLength; j++) {
			if (j != indexByRemove) {
				newArray[temp++] = array[j];
			}
		}
		return newArray;
	}

	/*
	 * cek array pohon berdasarkan ketingian secara berurutan dari mulai indek 0
	 * sampai akhir bila ketingian sudah sesaui array yaitu {H,L,H,L} atau {L,H,L,H}
	 * H=tinggi, L=pendek maka akan di balikan return true, dan bila ada selisih
	 * pohon yang tidak sesuai akan di balikan false
	 */
	private boolean isCekArray(int[] array) {
		int arrayLength = array.length;
		int insaide = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (insaide == 0) {
				if (array[i] < array[i + 1]) {
					insaide = 1;
				} else {
					insaide = 2;
				}
			} else {
				if (insaide == 1) {
					if (i % 2 == 1 && array[i] > array[i - 1]) {

					} else if (i % 2 == 0 && array[i] < array[i - 1]) {

					} else {
						return false;
					}
				} else {
					if (i % 2 == 1 && array[i] < array[i - 1]) {

					} else if (i % 2 == 0 && array[i] > array[i - 1]) {

					} else {
						return false;
					}
				}
			}
		}
		return true;

	}
}