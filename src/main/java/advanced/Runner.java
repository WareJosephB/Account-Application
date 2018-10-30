package advanced;

import java.util.Scanner;

public class Runner {
	

	private Runner() {
	}


	public static void main(String[] args) {
		System.out.println(
				"Please enter either 'D(elete) {account number}', 'A(dd) {firstname}, {secondname}', 'R(etrieve) {account number}', 'J(SON output) [optional account number]' or 'Q(uit)'");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String i = scanner.nextLine();
			if ("q".equalsIgnoreCase(i)) {
				break;
			}
			Service.systemRun(i);

		}
		scanner.close();

	}
}
