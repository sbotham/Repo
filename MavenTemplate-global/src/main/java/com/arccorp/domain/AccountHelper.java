package com.arccorp.domain;

import java.util.ArrayList;
import java.util.List;

public class AccountHelper {
	public List<Account> initAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(new Account("1", "Steves Account"));
		accounts.add(new Account("2", "Bobs Account"));
		accounts.add(new Account("3", "Freds Account"));
		
		System.out.println(accounts.size());
		return accounts;
		}
}
