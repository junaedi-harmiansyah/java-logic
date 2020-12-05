package com.java.hackerrank;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFormat {

	public static void main(String[] args) {
		RandomFormat cobaJun = new RandomFormat();
		// System.out.println(cobaJun.generateCode());
		cobaJun.formatingString("123a4ls5nd678099");
		
	}

	public static String generateCode() {

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String fullalphabet = alphabet + alphabet.toLowerCase() + "123456789";
		Random random = new Random();

		char code = fullalphabet.charAt(random.nextInt(9));

		return Character.toString(code);
	}

	public static String cek() {
		SecureRandom secureRandom = new SecureRandom();
		String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		StringBuilder generatedString = new StringBuilder();
		for (int i = 0; i < CHARACTERS.length(); i++) {
			int randonSequence = secureRandom.nextInt(CHARACTERS.length());
			generatedString.append(CHARACTERS.charAt(randonSequence));
			System.out.println(generatedString.toString());
		}
		return CHARACTERS;
	}

	public static char deferent() {
		String input = "123a4ls5nd67890";
		int rnd = (int) (Math.random() * 52); // or use Random or whatever
		char base = (rnd < 26) ? 'A' : 'a';
		return (char) (base + rnd % 26);
	}

	public static String formatingString(String input) {
		List<String> stringValue = new ArrayList<String>();
		List<String> integerValue = new ArrayList<String>();
		for (int j = 0; j < input.length(); j++) {
			for (int i = 0; i < input.length(); i++) {
				String cek = Character.toString(input.charAt(i));
				if (input.charAt(j) == input.charAt(i) && cek.matches("[a-zA-Z]")) {
					stringValue.add(cek);
				}
				if (input.charAt(j) == input.charAt(i) && cek.matches("[0-9]")) {
					integerValue.add(cek);
				}
			}
		}
		List<String> stringCode = new ArrayList<String>();
		if (integerValue.size() % 2 == 0) {

			for (int i = 0; i < integerValue.size(); i++) {
				if (i == 3 || i == 6 || i == 8) {
					stringCode.add("-");
				}
				stringCode.add(integerValue.get(i));
			}
		} else {
			for (int i = 0; i < integerValue.size(); i++) {
				if (i == 3 || i == 6) {
					stringCode.add("-");
				}
				stringCode.add(integerValue.get(i));
			}
		}
		StringBuilder sql = new StringBuilder();
		for (int i = 0; i < stringCode.size(); i++) {
			sql.append(stringCode.get(i));
		}
		System.out.println(sql);
		return null;

	}

}
