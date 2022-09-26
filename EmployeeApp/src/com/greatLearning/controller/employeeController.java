package com.greatLearning.controller;

import com.greatLearning.service.credentialService;

import java.util.Scanner;
import com.greatLearning.entity.Employee;
import com.greatLearning.service.credentialService;

public class employeeController {

	public static void main(String[] args) {

		credentialService cs = new credentialService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name");
		String firstName = scanner.next();

		System.out.println("Please enter last name");
		String lastName = scanner.next();
		String generatedEmail = "";
		int option;

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		do {
			option = sc.nextInt();

			if (option == 1) {
				generatedEmail = credentialService.generateEmailAddress(firstName, lastName, "technical.");

			} else if (option == 2) {
				generatedEmail = credentialService.generateEmailAddress(firstName, lastName, "admin.");

			} else if (option == 3) {
				generatedEmail = credentialService.generateEmailAddress(firstName, lastName, "HR.");

			} else if (option == 4) {
				generatedEmail = credentialService.generateEmailAddress(firstName, lastName, "legal.");

			} else {
				System.out.println("enter a valid option");

			}
		} while (option < 1 || option > 4);

		cs.generateEmailAddress(firstName, lastName, lastName);
		cs.showCredentials(firstName, generatedEmail);

		

	}
}
