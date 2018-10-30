package advanced;

import java.util.HashMap;
import java.util.Map;

public class service {

	private static int N = 1;

	private static Map<Integer, Account> accountList = new HashMap<Integer, Account>();

	public static Account getAccountByAccountNumber(int accountNumber) {
		return accountList.get(accountNumber);
	}

	public static void addAccount(String firstName, String secondName) {

		accountList.put(N, new Account(firstName, secondName));
		N++;

	}

	public static void deleteAccount(int accountNumber) {
		accountList.remove(accountNumber);
	}
	
	public static String showAccount(int accountNumber) {
		return accountNumber + ": " + getAccountByAccountNumber(accountNumber).toString();
		
	}
}
