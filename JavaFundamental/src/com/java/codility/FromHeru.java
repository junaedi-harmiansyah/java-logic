package com.java.codility;

public class FromHeru {
	public static void main(String[] args) {
		FromHeru jwb = new FromHeru();
		int a = 249;
		System.out.println(a);
	}

	private String answerDong(String a) {
		String regex = "[0-9]";
		String phoneNumber = "";
		StringBuilder formatedPhoneNumber = new StringBuilder();
		boolean isTwoDigit = false;
		int counter = 1;
		for (int i = 0; i < a.length(); i++) {
			if (a.substring(i, i + 1).matches(regex)) {
				phoneNumber = phoneNumber + a.substring(i, i + 1);
			}
		}

		System.out.println("length : " + phoneNumber.length());
		if (phoneNumber.length() % 3 == 1) {
			isTwoDigit = true;
		}
		for (int i = 0; i < phoneNumber.length(); i++) {
			if (isTwoDigit) {
				if (i > phoneNumber.length() - 4) {
					if (counter % 2 == 0) {
						formatedPhoneNumber.append("-");
					}
					counter++;
				} else {
					if (i % 3 == 0 && i > 0) {
						formatedPhoneNumber.append("-");
					}
				}
			} else {
				if (i % 3 == 0 && i > 0) {
					formatedPhoneNumber.append("-");
				}
			}
			formatedPhoneNumber.append(phoneNumber.substring(i, i + 1));
		}
		return formatedPhoneNumber.toString();
	}

}
