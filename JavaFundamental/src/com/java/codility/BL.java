package com.java.codility;


//test di buka lapak , penyisipan abjad berdasarkan jumlah angka inputan
public class BL {

	public static void main(String[] args) {
		BL jwb = new BL();
		jwb.answer(5, 4);
	}

	private void answer(int A, int B) {
		String aResult = "";
		String bResult = "";
		StringBuffer formatedA = new StringBuffer();
		StringBuilder formatedB = new StringBuilder();

		for (int i = 0; i < A; i++) {
			aResult = aResult + "a";
		}
		for (int i = 0; i < B; i++) {
			bResult = bResult + "b";
		}

		boolean cek = false;
		for (int i = 0; i < aResult.length(); i++) {

			if (A == B) {
				if (i % 2 == 0 && i > 0) {

					for (int j = 0; j < bResult.length(); j++) {
						if (j < 1) {
							formatedA.append(bResult.charAt(j));
						}
					}

				} else {
					for (int j = 0; j < bResult.length(); j++) {
						if (j < 1) {
							formatedA.append(bResult.charAt(j));
						}
					}
				}

			} else if (A > B) {
				if (i % 2 == 0 && i > 0) {

					for (int j = 0; j < bResult.length(); j++) {
						if (j < 1) {
							formatedA.append(bResult.charAt(j));
						}
					}

				}

				if (i % 2 == 0 && i == (aResult.length() - 1)) {
					for (int j = 0; j < bResult.length(); j++) {
						if (j < 1) {
							formatedA.append(bResult.charAt(j));
						}
					}
				}
			} else if (A < B) {
				cek = true;
				for (int j = 0; j < bResult.length(); j++) {
					if (j % 2 == 0 && j > 0) {

						for (int k = 0; k < aResult.length(); k++) {
							if (k < 1) {
								formatedA.append(aResult.charAt(k));
							}
						}

					}

					if (j % 2 == 0 && j == (bResult.length() - 1)) {
						for (int k = 0; k < bResult.length(); k++) {
							if (k < 1) {
								formatedA.append(bResult.charAt(k));
							}
						}
					}
					formatedA.append(bResult.substring(i, i + 1));
				}
			}
			if (cek) {

			} else {
				formatedA.append(aResult.substring(i, i + 1));
			}
		}
		System.out.println(formatedA.reverse());

	}
}
