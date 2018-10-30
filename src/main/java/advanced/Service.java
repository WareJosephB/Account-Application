package advanced;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class Service {

	private static int accountNumber = 1;
	private static Map<Integer, Account> accountList = new HashMap<>();

	private Service() {
	}

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

	public static void getJSON() {
		JSONObject json = new JSONObject(accountList);
		System.out.println(json);
	}
	
	public static void getJSON(int i) {
		JSONObject json = new JSONObject(accountList.get(i));
		System.out.println(json);
	}


	public static void systemRun(String input) {
		switch (input.toLowerCase().substring(0, 1)) {
		case "a":
			Service.addAccount(input.substring(2).split(", ")[0], input.substring(2).split(", ")[1]);
			break;
		case "d":
			Service.deleteAccount(Integer.valueOf(input.substring(2)));
			break;
		case "r":
			System.out.println(Service.getAccountByAccountNumber(Integer.parseInt(input.substring(2))));
			break;
		case "j":
			if (input.length() > 1) {
				getJSON(Integer.valueOf(input.substring(2)));
			} else {
				getJSON();
			}
			break;
		default:
			System.out.println("Error");
			break;

		}
	}

}
