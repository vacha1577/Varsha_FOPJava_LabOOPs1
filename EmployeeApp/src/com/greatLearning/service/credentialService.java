package com.greatLearning.service;

import java.util.Random;
import com.greatLearning.entity.Employee;

public class credentialService {

	private static final String DOMAIN_NAME = "abc.com";
	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "1234567890";
	private static final String SPECIAL_CHARS = "!@#$%^&*()_-";

	public static String generatePassword() {
		String value = UPPER_CASE + LOWER_CASE + NUMBERS + SPECIAL_CHARS;
		Random random = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			password[i] = value.charAt(random.nextInt(value.length()));
		}
		System.out.println("Password generated is " + String.valueOf(password));
		return String.valueOf(password);

	}

	public static String generateEmailAddress(String firstName, String lastName, String department) {
		String emailAddress = firstName + lastName + "@" + department + DOMAIN_NAME;
		return emailAddress;

	}

	public void showCredentials(String firstName, String email) {

		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email ---> " + email);

		generatePassword();
	}

}
