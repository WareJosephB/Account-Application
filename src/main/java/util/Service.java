package com.qa.util;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.qa.domain.persistence.Account;

public class Service {

	private static int accountNumber = 1001;
	
	private static Map<Integer, Account> accountList = new HashMap<>();

	private Service() {
	}
	
	@GET
	public static Account getAccountByAccountNumber(int accountNumber) {
		return accountList.get(accountNumber);
	}

	@POST
	public static void addAccount(String firstName, String secondName) {

		accountList.put(accountNumber, new Account(firstName, secondName, Integer.toString(accountNumber)));
		accountNumber++;

	}
	@DELETE
	public static void deleteAccount(int accountNumber) {
		accountList.remove(accountNumber);
	}
	
	@GET
	public static String showAccount(int accountNumber) {
		return accountNumber + ": " + getAccountByAccountNumber(accountNumber).toString();

	}
	
	@GET
	public static int getCountByName(String name) {
		return (int) accountList.entrySet().stream().filter(w -> w.getValue().getFirstName() == name).count();
	}
}
