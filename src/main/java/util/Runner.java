package com.qa.util;

import java.util.Scanner;

public class Runner {
	
	private Runner() {}

	public static void main(String[] args) {
		System.out.println(
				"Please enter either 'Delete {account number}', 'Add {firstname}, {secondname}' or 'Retrieve {account number}', or 'Quit'");
		while (true) {

			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			if ("delete".equalsIgnoreCase(input.substring(0, 6))) {
				Service.deleteAccount(Integer.parseInt(input.substring(7)));
			} else if ("add".equalsIgnoreCase(input.substring(0, 3))) {
				String[] name = input.substring(4).split(", ");
				Service.addAccount(name[0], name[1]);

			} else if ("retrieve".equalsIgnoreCase(input.substring(0, 8))) {
				System.out.println(Service.getAccountByAccountNumber(Integer.parseInt(input.substring(9))));
			} else if (input.toLowerCase().startsWith("quit")) {
				sc.close();
				break;

			} else {
				System.out.println("Input not understood.");
			}

		}

	}

}
