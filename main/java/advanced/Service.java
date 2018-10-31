package advanced;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private static int accountNumber = 1;
	private static Map<Integer, Account> accountList = new HashMap<>();

	private Service() {}
	


	public static Account getAccountByAccountNumber(int accountNumber) {
		return accountList.get(accountNumber);
	}

	public static void addAccount(String firstName, String secondName) {

		accountList.put(accountNumber, new Account(firstName, secondName, accountNumber));
		accountNumber++;

	}

	public static void deleteAccount(int accountNumber) {
		accountList.remove(accountNumber);
	}
	
	public static String showAccount(int accountNumber) {
		return accountNumber + ": " + getAccountByAccountNumber(accountNumber).toString();
		
	}



	public static int getCountByName(String name) {
		int count = 0;
		int stepper = 1;
		while (stepper < accountNumber) {
			if (accountList.get(stepper).getFirstName().equals(name)) {
				count ++;
			}
			stepper ++;
		}
		return count;
	}
}
